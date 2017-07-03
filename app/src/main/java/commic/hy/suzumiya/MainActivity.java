package commic.hy.suzumiya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import commic.hy.suzumiya.hdimage.HDImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HDImageView iv= (HDImageView) findViewById(R.id.iv_move);
        iv.setImageURI("res:///"+R.drawable.vote);
    }
}
