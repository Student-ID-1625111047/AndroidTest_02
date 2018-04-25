package student_1625111047.androidtest_02;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class UC3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc3);
        Button button_back = (Button) findViewById(R.id.button_back3);
        button_back.setOnTouchListener(listener_back);
        handler.postDelayed(runnable,0);

    }

    int n = 1;
    final Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            if (n==1){
                findViewById(R.id.imageView_1).setVisibility(View.INVISIBLE);
                findViewById(R.id.imageView_5).setVisibility(View.VISIBLE);
                n = 2;
            }
            else if (n==2){
                findViewById(R.id.imageView_2).setVisibility(View.INVISIBLE);
                findViewById(R.id.imageView_1).setVisibility(View.VISIBLE);
                n = 3;
            }
            else if (n==3){
                findViewById(R.id.imageView_3).setVisibility(View.INVISIBLE);
                findViewById(R.id.imageView_2).setVisibility(View.VISIBLE);
                n = 4;
            }
            else if (n==4){
                findViewById(R.id.imageView_4).setVisibility(View.INVISIBLE);
                findViewById(R.id.imageView_3).setVisibility(View.VISIBLE);
                n = 5;
            }
            else if (n==5){
                findViewById(R.id.imageView_5).setVisibility(View.INVISIBLE);
                findViewById(R.id.imageView_4).setVisibility(View.VISIBLE);
                n = 1;
            }
            handler.postDelayed(this,100);
        }
    };


    private View.OnTouchListener listener_back = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Intent intent_back = new Intent(UC3.this,MainActivity.class);
            startActivity(intent_back);
            return true;
        }
    };
}
