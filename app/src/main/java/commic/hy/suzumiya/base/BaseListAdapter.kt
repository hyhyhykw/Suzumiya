package commic.hy.suzumiya.base

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import butterknife.ButterKnife
import java.util.*

/**
 * Created time : 2017/7/5 15:15.
 * 使用kotlin写的适配器基类，子类在泛型中定义好数据类型
 * 以及重写{#link layout()}和createViewHolder()方法
 * 在重写的ViewHolder方法bind中设置视图数据
 *
 * @author HY
 * @see layout
 * @see createViewHolder
 * @param T 数据类型
 * @param V ViewHolder
 */
abstract class BaseListAdapter<T, out V : BaseListAdapter.BaseViewHolder> : BaseAdapter() {
    private val mData = ArrayList<T>()
    private var mContext: Context? = null

    fun reset(data: ArrayList<T>) {
        mData.clear()
        add(data)
    }

    fun add(data: ArrayList<T>) {
        mData.addAll(data)
        notifyDataSetChanged()
    }

    fun getContext(): Context? {
        return mContext
    }

    fun getData(): ArrayList<T> {
        return mData
    }

    override fun getItem(position: Int): T {
        return mData.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return mData.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val vh: BaseViewHolder?

        if (null === mContext) mContext = parent!!.context

        var itemView: View? = convertView

        if (null === itemView) {
            itemView = LayoutInflater.from(mContext).inflate(layout(), parent, false)
            vh = createViewHolder(itemView!!)
            itemView.tag = vh
        } else vh = itemView.tag as BaseViewHolder

        vh.bind(position)

        return itemView
    }

    @LayoutRes
    protected abstract fun layout(): Int

    protected abstract fun createViewHolder(view: View): V

    abstract class BaseViewHolder (itemView: View) {
        protected var itemView: View = null!!

        init {
            this.itemView = itemView
            ButterKnife.bind(this, itemView)
        }

        abstract fun bind(position: Int)
    }


    protected fun to(clazz: Class<out Activity>) {
        to(clazz, null)
    }

    protected fun to(clazz: Class<out Activity>, bundle: Bundle?) {
        to(clazz, bundle, null)
    }

    protected fun to(clazz: Class<out Activity>, bundle: Bundle?, uri: Uri?) {
        val intent: Intent = Intent(mContext, clazz)
        if (null != bundle)
            intent.putExtra("bundle", bundle)
        if (null != uri)
            intent.data = uri

        mContext!!.startActivity(intent)
    }

}
