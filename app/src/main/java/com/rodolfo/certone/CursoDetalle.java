package com.rodolfo.certone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CursoDetalle {
    private int id;
    private String title;
    private String description;
    private String image;
    private String semanas;
    private int matrícula;
    private String minimumSkill;
    private boolean ScholarshipsAvailable;
    private String bootcamp;
    private String inicio;

    public CursoDetalle(int id, String title, String description, String image, String semanas, int matrícula, String minimumSkill, boolean scholarshipsAvailable, String bootcamp, String inicio) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
        this.semanas = semanas;
        this.matrícula = matrícula;
        this.minimumSkill = minimumSkill;
        this.ScholarshipsAvailable = scholarshipsAvailable;
        this.bootcamp = bootcamp;
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

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getSemanas() {
            return semanas;
        }

        public void setSemanas(String semanas) {
            this.semanas = semanas;
        }

        public int getMatrícula() {
            return matrícula;
        }

        public void setMatrícula(int matrícula) {
            this.matrícula = matrícula;
        }

        public String getMinimumSkill() {
            return minimumSkill;
        }

        public void setMinimumSkill(String minimumSkill) {
            this.minimumSkill = minimumSkill;
        }

        public boolean isScholarshipsAvailable() {
            return ScholarshipsAvailable;
        }

        public void setScholarshipsAvailable(boolean scholarshipsAvailable) {
            ScholarshipsAvailable = scholarshipsAvailable;
        }

        public String getBootcamp() {
            return bootcamp;
        }

        public void setBootcamp(String bootcamp) {
            this.bootcamp = bootcamp;
        }

        public String getInicio() {
            return inicio;
        }

        public void setInicio(String inicio) {
            this.inicio = inicio;
        }
    }

