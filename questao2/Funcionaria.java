package br.com.questao2;

public abstract class Funcionaria  {
    private int matricula;
    private String nome;
    private double salario;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionaria(int matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;

    }
    public double calcularPrevento(){
        return getSalario();
    }
    public String toString(){
        return "Nome:" +getNome()+ "\n"+ "Matricula: "+getMatricula()+"\n"+ "Salario: "+calcularPrevento();
    }

}
