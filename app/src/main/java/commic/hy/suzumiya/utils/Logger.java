package commic.hy.suzumiya.utils;

import android.util.Log;

import commic.hy.suzumiya.BuildConfig;


/**
 * Created time : 2017/5/10 9:00.
 * 日志打印的封装类
 *
 * @author HY
 */
@SuppressWarnings({"all"})
public class Logger {

    private static final String TAG = Logger.class.getSimpleName();

    private static final boolean IS_DEBUG = true;

    private Logger() {
    }

    private static String addThreadInfo(final String msg) {
        final String threadName = Thread.currentThread().getName();
        final String shortName = threadName.startsWith("OkHttp") ? "OkHttp" : threadName;
        return "[" + shortName + "] " + msg;
    }

    /*
        Verbose log
    */
    public static void v(final int msg) {
        v(String.valueOf(msg));
    }

    public static void v(final int msg, final Throwable tr) {
        v(String.valueOf(msg), tr);
    }

    public static void v(final char msg) {
        v(String.valueOf(msg));
    }

    public static void v(final char msg, final Throwable tr) {
        v(String.valueOf(msg), tr);
    }

    public static void v(final short msg) {
        v(String.valueOf(msg));
    }

    public static void v(final short msg, final Throwable tr) {
        v(String.valueOf(msg), tr);
    }

    public static void v(final byte msg) {
        v(String.valueOf(msg));
    }

    public static void v(final byte msg, final Throwable tr) {
        v(String.valueOf(msg), tr);
    }

    public static void v(final long msg) {
        v(String.valueOf(msg));
    }

    public static void v(final long msg, final Throwable tr) {
        v(String.valueOf(msg), tr);
    }

    public static void v(final double msg) {
        v(String.valueOf(msg));
    }

    public static void v(final double msg, final Throwable tr) {
        v(String.valueOf(msg), tr);
    }

    public static void v(final float msg) {
        v(String.valueOf(msg));
    }

    public static void v(final float msg, final Throwable tr) {
        v(String.valueOf(msg), tr);
    }

    public static void v(final boolean msg) {
        v(String.valueOf(msg));
    }

    public static void v(final boolean msg, final Throwable tr) {
        v(String.valueOf(msg), tr);
    }

    public static void v(final Object msg) {
        v(String.valueOf(msg));
    }

    public static void v(final Object msg, final Throwable tr) {
        v(String.valueOf(msg), tr);
    }

    public static void v(final String msg) {
        v(msg, null);
    }

    public static void v(final String msg, final Throwable tr) {
        if (IS_DEBUG && BuildConfig.DEBUG) {
            Log.v(TAG, addThreadInfo(msg), tr);
        }
    }

    /*
        Debug log
    */
    public static void d(final int msg) {
        d(String.valueOf(msg));
    }

    public static void d(final int msg, final Throwable tr) {
        d(String.valueOf(msg), tr);
    }

    public static void d(final char msg) {
        d(String.valueOf(msg));
    }

    public static void d(final char msg, final Throwable tr) {
        d(String.valueOf(msg), tr);
    }

    public static void d(final short msg) {
        d(String.valueOf(msg));
    }

    public static void d(final short msg, final Throwable tr) {
        d(String.valueOf(msg), tr);
    }

    public static void d(final byte msg) {
        d(String.valueOf(msg));
    }

    public static void d(final byte msg, final Throwable tr) {
        d(String.valueOf(msg), tr);
    }

    public static void d(final long msg) {
        d(String.valueOf(msg));
    }

    public static void d(final long msg, final Throwable tr) {
        d(String.valueOf(msg), tr);
    }

    public static void d(final double msg) {
        d(String.valueOf(msg));
    }

    public static void d(final double msg, final Throwable tr) {
        d(String.valueOf(msg), tr);
    }

    public static void d(final float msg) {
        d(String.valueOf(msg));
    }

    public static void d(final float msg, final Throwable tr) {
        d(String.valueOf(msg), tr);
    }

    public static void d(final boolean msg) {
        d(String.valueOf(msg));
    }

    public static void d(final boolean msg, final Throwable tr) {
        d(String.valueOf(msg), tr);
    }

    public static void d(final Object msg) {
        d(String.valueOf(msg));
    }

    public static void d(final Object msg, final Throwable tr) {
        d(String.valueOf(msg), tr);
    }

    public static void d(final String msg) {
        d(msg, null);
    }

    public static void d(final String msg, final Throwable tr) {
        if (IS_DEBUG && BuildConfig.DEBUG) {
            Log.d(TAG, addThreadInfo(msg), tr);
        }
    }

    /*
        Info log
    */
    public static void i(final int msg) {
        i(String.valueOf(msg));
    }

    public static void i(final int msg, final Throwable tr) {
        i(String.valueOf(msg), tr);
    }

    public static void i(final char msg) {
        i(String.valueOf(msg));
    }

    public static void i(final char msg, final Throwable tr) {
        i(String.valueOf(msg), tr);
    }

    public static void i(final short msg) {
        i(String.valueOf(msg));
    }

    public static void i(final short msg, final Throwable tr) {
        i(String.valueOf(msg), tr);
    }

