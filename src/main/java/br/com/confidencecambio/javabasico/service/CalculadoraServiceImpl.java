package br.com.confidencecambio.javabasico.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceImpl implements CalculadoraService{

    @Override
    public Double calcular(Double altura, Double peso) {
        if ( altura <= 0 || peso <= 0) {
           throw new IllegalArgumentException("É necessário que peso e altura sejam maior que 0");
        }

        return peso / (altura * altura);
    }
}
