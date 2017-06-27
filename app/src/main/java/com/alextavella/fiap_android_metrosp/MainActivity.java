package com.alextavella.fiap_android_metrosp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.alextavella.fiap_android_metrosp.adapter.LinhaAdapter;
import com.alextavella.fiap_android_metrosp.api.LinhaAPI;
import com.alextavella.fiap_android_metrosp.model.Linha;
import com.alextavella.fiap_android_metrosp.utils.APIUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rvLinhas)
    public RecyclerView rvLinhas;

    private LinhaAdapter linhaAdapter;
    private LinhaAPI linhaAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        this.init();
        this.bind();
    }

    private void init() {
        linhaAdapter = new LinhaAdapter(new ArrayList<Linha>());

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rvLinhas.setLayoutManager(layoutManager);
        rvLinhas.setAdapter(linhaAdapter);
        rvLinhas.setHasFixedSize(true);

//        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
//        rvLinhas.addItemDecoration(itemDecoration);
    }

    private void bind() {
        APIUtils
                .getAndroidAPIService()
                .listLinha()
                .enqueue(new Callback<List<Linha>>() {
                    @Override
                    public void onResponse(Call<List<Linha>> call, Response<List<Linha>> response) {
                        if (response.isSuccessful()) {
                            linhaAdapter.update(
                                    response
                                            .body());
                        }
                    }

                    @Override
                    public void onFailure(Call<List<Linha>> call, Throwable t) {
                        Log.e("ERRO", t.getMessage());
                    }
                });
    }
}
