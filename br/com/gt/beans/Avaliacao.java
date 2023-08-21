package br.com.gt.beans;

import java.util.ArrayList;

public class Avaliacao {

    private int id; 
    private ArrayList<Usuario> usuarios; 
    private int totalAvaliacoes;

    public Avaliacao() {
    }

    public Avaliacao(int id, ArrayList<Usuario> usuarios, int totalAvaliacoes) {
        this.id = id;
        this.usuarios = usuarios;
        this.totalAvaliacoes = totalAvaliacoes;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    public void setUsuarios(Usuario usuario) {
        this.usuarios.add(usuario);
    }
    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }
    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    } 
    
}
