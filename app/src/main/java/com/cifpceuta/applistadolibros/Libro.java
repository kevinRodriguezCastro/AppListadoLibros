package com.cifpceuta.applistadolibros;

import java.io.Serializable;

public class Libro implements Serializable {
    private String titulo;
    private int paginas;
    private String descripcion;
    private int portada;

    public Libro(String titulo, int paginas, int portada,String descripcion) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.portada = portada;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPortada() {
        return portada;
    }

    public void setPortada(int portada) {
        this.portada = portada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
