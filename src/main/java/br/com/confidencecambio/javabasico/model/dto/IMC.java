package br.com.confidencecambio.javabasico.model.dto;

import java.util.Objects;

public class IMC {
    private Double altura;
    private Double peso;

    public IMC(Double altura, Double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getPeso() {
        return peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IMC imc = (IMC) o;
        return Objects.equals(altura, imc.altura) && Objects.equals(peso, imc.peso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(altura, peso);
    }
}
