package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Attempts top launch an activity within our own app
        Button secondActivityBtn=(Button)findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent= new Intent(getApplicationContext(),SecondActivity.class);
                //how to pass info to another activity
                startIntent.putExtra("org.me ntorschools.wuicklauncher.SOMETHING", "hello World");
                startActivity(startIntent);
            }
        });

        //Attempts to launch an activity outside our app
        Button googleBtn=(Button)findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google="http://www.google.com";
                Uri webaddress =Uri.parse(google);

                Intent gotoGoogle=new Intent(Intent.ACTION_VIEW,webaddress);
                //check whether there is an app which can carry out this request,i.e, to open google page
                if(gotoGoogle.resolveActivity(getPackageManager())!=null)
                {
                     startActivity(gotoGoogle);
                }
            }
        });
    }
}
