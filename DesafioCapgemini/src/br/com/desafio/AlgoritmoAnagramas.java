package br.com.desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class AlgoritmoAnagramas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String pa = sc.nextLine();

        ArrayList<String> todasStrings = new ArrayList<>();
        ArrayList<String> anagramas = new ArrayList<>();

        int x = 0;

        for (int i = 0; i < pa.length() - 1; i++) {
            for (int j = 1 + i; j < pa.length(); j++) {

                char charI = pa.charAt(i);
                char charJ = pa.charAt(j);

                String novaString = pa.substring(i, j + 1);

                if (i != j) {
                    if (charI == charJ) {
                        x = x + 1;
                        anagramas.add(pa.substring(i, i+1));
                    }
                    todasStrings.add(novaString);
                }
            }
        }
        System.out.println("Anagramas: " + anagramas.size() + " - " + anagramas);
        System.out.println("Todas Substrings: " + todasStrings);

        sc.close();
    }
}
