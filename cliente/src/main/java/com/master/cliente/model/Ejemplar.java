package com.master.cliente.model;


public class Ejemplar {

    private String isbn;
    private String titulo;
    private String autor;
    private String tematica;

    public Ejemplar() {
        super();
    }

    public Ejemplar(String isbn, String titulo,String autor, String tematica) {
        super();
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.tematica = tematica;
    }

    

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

   

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ejemplar other = (Ejemplar) obj;
        if (isbn == null) {
            if (other.isbn != null)
                return false;
        } else if (!isbn.equals(other.isbn))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Ejemplar [isbn=" + isbn + ", titulo=" + titulo + ", tematica=" + tematica + "]";
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }  

    
}
