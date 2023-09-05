package ExPorta;

public class Casa {

    private String cor;
    public Porta p1;
    public Porta p2;
    public Porta p3;
public Casa(String cor, Porta p1, Porta p2, Porta p3){
    this.cor =cor;
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
}
public void pinta(){
    this.cor = cor;
}
public int quantasPortasEstaoAbertas(){
    int quantPortasAbertas = 0;

    if (p1.isAberta())
    quantPortasAbertas++;
    if (p2.isAberta())
        quantPortasAbertas++;
    if (p3.isAberta())
        quantPortasAbertas++;
    return quantPortasAbertas;
}
public String toString(){
    String dados = "";
    dados += "Cor da casa: " + cor + "\n";
    dados += "Cor da porta 1: " + p1.getcor() + "\n";
    dados += "Cor da porta 2: " + p2.getcor() + "\n";
    dados += "Cor da porta 3: " + p3.getcor() + "\n";

    return dados;
}


}
