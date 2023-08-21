package br.com.gt.beans;

import java.util.ArrayList;

public class Carro extends Veiculo {
    
    private int qtdPortas;

    public Carro() {
    }

    public Carro(int id, int ano, int qtdPassageiros, boolean disponivel, float precoDiaria, String cor,
            String combustivel, String descricao, String foto, String marca, String modelo, String placa,
            ArrayList<Avaliacao> avaliacoes, int qtdPortas) {
        super(id, ano, qtdPassageiros, disponivel, precoDiaria, cor, combustivel, descricao, foto, marca, modelo, placa,
                avaliacoes);
        this.qtdPortas = qtdPortas;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
        
}
