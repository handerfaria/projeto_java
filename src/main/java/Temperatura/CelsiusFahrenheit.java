package Temperatura;

public class CelsiusFahrenheit {
    public static void main(String[] args) {

        for (int celsius = 10; celsius <=100; celsius +=10) {
        double    fahrenheit = (celsius * 9/5) + 32;
System.out.println("Temperatura em Celsius: " + celsius + "= Temperatura em Fahrenheit:" + fahrenheit);

       }

    }

}

