package br.com.gt.beans;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
    
    private int id; 
    private String nome; 
    private String email; 
    private String cpf; 
    private String telefone; 
    private LocalDate dtNascimento; 
    private String genero; 
    private ArrayList<Comentario> comentarios;

    public Usuario() {
    }

    public Usuario(int id, String nome, String email, String cpf, String telefone, LocalDate dtNascimento,
            String genero, ArrayList<Comentario> comentarios) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dtNascimento = dtNascimento;
        this.genero = genero;
        this.comentarios = comentarios;
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
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public LocalDate getDtNascimento() {
        return dtNascimento;
    }
    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }
    public void setComentarios(Comentario comentario) {
        this.comentarios.add(comentario);
    } 
}
