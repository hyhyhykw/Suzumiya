package commic.hy.suzumiya.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.widget.Toast;

/**
 * Created time : 2017/5/10 8:30.
 * Toast的包装类，只需要在Application中初始化一次
 *
 * @author HY
 */
public class ToastWrapper {

    @SuppressLint("StaticFieldLeak")
    private static Context sContext;
    private static Toast sToast;


    private ToastWrapper() {
        throw new UnsupportedOperationException("This class cannot be instantiation!");
    }

    @SuppressLint("ShowToast")
    public static void init(Context context) {
        sContext = context;
        sToast = Toast.makeText(sContext, "", Toast.LENGTH_SHORT);
    }


    public static void show(@StringRes int resId, Object... args) {
        if (null == sContext)
            throw new NullPointerException("You must use init() first to initialize the member Context");
        try {
            String text = sContext.getString(resId, args);
            show(text);
        } catch (Exception e) {
            show(String.valueOf(resId));
            Logger.v(e);
        }
    }

    public static void show(@NonNull String msg, Object... args) {
        String text = String.format(msg, args);
        show(text);
    }

    public static void show(final byte msg) {
        show(String.valueOf(msg));
    }

    public static void show(final short msg) {
        show(String.valueOf(msg));
    }

    public static void show(final char msg) {
        show(String.valueOf(msg));
    }

    public static void show(final boolean msg) {
        show(String.valueOf(msg));
    }

    public static void show(final float msg) {
        show(String.valueOf(msg));
    }

    public static void show(final double msg) {
        show(String.valueOf(msg));
    }

    public static void show(final long msg) {
        show(String.valueOf(msg));
    }

    public static void show(final Object msg) {
        show(String.valueOf(msg));
    }

    public static void show(final String msg) {
        if (null == sContext)
            throw new NullPointerException("You must use init() first to initialize the member Context");
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                sToast.setText(msg);
                sToast.show();
            }
        });

    }

    private static Handler mHandler = new Handler(Looper.getMainLooper());
}
