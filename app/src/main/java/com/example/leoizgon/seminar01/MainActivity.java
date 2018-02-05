package com.example.leoizgon.seminar01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView)findViewById(R.id.tvDynamicTextInt);
        TextView tv2=(TextView)findViewById(R.id.tvDynamicTextInt);

    }
}
