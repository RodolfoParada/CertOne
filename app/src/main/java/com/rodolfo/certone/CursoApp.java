package com.rodolfo.certone;

import android.app.Application;
import androidx.room.Room;

public class CursoApp extends Application {
    public static BaseDeDatos basededatoApp;

    @Override
    public void onCreate() {
        super.onCreate();
        CursoApp.basededatoApp = Room.databaseBuilder(this, BaseDeDatos.class, "app-db").build();
    }
}
