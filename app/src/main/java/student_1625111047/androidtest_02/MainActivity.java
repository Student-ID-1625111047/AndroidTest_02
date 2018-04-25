package student_1625111047.androidtest_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_uc1 = (Button) findViewById(R.id.button_uc1);
        button_uc1.setOnTouchListener(listener_1);
        Button button_uc2 = (Button) findViewById(R.id.button_uc2);
        button_uc2.setOnTouchListener(listener_2);
        Button button_uc3 = (Button) findViewById(R.id.button_uc3);
        button_uc3.setOnTouchListener(listener_3);
        Button button_uc4 = (Button) findViewById(R.id.button_uc4);
        button_uc4.setOnTouchListener(listener_4);
        Button button_uc5 = (Button) findViewById(R.id.button_uc5);
        button_uc5.setOnTouchListener(listener_5);
    }

    private View.OnTouchListener listener_1 = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Intent intent_uc1 = new Intent(MainActivity.this,UC1.class);
            startActivity(intent_uc1);
            return true;
        }
    };

    private View.OnTouchListener listener_2 = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Intent intent_uc2 = new Intent(MainActivity.this,UC2.class);
            startActivity(intent_uc2);
            return true;
        }
    };

    private View.OnTouchListener listener_3 = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Intent intent_uc3 = new Intent(MainActivity.this,UC3.class);
            startActivity(intent_uc3);
            return true;
        }
    };

    private View.OnTouchListener listener_4 = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Intent intent_uc4 = new Intent(MainActivity.this,UC4.class);
            startActivity(intent_uc4);
            return true;
        }
    };

    private View.OnTouchListener listener_5 = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Intent intent_uc5 = new Intent(MainActivity.this,UC5.class);
            startActivity(intent_uc5);
            return true;
        }
    };

}
