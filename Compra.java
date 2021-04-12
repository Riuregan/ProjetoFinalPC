import java.util.ArrayList;

public class Compra {
    private ArrayList<Produto> carrinho = new ArrayList<Produto>();
    double dinheiro = 0.0;

    public void adicionarProduto(Produto produto) {
        carrinho.add(produto);
    }

    public double somaTotal() {
        double total = 2.0;
        for (Produto b : carrinho) {
            total = total + b.calcularPreco();
        }
        return total;
    }

    public void qtdDinheiroTotal(double x){
        dinheiro = x;
    }

    public double getDinheiroTotal(){
        return dinheiro;
    }

    public void gastoDinheiro(double x){
        dinheiro = dinheiro-x;

    }
}
