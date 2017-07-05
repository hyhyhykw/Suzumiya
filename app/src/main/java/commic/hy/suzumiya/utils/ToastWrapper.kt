package commic.hy.suzumiya.utils

import android.annotation.SuppressLint
import android.content.Context
import android.os.Handler
import android.os.Looper
import android.support.annotation.StringRes
import android.widget.Toast

/**
 * Created time : 2017/5/10 8:30.
 * Toast的包装类，只需要在Application中初始化一次
 *  可以直接在子线程弹出吐司
 *
 * @author HY
 * @see Toast
 */
object ToastWrapper {


    @SuppressLint("StaticFieldLeak")
    private var sContext: Context? = null
    private var sToast: Toast? = null

    @SuppressLint("ShowToast")
    fun init(context: Context) {
        sContext = context
        sToast = Toast.makeText(sContext, "", Toast.LENGTH_SHORT)
    }

    fun show(@StringRes resId: Int, vararg args: Any) {
        val text = sContext!!.getString(resId, *args)
        show(text)
    }

    fun show(msg: String, vararg args: Any) {
        if (null == sContext)
            throw NullPointerException("You must use init() first to initialize the member Context")

        val text = String.format(msg, *args)

        mHandler.post {
            sToast!!.setText(text)
            sToast!!.show()
        }
    }

    private val mHandler = Handler(Looper.getMainLooper())

}
