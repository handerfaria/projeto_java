 package NomesVetor;

import java.util.Scanner;
public class CadastroNome {
    public static void main(String[] args) {

    Scanner tela = new Scanner(System.in);

    String[]nomes = new String[10];

    for (int i = 0; i <10; i++) {

        System.out.println("Digíte o seu nome " + (i + 1) + ": ");

        nomes[i] = tela.nextLine();
    }

    System.out.println("Os nomes digitados foram:");


    for (int i = 0; i < 10; i++) {
    System.out.println("Nome " + (i +1) + ": " + nomes[i]);

      }
    }
}
