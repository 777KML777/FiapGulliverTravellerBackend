package br.com.gt.beans;

public class Endereco {
    
    private int id; 
    private String bairro; 
    private String cep; 
    private String logradouro; 
    private String numero; 
    private Cidade cidade;

    public Endereco() {
    }

    public Endereco(int id, String bairro, String cep, String logradouro, String numero, Cidade cidade) {
        this.id = id;
        this.bairro = bairro;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Cidade getCidade() {
        return cidade;
    }
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    } 
}
