package com.company;

public class Pessoa
{
    protected int idade;
    protected String nome;
    protected String endereco;

    //alt+insert  = inserir get e set e construtor
    public Pessoa (String nome, int idade)
    {
        this. nome = nome;
        this.idade = idade;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }
}