package commic.hy.suzumiya.config

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences

/**
 * Created time : 2017/7/5 13:07.
 * @author HY
 */
object ConfigTools {

    private val NAME = ConfigTools::class.java.simpleName

    private var sPreference: SharedPreferences = null!!
    private var sEditor: SharedPreferences.Editor

    @SuppressLint("CommitPrefEdits")
    fun init(context: Context) {
        sPreference = context.getSharedPreferences(NAME, Context.MODE_PRIVATE)
        sEditor = sPreference.edit()
    }

    /**
     * 保存设置
     */
    fun saveConfig(config: Config) {
        sEditor.putBoolean("isFirst", config.isFirst)
        sEditor.putBoolean("isClickTurnPage", config.isClickTurnPage)
        sEditor.putInt("chapter", config.chapter)
        sEditor.putInt("page", config.page)
        sEditor.putBoolean("isAlwaysOn", config.isAlwaysOn)
        sEditor.putFloat("textSize", config.textSize)
        sEditor.apply()
    }

    /**
     * 读取设置
     */
    fun readConfig(): Config {
        val config: Config = Config()

        config.isFirst = sPreference.getBoolean("isFirst", true)
        config.isClickTurnPage = sPreference.getBoolean("isClickTurnPage", false)
        config.chapter = sPreference.getInt("chapter", 0)
        config.page = sPreference.getInt("page", 0)
        config.isAlwaysOn = sPreference.getBoolean("isAlwaysOn", false)
        config.textSize = sPreference.getFloat("textSize", 18.toFloat())

        return config
    }

    /**
     * 恢复默认设置
     */
    fun restore() {
        sEditor.clear().apply()

        val config = Config()
        config.isFirst = false
        saveConfig(config)
    }
}

