package br.com.gt.beans;

import java.time.LocalDate;

public class Reserva {

    private int id; 
    private float valorTotalAluguel; 
    private LocalDate dataAgendamento; 
    private LocalDate dataInicio; 
    private LocalDate dataDevolucao; 
    private Agencia agencia; 
    private Veiculo veiculo;
    public Reserva() {
    }

    public Reserva(int id, float valorTotalAluguel, LocalDate dataAgendamento, LocalDate dataInicio,
            LocalDate dataDevolucao, Agencia agencia, Veiculo veiculo) {
        this.id = id;
        this.valorTotalAluguel = valorTotalAluguel;
        this.dataAgendamento = dataAgendamento;
        this.dataInicio = dataInicio;
        this.dataDevolucao = dataDevolucao;
        this.agencia = agencia;
        this.veiculo = veiculo;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getValorTotalAluguel() {
        return valorTotalAluguel;
    }
    public void setValorTotalAluguel(float valorTotalAluguel) {
        this.valorTotalAluguel = getVeiculo().getPrecoDiaria();
    }
    public LocalDate getDataAgendamento() {
        return dataAgendamento;
    }
    public void setDataAgendamento(LocalDate dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    public Agencia getAgencia() {
        return agencia;
    }
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    } 

    @Override
    public String toString() {
        return "\n" + "Reserva Id " + getId() + "\n"
                + "Carro Alugado: " + getVeiculo().getMarca() + " " + getVeiculo().getModelo() + "\n" 
                + "Datas - Agendamento " + getDataAgendamento() + " Início " + getDataInicio() + " Devolução " + getDataDevolucao() + "\n" 
                + "Preço diária: " + getValorTotalAluguel() + "\n" 
                + "Agencia: " + getAgencia().getId() + "\n" 
                ; 
    }
}