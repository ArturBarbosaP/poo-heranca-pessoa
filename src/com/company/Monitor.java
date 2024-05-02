package com.company;

public class Monitor extends Aluno
{
    private double salario;

    public Monitor(String nome, int idade, String matricula, double salario)
    {
        super(nome, idade, matricula);
        this.salario = salario;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }
}