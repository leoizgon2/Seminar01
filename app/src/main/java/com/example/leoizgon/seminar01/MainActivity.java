package com.example.leoizgon.seminar01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"Activity Restart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Activity Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"Activity Resume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Activity Pause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Activity Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Activity Destroyed");
    }


    private static final String TAG="LIFECYCLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView)findViewById(R.id.dynamic_int);
        TextView tv2=(TextView)findViewById(R.id.dynamic_string);
        tv.setText("Dynamic text assigned  by code(int)");
        tv2.setText("Dynamic text assigned by code (String)");
       Log.d(TAG,"Creating the activity");

    }
}
