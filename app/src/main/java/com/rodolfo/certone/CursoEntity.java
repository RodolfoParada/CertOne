package com.rodolfo.certone;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName="curso_entity")
public class CursoEntity {
    @NonNull
    @PrimaryKey private String id;
    private String title;
    private String previewDescription;
    private String imagen;
    private int weeks;
    private String start;





    public CursoEntity(String id, String title, String previewDescription, String imagen, int weeks, String start) {
        this.id = id;
        this.title = title;
        this.previewDescription = previewDescription;
        this.imagen = imagen;
        this.weeks = weeks;
        this.start = start;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

