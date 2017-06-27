package com.alextavella.fiap_android_metrosp.model;

import java.util.Date;

/**
 * Created by alextavella on 26/06/17.
 */

public class Estacao {

    private String nome;
    private String endereco;
    private double latitude;
    private double longitude;
    private double capacidade_passageiro_hora_pico;
    private double area_construcao;
    private Date inauguracao;

    public Estacao(String nome, String endereco, double latitude, double longitude, double capacidade_passageiro_hora_pico, double area_construcao, Date inauguracao) {
        this.nome = nome;
        this.endereco = endereco;
        this.latitude = latitude;
        this.longitude = longitude;
        this.capacidade_passageiro_hora_pico = capacidade_passageiro_hora_pico;
        this.area_construcao = area_construcao;
        this.inauguracao = inauguracao;
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

    public Date getInauguracao() {
        return inauguracao;
    }

    public void setInauguracao(Date inauguracao) {
        this.inauguracao = inauguracao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
