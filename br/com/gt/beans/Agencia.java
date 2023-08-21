package br.com.gt.beans;

public class Agencia {
    
    private int id; 
    private Endereco endereco;

    public Agencia() {
    }

    public Agencia(int id, Endereco endereco) {
        this.id = id;
        this.endereco = endereco;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    } 
    
}
