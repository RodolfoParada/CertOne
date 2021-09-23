package com.rodolfo.certone;

public class Curso {
    private int id;
    private String title;
    private String previewDescription;
    private String imagen;
    private int semanas;
    private String inicio;

    public Curso(int id, String title, String previewDescription, String imagen, int semanas, String inicio) {
        this.id = id;
        this.title = title;
        this.previewDescription = previewDescription;
        this.imagen = imagen;
        this.semanas = semanas;
        this.inicio = inicio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPreviewDescription() {
        return previewDescription;
    }

    public void setPreviewDescription(String previewDescription) {
        this.previewDescription = previewDescription;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }


    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }
    public int getSemanas() {
        return semanas;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }
}
