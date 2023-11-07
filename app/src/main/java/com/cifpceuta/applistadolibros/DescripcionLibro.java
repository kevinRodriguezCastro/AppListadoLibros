package com.cifpceuta.applistadolibros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DescripcionLibro extends AppCompatActivity {
    TextView nombre,nPagina,descripcion;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_libro);

        Intent extra = getIntent();

        img = (ImageView) findViewById(R.id.img);

        nombre = (TextView) findViewById(R.id.nombre);
        nPagina = (TextView) findViewById(R.id.nPagina);
        descripcion = (TextView) findViewById(R.id.descripcion);

        nombre.setText(extra.getStringExtra("nombre"));
        nPagina.setText(extra.getStringExtra("nPagina"));
        descripcion.setText(extra.getStringExtra("descripcion"));

        img.setImageResource(extra.getIntExtra("img",R.drawable.ic_launcher_background));

    }
    public void volverMain(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}