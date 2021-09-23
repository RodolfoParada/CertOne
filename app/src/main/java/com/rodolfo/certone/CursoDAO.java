package com.rodolfo.certone;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface CursoDAO {
    @Insert
    public void addCurso(CursoEntity cursoEntity);

    @Query("SELECT * from curso_entity")
    public List<CursoEntity> getAllCursos();

    @Query("SELECT * from curso_entity WHERE id=:id")
    public CursoEntity getCursoById(int id);

    // DAO para manipular la tabla cake_detail_entity
    @Insert
    public void addCursoDetalle(CursoDetalleEntity cursoDetalleEntity);

    @Query("SELECT * from curso_detalle_entity WHERE id=:id")
    public CursoDetalleEntity getCursoDetalleById(int id);
}
