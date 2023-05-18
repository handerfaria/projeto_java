package PositivoNegativo;

import java.util.Scanner;
public class Positivo {
    public static void main(String[] args) {
     Scanner hander = new Scanner(System.in);

     System.out.println("Digite o valor de n: ");
     int N = hander.nextInt();


     if ((N != 0) && (N < 0))

        {// se for negativo entra aqui !
            N *= -1;

            // N = (N * -1);
            System.out.println("O numero transformado em positivo é: " + N);
        }
     else if (N > 0)
        {// se for positivo entra aqui!
         System.out.println("O numero " + N + " ja é positivo  " );
        }
     else if (N == 0)
     {
         System.out.println("O numero digitado é igual a 0: " );
     }

   hander.close();
    }




}
