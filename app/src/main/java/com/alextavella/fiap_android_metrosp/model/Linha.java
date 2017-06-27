package com.alextavella.fiap_android_metrosp.model;

/**
 * Created by alextavella on 26/06/17.
 */

public class Linha {

    private String cor;
    private int numero;
    private String urlImagem;

    public Linha(String cor, int numero, String urlImagem) {
        this.cor = cor;
        this.numero = numero;
        this.urlImagem = urlImagem;
    }

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
}
