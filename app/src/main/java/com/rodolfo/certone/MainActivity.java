package com.rodolfo.certone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
  private static final String TAG ="MainActivity";

    List<Curso> ListaCurso;
    List<CursoDetalle> ListaCursoDetalle;
    RecyclerView rvCursos;
    CursoAdapter cursoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListaCurso = new ArrayList<Curso>();
        ListaCursoDetalle = new ArrayList<CursoDetalle>();
        rvCursos = (RecyclerView) findViewById(R.id.rvCursos);
        rvCursos.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        loadCursos();
    }

    private void loadCursos() {
        new LoadCursos().execute();
    }

    private class LoadCursos extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... strings) {
            try {
                ListaCurso = getRetrofit(0)
                        .create(CursoAPI.class)
                        .getCurso("courses")
                        .execute()
                        .body();

                for (int i = 0; i < ListaCurso.size(); i++) {
                    CursoDetalle cursoDetalle = getRetrofit(1)
                            .create(CursoAPI.class)
                            .getCursoDetalle(Integer.toString(ListaCurso.get(i).getId()))
                            .execute()
                            .body();

                    ListaCursoDetalle.add(cursoDetalle);
                }
                loadCursosIntoDB();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        private void loadCursosIntoDB() {
            try {
                // Carga los cakes de listCakes a la tabla cake_entity
                for (int i = 0; i < ListaCurso.size(); i++) {
                    CursoApp.basededatoApp.cursoDAO().addCurso(new CursoEntity(
                                    ListaCurso.get(i).getId(),
                                    ListaCurso.get(i).getTitle(),
                                    ListaCurso.get(i).getPreviewDescription(),
                                    ListaCurso.get(i).getImagen(),
                                    ListaCurso.get(i).getWeeks(),// es un int
                                    ListaCurso.get(i).getStart()
                            )
                    );
                }
                for (int i = 0; i < ListaCursoDetalle.size(); i++) {
                    CursoApp.basededatoApp.cursoDAO().addCursoDetalle(new CursoDetalleEntity(
                                    ListaCursoDetalle.get(i).getId(),
                                    ListaCursoDetalle.get(i).getTitle(),
                                    ListaCursoDetalle.get(i).getDescription(),
                                    ListaCursoDetalle.get(i).getImage(),
                                    ListaCursoDetalle.get(i).getWeeks(),
                                    ListaCursoDetalle.get(i).getTuition(),
                                    ListaCursoDetalle.get(i).getMinimumSkill(),
                                    ListaCursoDetalle.get(i).isScholarshipsAvailable(),
                                    ListaCursoDetalle.get(i).getModality(),
                                    ListaCursoDetalle.get(i).getStart()
                            )
                    );
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        protected void onPostExecute(String result) {
            cursoAdapter = new CursoAdapter(ListaCurso, getApplicationContext());
            rvCursos.setAdapter(cursoAdapter);

        }

        private Retrofit getRetrofit(int mode) {
            // Si el modo es 0, retorna todo, sino retorna el detalle
            if (mode == 0) {
                return new Retrofit.Builder().baseUrl(getString(R.string.endPoint_Cursos)).addConverterFactory(GsonConverterFactory.create()).build();
            } else {
                return new Retrofit.Builder().baseUrl(getString(R.string.endPoint_CursosDetalle)).addConverterFactory(GsonConverterFactory.create()).build();
            }
        }
    }
}


