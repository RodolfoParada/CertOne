package com.rodolfo.certone;

public class Curso {
    private int id;
    private String title;
    private String previewDescription;
    private String image;
    private int weeks;
    private String start;

    public Curso(){

    }

    public Curso(int id, String title, String previewDescription, String imagen, int weeks, String start) {
        this.id = id;
        this.title = title;
        this.previewDescription = previewDescription;
        this.image = image;
        this.weeks = weeks;
        this.start = start;


    }

    public  int getId() {
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
        return image;
    }

    public void setImagen(String imagen) {
        this.image = image;
    }
    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;

    }

}
