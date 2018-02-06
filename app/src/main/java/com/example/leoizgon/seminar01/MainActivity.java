package com.example.leoizgon.seminar01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;
import android.widget.Toast;

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
        Button button=(Button)findViewById(R.id.onClickListener_code);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,R.string.onClickListener_code,Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void displayMessage(View v){
        Toast.makeText(MainActivity.this,R.string.onClickListener_layout,Toast.LENGTH_SHORT).show();

    }
}
