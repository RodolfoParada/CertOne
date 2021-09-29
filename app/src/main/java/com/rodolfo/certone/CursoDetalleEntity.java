package com.rodolfo.certone;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName="curso_detalle_entity")
public class CursoDetalleEntity {
    @PrimaryKey private int id;
    private String title;
    private String description;
    private String image;
    private String weeks;
    private int tuition;
    private String minimumSkill;
    private boolean ScholarshipsAvailable;
    private String modality;
    private String start;

    public CursoDetalleEntity(){

    }

    public CursoDetalleEntity(int id, String title, String description, String image, String weeks, int tuition, String minimumSkill, boolean scholarshipsAvailable, String modality, String start) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
        this.weeks = weeks;
        this.tuition = tuition;
        this.minimumSkill = minimumSkill;
        ScholarshipsAvailable = scholarshipsAvailable;
        this.modality = modality;
        this.start = start;

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

    public String getWeeks() {
        return weeks;
    }

    public void setWeeks(String weeks) {
        this.weeks = weeks;
    }

    public int getTuition() {
        return tuition;
    }

    public void setTuition(int tuition) {
        this.tuition = tuition;
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

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }




}