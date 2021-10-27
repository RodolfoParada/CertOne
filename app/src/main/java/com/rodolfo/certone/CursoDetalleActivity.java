package com.rodolfo.certone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

import java.net.URISyntaxException;

public class CursoDetalleActivity extends AppCompatActivity {


    int CursoId;
    ImageView ivCursoimagenDetail;
    TextView tvCursoTitle;
    TextView tvCursoBootcamp;
    TextView tvCursopreviewDescription;
    TextView tvCursosemanas;
    TextView tvCursoInicio;
    TextView tvCursosMatricula;
    TextView tvCursosminimumSkill;
    TextView tvCursosScholarshipsAvailable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso_detalle);


        CursoId =getIntent().getIntExtra("id", -1);//cambiar este codigo








       //  CursoId = Integer.parseInt(String.valueOf(getIntent().getIntExtra("id", -1)));
    //     CursoId =  getIntent().getType.String.values(); este codi



        tvCursoTitle = (TextView) findViewById(R.id.tvCakeTitleDetail);
       // tvTortaPriceDetail = (TextView) findViewById(R.id.tvCakePriceDetail);
       // tvTortaDescriptionDetail = (TextView) findViewById(R.id.tvCakeDescriptionDetail);
        ivCursoimagenDetail = (ImageView) findViewById(R.id.ivCakeImageDetail);


        //forma 1
        //CursoId =getIntent().getIntExtra("id", -1);
        //CursoId = String.valueOf(getIntent().getIntExtra("id", -1));
        //ivCursoimagenDetail = (ImageView) findViewById(R.id.ivCursoImageDetail);
        //tvCursoTitle = (TextView) findViewById(R.id.tvCursoTitle);
        //tvCursoBootcamp = (TextView) findViewById(R.id.tvCursoBootcamp);
        //tvCursopreviewDescription = (TextView) findViewById(R.id.tvCursopreviewDescription);
        //tvCursosemanas = (TextView) findViewById(R.id.tvCursosemanas);

       //tvCursoInicio = (TextView) findViewById(R.id.tvCursoInicio);
        //tvCursosMatricula = (TextView) findViewById(R.id.tvCursosMatricula);
       //tvCursosminimumSkill = (TextView) findViewById(R.id.tvCursosminimumSkill);
       //tvCursosScholarshipsAvailable = (TextView) findViewById(R.id.tvCursosScholarshipsAvailable);

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
                //tvCursoBootcamp.setText(cursoDetalleEntity.getTuition());
                //tvCursopreviewDescription.setText(cursoDetalleEntity.getDescription());
                //tvCursosemanas.setText(cursoDetalleEntity.getWeeks());
                //tvCursoInicio.setText(cursoDetalleEntity.getStart());
                //tvCursosMatricula.setText(cursoDetalleEntity.getTuition());
                //tvCursosminimumSkill.setText(cursoDetalleEntity.getMinimumSkill());
               // tvCursosScholarshipsAvailable.setText(Integer.toString(cursoDetalleEntity.isScholarshipsAvailable())));
        }
    }
}
