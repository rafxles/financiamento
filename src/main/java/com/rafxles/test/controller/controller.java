package com.rafxles.test.controller;

import com.rafxles.test.dto.FinanciamentoRequest;
import com.rafxles.test.model.Financiamento;
import com.rafxles.test.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Autowired
    private service financiamentoService;

    @PostMapping("/financiamento")
    public Financiamento calcular(@RequestBody FinanciamentoRequest request) {
        return financiamentoService.financiamento(request.valorTotal(), request.entrada(),  request.parcelas());
    }
}
