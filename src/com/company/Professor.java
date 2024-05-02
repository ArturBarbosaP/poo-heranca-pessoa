package com.company;

public class Professor extends Pessoa
{
    private double salario;
    private String curriculo;

    //alt+insert  = inserir get e set e construtor


    public Professor(String nome, int idade, String curriculo)
    {
        super(nome, idade);
        this.curriculo = curriculo;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public String getCurriculo()
    {
        return curriculo;
    }

    public void setCurriculo(String curriculo)
    {
        this.curriculo = curriculo;
    }
}