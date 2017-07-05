package commic.hy.suzumiya.config

import android.os.Bundle
import commic.hy.suzumiya.R
import commic.hy.suzumiya.base.BaseActivity
import commic.hy.suzumiya.utils.ToastWrapper
import kotlinx.android.synthetic.main.activity_setting.*
import org.jetbrains.anko.toast

/**
 * Created time : 2017/7/5 17:25.
 * @author HY
 */
class SettingActivity : BaseActivity() {


    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        lyt_always_on.setOnClickListener {
            chb_on.isChecked = !chb_on.isChecked
        }
        lyt_click_turn.setOnClickListener {
            chb_turn.isChecked = !chb_turn.isChecked
        }
        tv_txt_size.setOnClickListener {
            toast("设置字体大小")
        }
        tv_restore.setOnClickListener {
            toast("恢复默认设置")
        }

    }

}