    public static void i(final byte msg) {
        i(String.valueOf(msg));
    }

    public static void i(final byte msg, final Throwable tr) {
        i(String.valueOf(msg), tr);
    }

    public static void i(final long msg) {
        i(String.valueOf(msg));
    }

    public static void i(final long msg, final Throwable tr) {
        i(String.valueOf(msg), tr);
    }

    public static void i(final double msg) {
        i(String.valueOf(msg));
    }

    public static void i(final double msg, final Throwable tr) {
        i(String.valueOf(msg), tr);
    }

    public static void i(final float msg) {
        i(String.valueOf(msg));
    }

    public static void i(final float msg, final Throwable tr) {
        i(String.valueOf(msg), tr);
    }

    public static void i(final boolean msg) {
        i(String.valueOf(msg));
    }

    public static void i(final boolean msg, final Throwable tr) {
        i(String.valueOf(msg), tr);
    }

    public static void i(final Object msg) {
        i(String.valueOf(msg));
    }

    public static void i(final Object msg, final Throwable tr) {
        i(String.valueOf(msg), tr);
    }

    public static void i(final String msg) {
        i(msg, null);
    }

    public static void i(final String msg, final Throwable tr) {
        if (IS_DEBUG && BuildConfig.DEBUG) {
            Log.i(TAG, addThreadInfo(msg), tr);
        }
    }

    /*
        Warn log
    */
    public static void w(final int msg) {
        w(String.valueOf(msg));
    }

    public static void w(final int msg, final Throwable tr) {
        w(String.valueOf(msg), tr);
    }

    public static void w(final char msg) {
        w(String.valueOf(msg));
    }

    public static void w(final char msg, final Throwable tr) {
        w(String.valueOf(msg), tr);
    }

    public static void w(final short msg) {
        w(String.valueOf(msg));
    }

    public static void w(final short msg, final Throwable tr) {
        w(String.valueOf(msg), tr);
    }

    public static void w(final byte msg) {
        w(String.valueOf(msg));
    }

    public static void w(final byte msg, final Throwable tr) {
        w(String.valueOf(msg), tr);
    }

    public static void w(final long msg) {
        w(String.valueOf(msg));
    }

    public static void w(final long msg, final Throwable tr) {
        w(String.valueOf(msg), tr);
    }

    public static void w(final double msg) {
        w(String.valueOf(msg));
    }

    public static void w(final double msg, final Throwable tr) {
        w(String.valueOf(msg), tr);
    }

    public static void w(final float msg) {
        w(String.valueOf(msg));
    }

    public static void w(final float msg, final Throwable tr) {
        w(String.valueOf(msg), tr);
    }

    public static void w(final boolean msg) {
        w(String.valueOf(msg));
    }

    public static void w(final boolean msg, final Throwable tr) {
        w(String.valueOf(msg), tr);
    }

    public static void w(final Object msg) {
        w(String.valueOf(msg));
    }

    public static void w(final Object msg, final Throwable tr) {
        w(String.valueOf(msg), tr);
    }

    public static void w(final String msg) {
        w(msg, null);
    }

    public static void w(final String msg, final Throwable tr) {
        if (IS_DEBUG && BuildConfig.DEBUG) {
            Log.w(TAG, addThreadInfo(msg), tr);
        }
    }

    /*
       Error log
     */
    public static void e(final int msg) {
        e(String.valueOf(msg));
    }

    public static void e(final int msg, final Throwable tr) {
        e(String.valueOf(msg), tr);
    }

    public static void e(final char msg) {
        e(String.valueOf(msg));
    }

    public static void e(final char msg, final Throwable tr) {
        e(String.valueOf(msg), tr);
    }

    public static void e(final short msg) {
        e(String.valueOf(msg));
    }

    public static void e(final short msg, final Throwable tr) {
        e(String.valueOf(msg), tr);
    }

    public static void e(final byte msg) {
        e(String.valueOf(msg));
    }

    public static void e(final byte msg, final Throwable tr) {
        e(String.valueOf(msg), tr);
    }

    public static void e(final long msg) {
        e(String.valueOf(msg));
    }

    public static void e(final long msg, final Throwable tr) {
        e(String.valueOf(msg), tr);
    }

    public static void e(final double msg) {
        e(String.valueOf(msg));
    }

    public static void e(final double msg, final Throwable tr) {
        e(String.valueOf(msg), tr);
    }

    public static void e(final float msg) {
        e(String.valueOf(msg));
    }

    public static void e(final float msg, final Throwable tr) {
        e(String.valueOf(msg), tr);
    }

    public static void e(final boolean msg) {
        e(String.valueOf(msg));
    }

    public static void e(final boolean msg, final Throwable tr) {
        e(String.valueOf(msg), tr);
    }

    public static void e(final Object msg) {
        e(String.valueOf(msg));
    }

    public static void e(final Object msg, final Throwable tr) {
        e(String.valueOf(msg), tr);
    }

    public static void e(final String msg) {
        e(msg, null);
    }

    public static void e(final String msg, final Throwable tr) {
        if (IS_DEBUG && BuildConfig.DEBUG) {
            Log.e(TAG, addThreadInfo(msg), tr);
        }
    }

}
