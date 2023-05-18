package SalarioMensal;

import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o salário");
        double salario = input.nextDouble();

        System.out.println("Digite o reajuste");
        double reajuste = input.nextDouble();

        double Calcular =( (reajuste / 100) * salario) + salario;
        System.out.println("salario atual " + Calcular);

        input.close();


                                            }

                    }









