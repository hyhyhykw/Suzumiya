package commic.hy.suzumiya.utils

import android.util.Log

import commic.hy.suzumiya.BuildConfig


/**
 * Created time : 2017/5/10 9:00.
 * 日志打印的封装类

 * @author HY
 */
object Logger {

    private val default_tag = Logger::class.java.simpleName

    private var TAG = default_tag


    private val IS_DEBUG = true

    private fun addThreadInfo(msg: String): String {
        val threadName = Thread.currentThread().name
        val shortName = if (threadName.startsWith("OkHttp")) "OkHttp" else threadName
        return "[$shortName] $msg"
    }

    fun changeTag(value: String) {
        TAG = value
    }

    /*
        Verbose log
    */
    fun v(msg: Int) {
        v(msg.toString())
    }

    fun v(msg: Int, tr: Throwable) {
        v(msg.toString(), tr)
    }

    fun v(msg: Char) {
        v(msg.toString())
    }

    fun v(msg: Char, tr: Throwable) {
        v(msg.toString(), tr)
    }

    fun v(msg: Short) {
        v(msg.toString())
    }

    fun v(msg: Short, tr: Throwable) {
        v(msg.toString(), tr)
    }

    fun v(msg: Byte) {
        v(msg.toString())
    }

    fun v(msg: Byte, tr: Throwable) {
        v(msg.toString(), tr)
    }

    fun v(msg: Long) {
        v(msg.toString())
    }

    fun v(msg: Long, tr: Throwable) {
        v(msg.toString(), tr)
    }

    fun v(msg: Double) {
        v(msg.toString())
    }

    fun v(msg: Double, tr: Throwable) {
        v(msg.toString(), tr)
    }

    fun v(msg: Float) {
        v(msg.toString())
    }

    fun v(msg: Float, tr: Throwable) {
        v(msg.toString(), tr)
    }

    fun v(msg: Boolean) {
        v(msg.toString())
    }

    fun v(msg: Boolean, tr: Throwable) {
        v(msg.toString(), tr)
    }

    fun v(msg: Any) {
        v(msg.toString())
    }

//    fun v(msg: Any, tr: Throwable) {
//        v(msg.toString(), tr)
//    }

    @JvmOverloads fun v(msg: String, tr: Throwable? = null) {
        if (IS_DEBUG && BuildConfig.DEBUG) {
            Log.v(TAG, addThreadInfo(msg), tr)
        }
    }

    /*
        Debug log
    */
    fun d(msg: Int) {
        d(msg.toString())
    }

    fun d(msg: Int, tr: Throwable) {
        d(msg.toString(), tr)
    }

    fun d(msg: Char) {
        d(msg.toString())
    }

    fun d(msg: Char, tr: Throwable) {
        d(msg.toString(), tr)
    }

    fun d(msg: Short) {
        d(msg.toString())
    }

    fun d(msg: Short, tr: Throwable) {
        d(msg.toString(), tr)
    }

    fun d(msg: Byte) {
        d(msg.toString())
    }

    fun d(msg: Byte, tr: Throwable) {
        d(msg.toString(), tr)
    }

    fun d(msg: Long) {
        d(msg.toString())
    }

    fun d(msg: Long, tr: Throwable) {
        d(msg.toString(), tr)
    }

    fun d(msg: Double) {
        d(msg.toString())
    }

    fun d(msg: Double, tr: Throwable) {
        d(msg.toString(), tr)
    }

    fun d(msg: Float) {
        d(msg.toString())
    }

    fun d(msg: Float, tr: Throwable) {
        d(msg.toString(), tr)
    }

    fun d(msg: Boolean) {
        d(msg.toString())
    }

    fun d(msg: Boolean, tr: Throwable) {
        d(msg.toString(), tr)
    }

    fun d(msg: Any) {
        d(msg.toString())
    }

//    fun d(msg: Any, tr: Throwable) {
//        d(msg.toString(), tr)
//    }

    @JvmOverloads fun d(msg: String, tr: Throwable? = null) {
        if (IS_DEBUG && BuildConfig.DEBUG) {
            Log.d(TAG, addThreadInfo(msg), tr)
        }
    }

    /*
        Info log
    */
    fun i(msg: Int) {
        i(msg.toString())
    }

    fun i(msg: Int, tr: Throwable) {
        i(msg.toString(), tr)
    }

    fun i(msg: Char) {
        i(msg.toString())
    }

    fun i(msg: Char, tr: Throwable) {
        i(msg.toString(), tr)
    }

    fun i(msg: Short) {
        i(msg.toString())
    }

    fun i(msg: Short, tr: Throwable) {
        i(msg.toString(), tr)
    }

