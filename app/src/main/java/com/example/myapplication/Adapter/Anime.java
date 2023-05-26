package com.example.myapplication.Adapter;

public class Anime {
    private int id;
    private String nombre;
    private String descripsion;
    private String foto;

    public Anime(int id, String nombre, String descripsion, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.descripsion = descripsion;
        this.foto = foto;
    }

    public Anime(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripsion() {
        return descripsion;
    }

    public void setDescripsion(String descripsion) {
        this.descripsion = descripsion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripsion='" + descripsion + '\'' +
                ", foto='" + foto + '\'' +
                '}';
    }
}
