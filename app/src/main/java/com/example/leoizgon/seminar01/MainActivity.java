package com.example.leoizgon.seminar01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //sobre escribe le metodo de la actividad e invoca a su implementación en la superclase
        super.onCreate(savedInstanceState);
        //asocia el layout XML a la actividad
        setContentView(R.layout.activity_main);
    }
}
