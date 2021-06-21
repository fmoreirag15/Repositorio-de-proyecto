package com.example.proyecto_008;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login_ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
    }
    public void  onClick(View view)
    {
        Intent miIntent=new Intent(login_.this,menu.class );
        startActivity(miIntent);
    }
}