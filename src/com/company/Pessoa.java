package com.company;

public class Pessoa {
    private String nome;
    private int idade;

    public void exibirDados(String nome){
        System.out.println("Exibir nome: "+ nome);
    }

    public void exibirDados(String nome, int idade){
        System.out.println("nome: " + nome + " idade: " + idade);
    }
}
