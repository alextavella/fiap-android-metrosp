package com.alextavella.fiap_android_metrosp.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by alextavella on 26/06/17.
 */

public class Linha implements Parcelable {

    private String cor;
    private int numero;
    private String urlImagem;

    public Linha(String cor, int numero, String urlImagem) {
        this.cor = cor;
        this.numero = numero;
        this.urlImagem = urlImagem;
    }

    public Linha(Parcel in) {
        this.cor = in.readString();
        this.numero = in.readInt();
        this.urlImagem = in.readString();
    }

    public static final Creator<Linha> CREATOR = new Creator<Linha>() {
        @Override
        public Linha createFromParcel(Parcel in) {
            return new Linha(in);
        }

        @Override
        public Linha[] newArray(int size) {
            return new Linha[size];
        }
    };

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(cor);
        dest.writeInt(numero);
        dest.writeString(urlImagem);
    }
}
