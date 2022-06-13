package br.com.confidencecambio.javabasico.service;

import org.springframework.stereotype.Service;

@Service
public interface CalculadoraService {
    Double calcular(Double altura, Double peso);
}
