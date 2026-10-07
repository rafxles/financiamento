package com.rafxles.test.service;

import com.rafxles.test.model.Financiamento;
import com.rafxles.test.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class service {

    @Autowired
    private repository repository;

    public Financiamento financiamento (double valorTotal, double entrada, int parcelas) {

        List<String> erros = new ArrayList<>();

        if (entrada < valorTotal * 0.2) {
            erros.add("Entrada mínima: R$" + valorTotal * 0.2);
        }
        if (parcelas < 6) {
            erros.add("Mínimo de 6 parcelas. Informado: " + parcelas);
        }
        if (!erros.isEmpty()) {
            throw new IllegalArgumentException(String.join(", ", erros));
        }
        double prestacao = (valorTotal - entrada) / parcelas;
        Financiamento f = new Financiamento(valorTotal, entrada, parcelas, prestacao);
        return repository.save(f);
    }

    public List<Financiamento> listarTodos() {
        return repository.findAll();
    }
}
