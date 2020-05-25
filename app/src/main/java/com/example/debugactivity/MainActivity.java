package com.example.debugactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText)findViewById(R.id.e1);
        ed2 =(EditText)findViewById(R.id.e2);
        tv =(TextView)findViewById(R.id.result);
    }

    public void adding(View view) {
        Log.i("MainActivity","executed 1");
        int a = Integer.parseInt(ed1.getText().toString());
        Log.i("MainActivity","executed 2");
        int b = Integer.parseInt(ed2.getText().toString());
        Log.i("MainActivity","executed 3");
        int res = (a+b);
        Log.i("MainActivity","executed 4");
        tv.setText(""+res);
        Log.i("MainActivity","executed 5");
    }
}
