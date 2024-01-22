package Ex11;

 class Produto{
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    public Produto(String nome, double preco, int quantidadeEstoque ){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantEstoque() {
        return quantidadeEstoque;
    }
    public void diminuirEstoque(int quantidade) {
    if (quantidade <= quantidadeEstoque) {
        quantidadeEstoque -= quantidade;
    } else {
        System.out.println("Sem estoque deste produto.");
    }

    }
}