package br.com.questao2;

public class Main {
    public static void main(String[] args) {
        FPadrao Fp = new FPadrao(1,"JOAO",10000);
        System.out.println(Fp.toString());

        FComissionado Fc = new FComissionado(2,"JOAO",1500,2,10000);
        System.out.println(Fc.toString());

        FProdutividade Fpro = new FProdutividade(3,"JOAO",2000,0.5,100);
        System.out.println(Fpro.toString());
    }
}