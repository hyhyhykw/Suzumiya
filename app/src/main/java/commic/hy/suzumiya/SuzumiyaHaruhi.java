package commic.hy.suzumiya;

import android.app.Application;

import commic.hy.suzumiya.utils.ToastWrapper;

/**
 * Created time : 2017/7/3 17:12.
 *
 * @author HY
 */

public class SuzumiyaHaruhi extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ToastWrapper.init(this);
    }
}
