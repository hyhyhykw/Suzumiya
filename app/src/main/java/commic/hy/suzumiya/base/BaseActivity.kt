package commic.hy.suzumiya.base

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.inputmethod.InputMethodManager
import commic.hy.suzumiya.utils.Logger

/**
 * Created time : 2017/7/5 14:37.
 * activity 基类
 *
 * @author HY
 */

open class BaseActivity : AppCompatActivity() {

    //隐藏键盘
    protected fun hideInput() {
        (getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager)
                .hideSoftInputFromWindow(currentFocus!!
                        .windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
    }

    protected fun to(cla: Class<out Activity>) {
        to(cla, null)
    }

    protected fun to(cla: Class<out Activity>, bundle: Bundle? = null) {
        to(cla, bundle, null)
    }

    protected fun to(cla: Class<out Activity>, bundle: Bundle? = null, uri: Uri? = null) {
        val intent: Intent = Intent(this, cla)
        if (null != bundle)
            intent.putExtra("bundle", bundle)
        if (null != uri)
            intent.data = uri

        startActivity(intent)
    }

    override fun onRestart() {
        super.onRestart()
        Logger.d("onRestart")
    }

    override fun onResume() {
        super.onResume()
        Logger.d("onResume")
    }

    override fun onStart() {
        super.onStart()
        Logger.d("onStart")
    }

    override fun onStop() {
        super.onStop()
        Logger.d("onStop")
    }

    override fun onPause() {
        super.onPause()
        Logger.d("onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Logger.d("onDestroy")
    }
}
