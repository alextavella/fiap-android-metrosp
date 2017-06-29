package com.alextavella.fiap_android_metrosp.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.jar.Attributes;

import retrofit2.http.Query;

/**
 * Created by alextavella on 26/06/17.
 */

public class Estacao {

    @SerializedName("nome")
    private String nome;

    @SerializedName("endereco")
    private String endereco;

    @SerializedName("latitude")
    private double latitude;

    @SerializedName("longitude")
    private double longitude;

    @SerializedName("capacidade_passageiro_hora_pico")
    private double capacidade_passageiro_hora_pico;

    @SerializedName("area_construida_m_2")
    private double area_construcao;

    @SerializedName("inauguracao")
    private String inauguracao;

    @SerializedName("urlImagem")
    private String urlImagem;

    public Estacao(String nome, String endereco, double latitude, double longitude, double capacidade_passageiro_hora_pico, double area_construcao, String inauguracao, String urlImagem) {
        this.nome = nome;
        this.endereco = endereco;
        this.latitude = latitude;
        this.longitude = longitude;
        this.capacidade_passageiro_hora_pico = capacidade_passageiro_hora_pico;
        this.area_construcao = area_construcao;
        this.inauguracao = inauguracao;
        this.urlImagem = urlImagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getCapacidade_passageiro_hora_pico() {
        return capacidade_passageiro_hora_pico;
    }

    public void setCapacidade_passageiro_hora_pico(double capacidade_passageiro_hora_pico) {
        this.capacidade_passageiro_hora_pico = capacidade_passageiro_hora_pico;
    }

    public double getArea_construcao() {
        return area_construcao;
    }

    public void setArea_construcao(double area_construcao) {
        this.area_construcao = area_construcao;
    }

    public String getInauguracao() {
        return inauguracao;
    }

    public void setInauguracao(String inauguracao) {
        this.inauguracao = inauguracao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }
}
