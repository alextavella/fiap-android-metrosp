package com.alextavella.fiap_android_metrosp.api;

import com.alextavella.fiap_android_metrosp.model.Estacao;
import com.alextavella.fiap_android_metrosp.model.Linha;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by alextavella on 26/06/17.
 */

public interface MetroAPI {

    @GET("/linhas")
    Call<List<Linha>> listLinha();

    @GET("/linhas/{linha}/estacoes")
    Call<List<Estacao>> listEstacao(@Path("linha") String linha); // PathVariable

//    @GET("/linhas/estacoes")
//    Call<List<Estacao>> listEstacaoFake(@Query("linha") String linha,
//                                        @Query("offset") int offset); // QueryString
}
