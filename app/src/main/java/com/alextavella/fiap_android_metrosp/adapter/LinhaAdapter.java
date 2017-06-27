package com.alextavella.fiap_android_metrosp.adapter;

import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alextavella.fiap_android_metrosp.R;
import com.alextavella.fiap_android_metrosp.model.Linha;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by alextavella on 26/06/17.
 */

public class LinhaAdapter extends RecyclerView.Adapter<LinhaAdapter.LinhaViewHolder> {

    private List<Linha> linhas;

    public LinhaAdapter(List<Linha> linhas) {
        this.linhas = linhas;
    }

    @Override
    public LinhaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View myLayout = inflater.inflate(R.layout.linha_row, parent, false);
        return new LinhaViewHolder(myLayout);
    }

    @Override
    public void onBindViewHolder(LinhaViewHolder holder, int position) {
        holder.tvTitle
                .setText(linhas.get(position).getCor());

        holder.tvSubTitle
                .setText(String.valueOf("Linha "+ linhas.get(position).getNumero()));

//        Picasso
//                .with(holder.itemView.getContext())
//                .load(linhas.get(position).getUrlImagem())
//                .placeholder(R.drawable.img_metro_placeholder)
//                .into(holder.ivLinha);
    }

    @Override
    public int getItemCount() {
        return this.linhas.size();
    }

    public class LinhaViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.ivLinha)
        public ImageView ivLinha;

        @BindView(R.id.tvTitle)
        public TextView tvTitle;

        @BindView(R.id.tvSubTitle)
        public TextView tvSubTitle;

        public LinhaViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public void update(List<Linha> linhas) {
        this.linhas = linhas;
        notifyDataSetChanged();
    }
}
