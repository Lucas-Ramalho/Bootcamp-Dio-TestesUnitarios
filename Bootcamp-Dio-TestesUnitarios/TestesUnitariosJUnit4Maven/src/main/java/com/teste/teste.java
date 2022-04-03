package com.teste;

import java.util.Scanner;
import java.io.IOException;

public class teste {

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, media;

        A = sc.nextDouble();
        B = sc.nextDouble();

        //TODO: Complete os espaços em branco com as respectivas variáveis para o cálculo da média.
        media = (  A   * 3.5 +   B  * 7.5)/11;

        //TODO: Complete com a variável que representa o resultado da média.
        System.out.printf("MEDIA = %.5f", media    );
        System.out.println();
    }*/

  /*  public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            String[] relogio = leitor.nextLine().split(":");
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);
            switch (hora) {
                case (7):
                    System.out.println("Atraso maximo: " + min);
                    break;
                case (8):
                    System.out.println("Atraso maximo: " + (min + 60));
                    break;
                case (9):
                    System.out.println("Atraso maximo: " + (min + 120));
                    break;
                default:
                    System.out.println("Atraso maximo: 0");
            }
        }
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int C = sc.nextInt();
        if ((L + C) % 2 == 0){
            System.out.println(" 1  ");
        }else{                                               //complete o código nos espaços em branco
            System.out.println(" 0  ");
        }
            sc.close();
        }





}
