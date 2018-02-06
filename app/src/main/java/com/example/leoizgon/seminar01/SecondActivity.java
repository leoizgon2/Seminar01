package com.example.leoizgon.seminar01;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView tv=(TextView)findViewById(R.id.tvMessage) ;

        String data_receive=getIntent().getStringExtra("my_parameter");
        if(!data_receive.equals(null)){

            //Dar formato a la string
            Resources res=getResources();
            String text=String.format(res.getString(R.string.data_tranfer),data_receive);
            tv.setText(text);
        }
        }

        @Override
      public  void onBackPressed(){

        Intent intent=new Intent();
        intent.putExtra("result","Come back soon!");
        setResult(RESULT_OK,intent);
        super.onBackPressed();
        }
    }


