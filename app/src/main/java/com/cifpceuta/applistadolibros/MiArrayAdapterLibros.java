package com.cifpceuta.applistadolibros;

import android.app.Activity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MiArrayAdapterLibros extends ArrayAdapter<Libro> {
    private Activity context;
    private ArrayList<Libro> libros;

    public MiArrayAdapterLibros(Activity c, ArrayList<Libro> libros) {
        super(c,R.layout.layout_libro_item,libros);
        this.context = c;
        this.libros = libros;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View fila = inflater.inflate(R.layout.layout_libro_item,parent,false);

        Libro libro = libros.get(position);

        TextView titulo,paginas;
        ImageView img;
        titulo = (TextView) fila.findViewById(R.id.tvTitulo);
        paginas = (TextView) fila.findViewById(R.id.tvPaginas);
        img = (ImageView) fila.findViewById(R.id.ivPortada);

        titulo.setText(libro.getTitulo());
        paginas.setText("Numero de paginas : "+String.valueOf(libro.getPaginas()));
        img.setImageResource(libro.getPortada());

        return fila;
    }
}
