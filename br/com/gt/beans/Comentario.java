package br.com.gt.beans;

public class Comentario {
    
    private int id; 
    private String descricao; 
    private int qtdCurtida;

    public Comentario() {
    }

    public Comentario(int id, String descricao, int qtdCurtida) {
        this.id = id;
        this.descricao = descricao;
        this.qtdCurtida = qtdCurtida;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQtdCurtida() {
        return qtdCurtida;
    }
    public void setQtdCurtida(int qtdCurtida) {
        this.qtdCurtida = qtdCurtida;
    } 
}
