package com.rodolfo.certone;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.List;

public class CursoAdapter extends RecyclerView.Adapter<CursoAdapter.ViewHolder> {
    List<Curso> cursoLista;
    Context context;

    public CursoAdapter(List<Curso> CursoLista, Context context) {
        this.cursoLista = CursoLista;
        this.context = context;
    }

    @NonNull
    @Override
    public CursoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.curso_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Curso curso = cursoLista.get(position);
        try {

            Picasso.get().load(cursoLista.get(position).getImagen()).into(holder.ivCurso);
            holder.tvTitleCurso.setText(cursoLista.get(position).getTitle());
            holder.tvSubTitulo.setText(cursoLista.get(position).getPreviewDescription());//retorna int


            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   Toast.makeText(context, "ELEMENTO " , Toast.LENGTH_SHORT).show();
                   /*context.startActivity(new Intent(context, CursoDetalleActivity.class)
                            .putExtra( "id",cursoLista.get(position).getId())
                            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                );*/


                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    @Override
    public int getItemCount() {
        return cursoLista.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivCurso;
        public TextView tvTitleCurso;
        public TextView tvSubTitulo;


        public ViewHolder(View itemView) {
            super(itemView);
            this.ivCurso = (ImageView) itemView.findViewById(R.id.ivCurso);
            this.tvTitleCurso = (TextView) itemView.findViewById(R.id.tvTitleCurso);
            this.tvSubTitulo = (TextView) itemView.findViewById(R.id.tvSubTitulo);

        }
    }
}
