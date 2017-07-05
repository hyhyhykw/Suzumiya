package commic.hy.suzumiya

import android.app.Application
import commic.hy.suzumiya.config.ConfigTools

import commic.hy.suzumiya.utils.ToastWrapper

/**
 * Created time : 2017/7/3 17:12.
 * @author HY
 */

class SuzumiyaHaruhi : Application() {

    override fun onCreate() {
        super.onCreate()

        ToastWrapper.init(this)

        ConfigTools.init(this)
    }
}
