package com.rodolfo.certone;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface CursoAPI {
    @GET
    public Call<List<Curso>> getCurso(@Url String url);

    @GET
    public Call<CursoDetalle> getCursoDetalle(@Url String url);
}




