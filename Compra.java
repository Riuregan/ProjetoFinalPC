import java.util.ArrayList;

public class Compra {
    private ArrayList<Produto> carrinho = new ArrayList<Produto>();
    double dinheiro = 0.0;

    public void adicionarProduto(Produto produto) {
        carrinho.add(produto);
    }

    public double somaTotal() {
        double total = 0.0;
        for (Produto b : carrinho) {
            total = total + b.calcularPreco();
        }
        return total;
    }

    public void qtdDinheiroTotal(double x) {
        dinheiro = x;
    }

    public String verCarrinho() {
        String saida = "";
        double total = 0.0;
        for (Produto x : carrinho) {
            saida += String.valueOf(x.getQuantidade()) + " do sabor numero " + String.valueOf(x.getSabor())
                    + ", tamanho: " + x.getTamanho() + ", preço: " + Double.toString(x.calcularPreco()) + "\n";
            total = total + x.calcularPreco();
        }
        saida = saida + "\nTotal a pagar: " + Double.toString(total);
        return saida;
    }

    public double getDinheiroTotal() {
        return dinheiro;
    }

    public void gastoDinheiro(double x) {
        dinheiro = dinheiro - x;

    }

    public void pressAnyKeyToContinue() {
        System.out.println("Press Enter key to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

}
