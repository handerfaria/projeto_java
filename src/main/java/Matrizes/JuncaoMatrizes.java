package Matrizes;
import java.util.Scanner;
public class JuncaoMatrizes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] matrizA = new int[15];
        int[] matrizB = new int[15];
        int[] matrizC = new int[30];

        //ler os elementos da matriz a
        System.out.println("Dígite os elementos da matriz A");
        for (int i = 0; i < 15; i++) {
            System.out.print("Elementos" + (i + 1));
            matrizA[i] = input.nextInt();

        }

        //ler os elementos da matriz B
        System.out.println("Dígite os elementos da matriz B");
        for (int i = 0; i < 15; i++) {
            System.out.print("Elementos" + (i + 1));
            matrizB[i] = input.nextInt();

        }

        //construindo a matriz C com a junção das matrizes A e B

        for (int i = 0; i < 15; i++) {

            matrizC[i] = matrizA[i];
            matrizC[i + 15] = matrizB[i];

        }

        //apresentando a matriz C
        System.out.println("Matriz C(junção de A e B):");
        System.out.println("Arrays.toString(matrizC)");

        }
    }
