package br.com.questao1;

public class Normal extends Ingresso{
    public Normal(double valor) {
        super(valor);
    }
    public void imprimirValor(){
        System.out.println("Ingresso Normal: "+getValor());
    }
}
