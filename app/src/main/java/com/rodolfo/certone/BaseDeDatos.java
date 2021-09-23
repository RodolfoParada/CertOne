package com.rodolfo.certone;

import androidx.room.RoomDatabase;
import androidx.room.Database;

@Database(entities = {CursoEntity.class,CursoDetalleEntity.class}, version = 1)
public abstract class BaseDeDatos extends RoomDatabase {
  public abstract CursoDAO cursoDAO();
}
