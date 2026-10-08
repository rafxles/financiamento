package com.rafxles.test.model;

import jakarta.persistence.*;

@SuppressWarnings("LombokGetterMayBeUsed")
@Entity
@Table(name = "financiamentos")
public class Financiamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double valorTotal;
    private double entrada;
    private int parcelas;
    public double prestacao;

    public Financiamento() {}

    public Financiamento(double valorTotal, double entrada, int parcelas, double prestacao) {
        this.valorTotal = valorTotal;
        this.entrada = entrada;
        this.parcelas = parcelas;
        this.prestacao = prestacao;
    }
    // getters
    public long getId() {return id;}
    public double getValorTotal() {return valorTotal;}
    public double getEntrada() {return entrada;}
    public int getParcelas() {return parcelas;}
    public double getPrestacao() {return prestacao;}
}
