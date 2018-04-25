package student_1625111047.androidtest_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class UC1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc1);
        Button button_back = (Button) findViewById(R.id.button_back1);
        button_back.setOnTouchListener(listener_back);
        Button button_horizontal = (Button) findViewById(R.id.button_horizontal);
        button_horizontal.setOnTouchListener(listener_horizontal);
        Button button_vertical = (Button) findViewById(R.id.button_vertical);
        button_vertical.setOnTouchListener(listener_vertical);
        Button button_left = (Button) findViewById(R.id.button_left);
        button_left.setOnTouchListener(listener_left);
        Button button_right = (Button) findViewById(R.id.button_right);
        button_right.setOnTouchListener(listener_right);
    }

    private View.OnTouchListener listener_back = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Intent intent_back = new Intent(UC1.this,MainActivity.class);
            startActivity(intent_back);
            return true;
        }
    };

    private View.OnTouchListener listener_horizontal = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.uc1_layout);
            linearLayout.setOrientation(LinearLayout.HORIZONTAL);
            return true;
        }
    };

    private View.OnTouchListener listener_vertical = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.uc1_layout);
            linearLayout.setOrientation(LinearLayout.VERTICAL);
            return true;
        }
    };

    private View.OnTouchListener listener_left = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.uc1_layout);
            linearLayout.setGravity(Gravity.LEFT);
            return true;
        }
    };

    private View.OnTouchListener listener_right = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.uc1_layout);
            linearLayout.setGravity(Gravity.RIGHT);
            return true;
        }
    };
}
