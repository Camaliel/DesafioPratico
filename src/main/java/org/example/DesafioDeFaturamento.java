package org.example;

import java.text.DecimalFormat;

public class DesafioDeFaturamento {
    public static void main(String[] args) {
        int[] faturamento = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000,
                150, 250, 350, 20, 550, 650, 750, 850, 950, 999,
                155, 255, 350, 455, 555, 655, 755, 855};

        int menor = faturamento[0];
        int maior = faturamento[0];
        int soma = 0;
        int quantidadeDias = faturamento.length;
        int diasAcimaDaMedia = 0;

        for (int i = 0; i < faturamento.length; i++) {
            if (faturamento[i] < menor) {
                menor = faturamento[i];
            }
            if (faturamento[i] > maior) {
                maior = faturamento[i];
            }
            soma += faturamento[i];
        }

        double mediaAnual = (double) soma / quantidadeDias;

        // Calculando os dias acima da média
        for (int i = 0; i < faturamento.length; i++) {
            if (faturamento[i] > mediaAnual) {
                diasAcimaDaMedia++;
            }
        }
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(" ---------------------------------------  ");
        System.out.println("O menor valor de faturamento é: R$ " + df.format(menor));
        System.out.println(" ---------------------------------------  ");
        System.out.println("O maior valor de faturamento é: R$ " + df.format(maior));
        System.out.println(" ---------------------------------------  ");
        System.out.println("A média anual de faturamento é: R$ " + df.format(mediaAnual));
        System.out.println(" ---------------------------------------  ");
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia * 12);
        System.out.println(" ---------------------------------------  ");
    }
}