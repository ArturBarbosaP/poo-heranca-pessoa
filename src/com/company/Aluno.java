package com.company;

public class Aluno extends Pessoa
{
    private String matricula;
    private String curso;

    //alt+insert  = inserir get e set e construtor
    public Aluno(String nome, int idade, String matricula)
    {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public String getCurso()
    {
        return curso;
    }

    public void setCurso(String curso)
    {
        this.curso = curso;
    }
}