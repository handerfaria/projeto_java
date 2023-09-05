package ExListPessoas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Nomes {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("André");
        nomes.add("João");
        nomes.add("Marcos");
        nomes.add("vanessa");
        nomes.add("Bruna");
        nomes.add("Carlos");
        nomes.add("Deyse");
        nomes.add("Sandro");
        nomes.add("Thais");
        nomes.add("Wesley");
        nomes.add("Eleonor");
        nomes.add("Gustavo");
        nomes.add("Pedro");
        nomes.add("Amauri");
        nomes.add("Zumira");
        nomes.add("Humberto");
        nomes.add("Richard");
        nomes.add("Omar");
        nomes.add("Yuri");
        nomes.add("Fabiola");


        nomes.sort(Comparator.naturalOrder());

        System.out.println(nomes);




    }



}
