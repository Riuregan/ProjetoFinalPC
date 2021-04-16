import java.util.ArrayList;

public class Compra {
    private ArrayList<Produto> carrinho = new ArrayList<Produto>();
    double dinheiro = 0.0;
    int cont = 1;

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

    public String verCarrinho(double carteira) {
        String saida = "";
        double total = 0.0;
        cont = 1;
        for (Produto x : carrinho) {
            saida += String.valueOf(x.getQuantidade()) + " " + x.nomeSabor() + ", tamanho: " + x.getTamanho()
                    + ", preço: " + Double.toString(x.calcularPreco()) + "\n";
            total = total + x.calcularPreco();
        }
        saida = saida + "\nTotal a pagar: " + Double.toString(total) + "\nDinheiro na carteira: " + carteira;
        return saida;
    }

    public double getDinheiroTotal() {
        return dinheiro;
    }

    public void gastoDinheiro(double x) {
        dinheiro = dinheiro - x;

    }

    public String realizarCompra(double valorCarteira, double pagamento) {
        String resposta = "";
        double troco = 0.0;
        if (valorCarteira >= pagamento) {
            troco = valorCarteira - pagamento;
            resposta = ("Compra realizada com sucesso!\nSeu troco é de " + troco + "reais");
        } else if (valorCarteira < pagamento) {
            resposta = ("A conta ficou muito cara e você não tinha dinheiro suficiente para pagar, você foi obrigado a lavar pratos e saiu envergonhado, sem olhar para trás ");
        }
        return resposta;
    }

}
