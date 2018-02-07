package com.example.leoizgon.seminar01;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
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
    private static final int REQUEST=1;

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
         Button implicit_button=(Button)findViewById((R.id.button_implicit_intent));

         //Le asociamos un lisener al botton para que responda a su pulsación
         implicit_button.setOnClickListener(new View.OnClickListener(){

             @Override
             public  void onClick(View v){

             Intent intent=new Intent();
             intent.setAction(Intent.ACTION_VIEW);
             intent.setData(Uri.parse("http://www.upv.es"));
             intent.putExtra("id_value","http://www.upv.es");

             Intent chooser =Intent.createChooser(intent,getResources().getString(R.string.chooser));
//Comprobamos que exista alguna actividad en el sistema que pueda realizar esta acción (Ver pagina web UPV)
             if(intent.resolveActivity(getPackageManager())!=null){
              startActivity(chooser);
             }

             }
         });

        //Mensaje que se muestra a traves del codigo utilizando un Listener 1 boton
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,R.string.onClickListener_code,Toast.LENGTH_SHORT).show();
                //Intent explicito asociado a la nueva actividad SecondActvity
               Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }


        });
    }


    @Override
    protected  void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        switch (requestCode){
            case INTENT_CODE:
                Toast.makeText(getApplicationContext(),data.getStringExtra("result"),Toast.LENGTH_SHORT).show();
                break;
        }
    }

//Mensaje que se muestra a travez del fichero XML 2 boton
    private static final  int INTENT_CODE=1;
    public void displayMessage(View v){
        Toast.makeText(MainActivity.this,R.string.onClickListener_layout,Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
        intent.putExtra("my_parameter","Leonardo");
        startActivityForResult(intent,INTENT_CODE);

    }
}
