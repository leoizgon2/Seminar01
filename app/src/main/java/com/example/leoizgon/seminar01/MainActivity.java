package com.example.leoizgon.seminar01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView)findViewById(R.id.dynamic_int);
        TextView tv2=(TextView)findViewById(R.id.dynamic_string);
        tv.setText("Dynamic text assigned  by code(int)");
        tv2.setText("Dynamic text assigned by code (String)");

    }
}
