package student_1625111047.androidtest_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class UC2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc2);
        Button button_back = (Button) findViewById(R.id.button_back2);
        button_back.setOnTouchListener(listener_back);
    }

    private View.OnTouchListener listener_back = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Intent intent_back = new Intent(UC2.this,MainActivity.class);
            startActivity(intent_back);
            return true;
        }
    };
}
