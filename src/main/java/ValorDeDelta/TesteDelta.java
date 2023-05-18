package ValorDeDelta;
import java.util.Scanner;
public class TesteDelta {
    public static void main(String[] args) {
        Scanner tela = new Scanner(System.in);
    System.out.println("Entre com o valor A: ");
    double A = tela.nextDouble();
    System.out.println("Entre com o valor B: ");
    double B = tela.nextDouble();
    System.out.println("Entre com o valor C: ");
    double C = tela.nextDouble();
    double delta ;
    double X;
    double X1;
    double X2;


    delta = (B * B) - (4 * A * C);
        X1 = (-B + Math.sqrt(delta)) / 2 * A;
        X2 = (-B - Math.sqrt(delta)) / 2 * A;

    if (delta < 0) {
        System.out.println("Não há solução nos números reais: ");
    }
    else if (delta == 0 )  {
        System.out.println("O valor de X é:" + X1 +"soma" + X2);
    } else if (delta > 0) {
        System.out.println("O valor de X1 é:" + X1 +"valor de X2" + X2);
    }
        tela.close();
    }

}
