package list.OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        if(quantidade > 0 && preco > 0) {
            carrinho.add(new Item(nome, preco, quantidade));
        }
    }

    public void removerItem(String nome) {
        carrinho.removeIf(i -> i.getNome().equalsIgnoreCase(nome));
    }

    public double calcularValorTotal() {
        double valorTotal = 0;

        for(Item i : carrinho) {
            valorTotal += (i.getPreco() * i.getQuantidade());
        }

        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Shampoo", 10.5, 2);
        carrinho.adicionarItem("Condicionador", 15.5, 3);
        carrinho.exibirItens();
        System.out.println(carrinho.calcularValorTotal());
        carrinho.removerItem("condicionador");
        carrinho.exibirItens();
        System.out.println(carrinho.calcularValorTotal());
    }
}
