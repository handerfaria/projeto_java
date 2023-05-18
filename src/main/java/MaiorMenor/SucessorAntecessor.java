package MaiorMenor;

    import java.util.Scanner;
    public class SucessorAntecessor {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Digite um número inteiro: ");
    int numero = input.nextInt();

    int sucessor = numero + 1;
    int antecessor = numero -1;

    System.out.println("O número sucessor é: " + sucessor);
    System.out.println("O número antecessor é: " + antecessor);

        input.close();

    }

}
