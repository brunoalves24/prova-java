package br.com.confidencecambio.javabasico.common;

public interface CommonName {

    //**TODO Deve ser possível obter o primeiro nome. Exemplo: Se o nome for "João Soares Silva", deve retornar "João".
    public String getFirstName();

    //TODO Retornar o nome todo em letras maiúsculas.
    public String getNameWithUpperCase();

    //TODO Retornar o último nome. Exemplo: Se o nome for "João Soares Silva", deve retornar "Soares Silva".
    public String getLastName();

    //TODO Retornar o nome abreviado. Exemplo: Se o nome for "João Soares Silva", retornar "João S. Silva".**//
    public String getAbbreviatedName();
}
