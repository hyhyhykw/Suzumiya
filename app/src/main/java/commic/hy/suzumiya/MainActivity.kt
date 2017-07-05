package commic.hy.suzumiya

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import commic.hy.suzumiya.hdimage.HDImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        iv_move.setImageURI("res:///" + R.drawable.vote)
        iv_move.imageURI = "res:///" + R.drawable.vote

    }

    var HDImageView.imageURI: String
        set(value) = setImageURI(value)
        get() = imageSource.uri.toString()
}
