package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int INDICE = 12;
        int SOMA =  0;
        int K =1;


        while(K<INDICE){
            K = K +1;
            SOMA=SOMA +K;
        }
        System.out.println(SOMA);
    }
    }