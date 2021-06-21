package com.example.proyecto_008;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void  informacionUsuario(View view)
    {
        Intent miIntent=new Intent(menu.this,informacionUsuario.class );
        startActivity(miIntent);
    }
    public void  informacionHistorial(View view)
    {
        Intent miIntent=new Intent(menu.this,historial.class );
        startActivity(miIntent);
    }
    public void  informacionUbicacion(View view)
    {
        Intent miIntent=new Intent(menu.this,ubicacion.class );
        startActivity(miIntent);
    }
}