    fun i(msg: Byte) {
        i(msg.toString())
    }

    fun i(msg: Byte, tr: Throwable) {
        i(msg.toString(), tr)
    }

    fun i(msg: Long) {
        i(msg.toString())
    }

    fun i(msg: Long, tr: Throwable) {
        i(msg.toString(), tr)
    }

    fun i(msg: Double) {
        i(msg.toString())
    }

    fun i(msg: Double, tr: Throwable) {
        i(msg.toString(), tr)
    }

    fun i(msg: Float) {
        i(msg.toString())
    }

    fun i(msg: Float, tr: Throwable) {
        i(msg.toString(), tr)
    }

    fun i(msg: Boolean) {
        i(msg.toString())
    }

    fun i(msg: Boolean, tr: Throwable) {
        i(msg.toString(), tr)
    }

    fun i(msg: Any) {
        i(msg.toString())
    }

//    fun i(msg: Any, tr: Throwable) {
//        i(msg.toString(), tr)
//    }

    @JvmOverloads fun i(msg: String, tr: Throwable? = null) {
        if (IS_DEBUG && BuildConfig.DEBUG) {
            Log.i(TAG, addThreadInfo(msg), tr)
        }
    }

    /*
        Warn log
    */
    fun w(msg: Int) {
        w(msg.toString())
    }

    fun w(msg: Int, tr: Throwable) {
        w(msg.toString(), tr)
    }

    fun w(msg: Char) {
        w(msg.toString())
    }

    fun w(msg: Char, tr: Throwable) {
        w(msg.toString(), tr)
    }

    fun w(msg: Short) {
        w(msg.toString())
    }

    fun w(msg: Short, tr: Throwable) {
        w(msg.toString(), tr)
    }

    fun w(msg: Byte) {
        w(msg.toString())
    }

    fun w(msg: Byte, tr: Throwable) {
        w(msg.toString(), tr)
    }

    fun w(msg: Long) {
        w(msg.toString())
    }

    fun w(msg: Long, tr: Throwable) {
        w(msg.toString(), tr)
    }

    fun w(msg: Double) {
        w(msg.toString())
    }

    fun w(msg: Double, tr: Throwable) {
        w(msg.toString(), tr)
    }

    fun w(msg: Float) {
        w(msg.toString())
    }

    fun w(msg: Float, tr: Throwable) {
        w(msg.toString(), tr)
    }

    fun w(msg: Boolean) {
        w(msg.toString())
    }

    fun w(msg: Boolean, tr: Throwable) {
        w(msg.toString(), tr)
    }

    fun w(msg: Any) {
        w(msg.toString())
    }

//    fun w(msg: Any, tr: Throwable) {
//        w(msg.toString(), tr)
//    }

    @JvmOverloads fun w(msg: String, tr: Throwable? = null) {
        if (IS_DEBUG && BuildConfig.DEBUG) {
            Log.w(TAG, addThreadInfo(msg), tr)
        }
    }

    /*
       Error log
     */
    fun e(msg: Int) {
        e(msg.toString())
    }

    fun e(msg: Int, tr: Throwable) {
        e(msg.toString(), tr)
    }

    fun e(msg: Char) {
        e(msg.toString())
    }

    fun e(msg: Char, tr: Throwable) {
        e(msg.toString(), tr)
    }

    fun e(msg: Short) {
        e(msg.toString())
    }

    fun e(msg: Short, tr: Throwable) {
        e(msg.toString(), tr)
    }

    fun e(msg: Byte) {
        e(msg.toString())
    }

    fun e(msg: Byte, tr: Throwable) {
        e(msg.toString(), tr)
    }

    fun e(msg: Long) {
        e(msg.toString())
    }

    fun e(msg: Long, tr: Throwable) {
        e(msg.toString(), tr)
    }

    fun e(msg: Double) {
        e(msg.toString())
    }

    fun e(msg: Double, tr: Throwable) {
        e(msg.toString(), tr)
    }

    fun e(msg: Float) {
        e(msg.toString())
    }

    fun e(msg: Float, tr: Throwable) {
        e(msg.toString(), tr)
    }

    fun e(msg: Boolean) {
        e(msg.toString())
    }

    fun e(msg: Boolean, tr: Throwable) {
        e(msg.toString(), tr)
    }

    fun e(msg: Any) {
        e(msg.toString())
    }

//    fun e(msg: Any, tr: Throwable) {
//        e(msg.toString(), tr)
//    }

    @JvmOverloads fun e(msg: String, tr: Throwable? = null) {
        if (IS_DEBUG && BuildConfig.DEBUG) {
            Log.e(TAG, addThreadInfo(msg), tr)
        }
    }

}
