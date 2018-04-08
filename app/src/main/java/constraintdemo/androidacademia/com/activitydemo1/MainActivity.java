package constraintdemo.androidacademia.com.activitydemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity","onCreate()");
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity","onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity","onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity","onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity","onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity","onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity","onDestroy()");
    }

    public void clickme(View view) {
        String str=editText.getText().toString();
        textView.setText(str);
    }
}

