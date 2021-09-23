package com.rodolfo.certone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class CursoDetalleActivity extends AppCompatActivity {

    ImageView ivCursoimagenDetail;
    TextView tvCursoTitle;
    TextView tvCursoBootcamp;
    TextView tvCursopreviewDescription;
    TextView tvCursosemanas;
    TextView tvCursoInicio;
    TextView tvCursosMatricula;
    int CursoId;
    TextView tvCursoinicio;
    TextView tvCursosminimumSkill;
    TextView tvCursosScholarshipsAvailable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso_detalle);
        CursoId = getIntent().getIntExtra("id", -1);
        tvCursoTitle = (TextView) findViewById(R.id.tvCursoTitle);
        tvCursosemanas = (TextView) findViewById(R.id.tvCursosemanas);
        tvCursopreviewDescription = (TextView) findViewById(R.id.tvCursopreviewDescription);
        ivCursoimagenDetail = (ImageView) findViewById(R.id.ivCursoImageDetail);
        tvCursoBootcamp = (TextView) findViewById(R.id.tvCursoBootcamp);
        tvCursoInicio = (TextView) findViewById(R.id.tvCursoInicio);
        tvCursosMatricula = (TextView) findViewById(R.id.tvCursosMatricula);
        tvCursoinicio = (TextView)findViewById(R.id.tvCursoInicio);
        tvCursosminimumSkill = (TextView) findViewById(R.id.tvCursosminimumSkill);
        tvCursosScholarshipsAvailable = (TextView) findViewById(R.id.tvCursosScholarshipsAvailable);

        new LoadCursoDetalle().execute();
    }

    private class LoadCursoDetalle extends AsyncTask<String, Void, String> {
        CursoDetalleEntity cursoDetalleEntity;

        @Override
        protected String doInBackground(String... strings) {
            cursoDetalleEntity = CursoApp.basededatoApp.cursoDAO().getCursoDetalleById(CursoId);
            return null;
        }
            @Override
            protected void onPostExecute(String result) {
                Picasso.get().load(cursoDetalleEntity.getImage()).into(ivCursoimagenDetail);
                tvCursoTitle.setText(cursoDetalleEntity.getTitle());
                tvCursosemanas.setText(cursoDetalleEntity.getSemanas());
                tvCursopreviewDescription.setText(cursoDetalleEntity.getDescription());

                tvCursopreviewDescription.setText(cursoDetalleEntity.getDescription());
                tvCursoBootcamp.setText(cursoDetalleEntity.getBootcamp());
                tvCursoInicio.setText(cursoDetalleEntity.getInicio());
                tvCursosMatricula.setText(cursoDetalleEntity.getMatrícula());
                tvCursoinicio.setText(cursoDetalleEntity.getInicio());
                tvCursosminimumSkill.setText(cursoDetalleEntity.getMinimumSkill());





        }
    }
}
