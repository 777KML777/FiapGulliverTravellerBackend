package br.com.gt.beans;

import java.util.ArrayList;

public class Locadora {
    
    private int id; 
    private String nome; 
    private String email; 
    private String cnpj; 
    private String telefone; 
    private String site; 
    private ArrayList<Agencia> agencias;
    
    public Locadora() {
    }
    
    public Locadora(int id, String nome, String email, String cnpj, String telefone, String site,
            ArrayList<Agencia> agencias) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.site = site;
        this.agencias = agencias;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getSite() {
        return site;
    }
    public void setSite(String site) {
        this.site = site;
    }
    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }
    public void setAgencias(Agencia agencia) {
        this.agencias.add(agencia);
    } 
}
