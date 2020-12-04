package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //extra info
        if(getIntent().hasExtra("org.me ntorschools.wuicklauncher.SOMETHING"))
        {
            TextView tv=(TextView) findViewById(R.id.textView);
            String text=getIntent().getExtras().getString("org.me ntorschools.wuicklauncher.SOMETHING");
            tv.setText(text);

        }
    }
}
