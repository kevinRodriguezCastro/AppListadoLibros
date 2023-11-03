package com.cifpceuta.applistadolibros;

import java.io.Serializable;

public class Libro implements Serializable {
    private String titulo;
    private int paginas;

    private int portada;

    public Libro(String titulo, int paginas, int portada) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.portada = portada;
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
}
