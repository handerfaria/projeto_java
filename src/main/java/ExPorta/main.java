package ExPorta;

public class main {
    public static void main(String[] args) {



        Porta p1 = new Porta("violeta", 20, 25, 5);
        Porta p2 = new Porta("Verde", 25,30, 10);
        Porta p3 = new Porta("Rosa", 30, 35, 15);

        Casa c1 = new Casa("Marrom", p1, p2,p3);

        c1.pinta();

        c1.p1.abre();
        c1.p2.abre();

        System.out.println(c1);
        System.out.println("Quantidade de portas abertas: " + c1.quantasPortasEstaoAbertas());
    }




}
