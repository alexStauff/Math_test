package edu.dsu_academy_desu.math_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void confirm(View view)
    {
        EditText ans = (EditText) findViewById(R.id.answer);
        int value = Integer.parseInt(ans.getText().toString());
        if (value == 4)
        {
            Toast.makeText(MainActivity.this, "Congrats, you solved some basic arithmetic", Toast.LENGTH_LONG).show();
        }
        else if (value != 4)
        {
            Toast.makeText(MainActivity.this, "Wow, you should just drop out now", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this, "My bad this code does not work", Toast.LENGTH_SHORT).show();
        }
    }
}
