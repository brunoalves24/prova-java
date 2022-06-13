package br.com.confidencecambio.javabasico.model;

import br.com.confidencecambio.javabasico.common.CommonName;

public class Cliente implements CommonName {
    String nome;

    public Cliente (String nome) {
        if (nome.isEmpty())
            throw new IllegalArgumentException("nome não pode ser vazio");

        if (nome == null)
            throw new IllegalArgumentException("nome não pode ser nulo");

        this.nome = nome.trim();
    }

    @Override
    public String getFirstName() {
        var firstName = this.nome.split(" ");
        return firstName[0];
    }

    @Override
    public String getNameWithUpperCase() {
        return this.nome.toUpperCase();
    }

    @Override
    public String getLastName() {
        var lastName = this.nome.split(" ");

        if (lastName.length > 1) {
            var ultimonome = "";
            for (int i = 1; i < lastName.length; i++) {
                ultimonome += lastName[i] + " ";
            }
            return ultimonome.trim();
        } else
           return lastName[lastName.length - 1];
    }

    @Override
    public String getAbbreviatedName() {
        var abbreviatedName = this.nome.split(" ");
        return abbreviatedName[0] + " " + abbreviatedName[1].charAt(0) + "." + " "+ abbreviatedName[abbreviatedName.length - 1];
    }

    @Override
    public String toString() {
        return nome;
    }

    public String getNome() {
        return this.nome;
    }
}
