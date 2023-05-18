package conversorDeTemperatura;

import java.util.Scanner;

public class ExercicioTemperatura {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
System.out.println("Digite a temperatura em celsius");
        double celsius = input.nextDouble();
        double fahrenheit = (9 * celsius + 160) / 5;
System.out.println(" A temperatura convertida em fahrenheit é: " + fahrenheit) ;


        input.close();
      }

}
