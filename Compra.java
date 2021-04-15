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

    public String verCarrinho(double carteira) {
        String saida = "";
        double total = 0.0;
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

    public void pressAnyKeyToContinue() {
        System.out.println("Press Enter key to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

    public String realizarCompra(double valorCarteira, double pagamento) {
        // ta errado essa funcao, os parametros nao correspondem com o resto do
        // programa, depois corrigir
        String resposta = "";
        double troco = 0.0;
        if (valorCarteira >= pagamento) {
            troco = valorCarteira - pagamento;
            resposta = ("Compra realizada com sucesso!\nSeu troco é de" + troco + "reais");
        } else if (valorCarteira < pagamento) {
            resposta = ("A conta bateu nâo em!!! Vai ter q lavar" + (troco % 10)
                    + "pratos pra pagar a conta se não vamo chamar os omi fardado");
        }
        return resposta;
    }

}
