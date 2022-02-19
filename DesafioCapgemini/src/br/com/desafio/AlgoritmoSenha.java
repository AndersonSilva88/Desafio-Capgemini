package br.com.desafio;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlgoritmoSenha {

    public static boolean senhaSegura(String senha) {

        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[!@#$%^&*()-+])"
                + "(?=\\S+$).{6}$";

        Pattern p = Pattern.compile(regex);

        if (senha.length() > 6 || senha.length() < 6) {
            System.out.println("Senha Invalida!");
            return false;
        }

        Matcher m = p.matcher(senha);

        return m.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Nome");
        String nome = sc.next();

        System.out.println("Digite uma Senha");
        String senha = sc.next();

        System.out.println("Quantidade de Caracteres digitados: "+senha.length());
        System.out.println(senhaSegura(senha));


        sc.close();

    }
}
