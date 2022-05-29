package com.udemy.empresa;

public class Funcionario {

    private String nome;
    private double salarioBruto;
    private double taxa;
    private double porcentagem;

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public Funcionario() {
    }

    public Funcionario(String nome, double salrioBruto, double taxa) {
        this.nome = nome;
        this.salarioBruto = salrioBruto;
        this.taxa = taxa;
    }

    public double salarioLiquido() {
        return this.salarioBruto - taxa;
    }

    public void incrementarSalario(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalrioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public String toString() {
        return "Funcionário{" +
                "nome='" + nome + '\'' +
                ", salário Bruto=" + salarioBruto +
                ", taxa=" + taxa +
                ", salário Líquido=" + salarioLiquido() +
                '}';
    }
}
