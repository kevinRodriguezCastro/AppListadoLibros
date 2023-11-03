package com.cifpceuta.applistadolibros;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listado;
    private  MiArrayAdapterLibros adapterLibros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listado = (ListView) findViewById(R.id.lvLista);

        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(new Libro("Acceso a datos",424,R.drawable.acceso_datos));
        libros.add(new Libro("Lenguaje de marcas",409,R.drawable.lenguaje_marcas));
        libros.add(new Libro("Interfaces",326,R.drawable.sistemas_informaticos));
        libros.add(new Libro("Sistemas informaticos",470,R.drawable.entornos));
        libros.add(new Libro("Base de datos",378,R.drawable.administracion_bases));


        adapterLibros = new MiArrayAdapterLibros(this,libros);

        listado.setAdapter(adapterLibros);

        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Libro libro = (Libro) adapterLibros.getItem(position);
                Toast.makeText(view.getContext(),"Libro: "+libro.getTitulo(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}