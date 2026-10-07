package com.rafxles.test.repository;

import com.rafxles.test.model.Financiamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<Financiamento, Long> {}
