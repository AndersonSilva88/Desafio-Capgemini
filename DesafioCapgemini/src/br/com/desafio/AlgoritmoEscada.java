package br.com.desafio;

import java.util.Scanner;

public class AlgoritmoEscada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de N: ");

        int c = Integer.parseInt(sc.next());

        int [][] n = new int[c][c];

        for (int  i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
            }
        }

        for (int i = 0; i < n.length; i++){
            for (int j = 0; j < n[i].length; j++){
                if (i+j < n.length - 1){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
