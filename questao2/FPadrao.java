package br.com.questao2;

public class FPadrao extends Funcionaria{
    public FPadrao(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }
    public String toString(){
        return "Nome:" +getNome()+ "\n"+ "Matricula: "+getMatricula()+"\n"+ "Salario: "+calcularPrevento();
    }
}
