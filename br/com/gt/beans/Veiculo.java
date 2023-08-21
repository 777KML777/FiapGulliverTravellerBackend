package br.com.gt.beans;

import java.util.ArrayList;

public class Veiculo {
    
    private int id;
    private int ano;
    private int qtdPassageiros;
    private boolean disponivel;
    private float precoDiaria;
    private String cor;
    private String combustivel;
    private String descricao;
    private String foto;
    private String marca;
    private String modelo;
    private String placa;
    private ArrayList<Avaliacao> avaliacoes;
    
    public Veiculo() {
    }

    public Veiculo(int id, int ano, int qtdPassageiros, boolean disponivel, float precoDiaria, String cor,
            String combustivel, String descricao, String foto, String marca, String modelo, String placa,
            ArrayList<Avaliacao> avaliacoes) {
        this.id = id;
        this.ano = ano;
        this.qtdPassageiros = qtdPassageiros;
        this.disponivel = disponivel;
        this.precoDiaria = precoDiaria;
        this.cor = cor;
        this.combustivel = combustivel;
        this.descricao = descricao;
        this.foto = foto;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.avaliacoes = avaliacoes;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getQtdPassageiros() {
        return qtdPassageiros;
    }
    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public float getPrecoDiaria() {
        return precoDiaria;
    }
    public void setPrecoDiaria(float precoDiaria) {
        this.precoDiaria = precoDiaria;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }
    public void setAvaliacoes(Avaliacao avaliacao) {
        this.avaliacoes.add(avaliacao);
    }
}
