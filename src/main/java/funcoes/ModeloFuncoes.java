package funcoes;

import java.util.Scanner;

public class ModeloFuncoes {

    public static final double PI =3.1416;

    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

    System.out.println("Informe o valor do raio:");
    double raio = input.nextDouble();


    //double areaDoCirulo = PI * (raio * raio)
    double areaDoCirculo = calculeAreaDoCirculo(raio);
    System.out.println("Valor da Area do Circulo: " + areaDoCirculo);


    input.close();
      }

    private static double calculeAreaDoCirculo(double raio) {
       return PI * (raio * raio);


    }


}
