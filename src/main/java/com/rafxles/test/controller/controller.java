package com.rafxles.test.controller;

import com.rafxles.test.dto.FinanciamentoRequest;
import com.rafxles.test.model.Financiamento;
import com.rafxles.test.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class controller {
    @Autowired
    private service financiamentoService;

    @GetMapping("/financiamento")
    public List<Financiamento> listar() {
        return financiamentoService.listarTodos();
    }

    @PostMapping("/financiamento")
    public Financiamento calcular(@RequestBody FinanciamentoRequest request) {
        return financiamentoService.financiamento(request.valorTotal(), request.entrada(),  request.parcelas());
    }
}
