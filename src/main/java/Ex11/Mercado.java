package Ex11;

 class ItemPedido {
private Produto produto;
private int quantidade;


     public ItemPedido(Produto produto, int quantidade) {
         this.produto = produto;
         this.quantidade = quantidade;
     }
     public Produto getProduto() {
         return produto;
     }

     public int getQuantidade() {
         return quantidade;
     }
// pedido do cliente
static class Pedido{
         private ItemPedido[] itens;
         private String formaDePagamento;
         public Pedido(ItemPedido[] itens, String formaDePagamento){
         this.itens = itens;
         this.formaDePagamento = formaDePagamento;

         }

    public ItemPedido[] getItens() {
        return itens;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }
public double calcularTotal(){
             double total = 0;
             for (ItemPedido item : itens){
                 total += item.getProduto().getPreco() * item.getQuantidade();
             }
return total;
         }
     }

     }

// classe pricipal para testar o programa
public class Mercado {
    private static ItemPedido.Pedido pedido;

    public static void main(String[] args) {
        // adicionando produtos

        Produto arroz = new Produto("Arroz camil",23,50);
        Produto feijao = new Produto("Feijão Solito",8.5,100);

// criando os itens

        ItemPedido item1= new ItemPedido(arroz, 3);
        ItemPedido item2= new ItemPedido(feijao, 4);

        ItemPedido[] itensPedido = {item1 , item2};
        // criando um pedido
 pedido = new ItemPedido.Pedido(itensPedido, "Cartão");

        System.out.println("Itens do pedido:");
        for (ItemPedido item : pedido.getItens())
            System.out.println(item.getProduto().getNome() + "- Quantidade: " + item.getQuantidade());
        System.out.println("Forma de pagamento:" + pedido.getFormaDePagamento());
        System.out.println("Total a pagar: " + pedido.calcularTotal());
    }
}

