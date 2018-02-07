package com.example.leoizgon.seminar01;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView tv = (TextView) findViewById(R.id.tvMessage);

        String data_receive = getIntent().getStringExtra("my_parameter");
        String data_http=getIntent().getStringExtra("id_value");




        try {
            if (getIntent().getAction().equals(getIntent().ACTION_VIEW))
                tv.setText(data_http);
        }catch (Exception e){e.getMessage();}

        try {
            if (!data_receive.equals(null)) {

                //Dar formato a la string
                Resources res = getResources();
                String text = String.format(res.getString(R.string.data_tranfer), data_receive);
                tv.setText(text);
            }
        }catch (Exception e){e.getMessage();}
    }
        @Override
      public  void onBackPressed(){

        Intent intent=new Intent();
        intent.putExtra("result","Come back soon!");
        setResult(RESULT_OK,intent);
        super.onBackPressed();
        }
    }


