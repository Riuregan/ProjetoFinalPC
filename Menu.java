import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Compra gastos = new Compra();
        double carteira = 0.0;
        double x = 0.0;
        int qual = 0;

        int sair = 0;
        while (sair == 0) {
            System.out.print(
                    "----------------------------------------------------------------------\nSeja Bem vindo a Pizzaria do Henrique\nInstruçoes:\n1 -> Digite os numeros/letras correspondes antes de cada instrução para selecioná-la\n----------------------------------------------------------------------\n");
            System.out.println("Digite sua quantidade de dinheiro você trouxe para gastar:");
            x = input.nextInt();
            carteira = x;
            gastos.qtdDinheiroTotal(x);
            sair = 1;
        }
        sair = 0;
        System.out.println("");

        while (sair == 0) {
            qual = 0;
            System.out.println(
                    "---------------------------Menu---------------------------\n1 -> Comprar\n2 -> Ver seu carrinho\n3 -> Pagar a conta\n4 -> Jogar\n5 -> Sair\n");
            qual = input.nextInt();
            if (qual == 1) {
                System.out.println(
                        "------------------------------------------------------\nO que voce deseja comprar?\n1 -> Pizza\n2 -> Acaiz\n3 -> Refrigerante\n4 -> Voltar\n");
                int p = input.nextInt();
                if (p == 1) {
                    System.out.println(
                            "----------------------------------------------------\n 1 -> Calabresa\n2 -> Portuguesa\n3 -> Pepperoni\n4 -> Frango com catupiry\n5 -> Marguerita\n 6 -> Napolitana");
                    int saborPizza = input.nextInt();
                    System.out.println(
                            "----------------------------------------------------\ng/G -> Tamanho G\np/P -> Tamanho P\nm/M -> Tamanho M");
                    String tamanhoPizza = input.next();
                    System.out.println("----------------------------------------------------\nQuantidade :\n");
                    int quantidadePizza = input.nextInt();
                    Pizza pizza = new Pizza(quantidadePizza, tamanhoPizza, saborPizza);
                    pizza.setSabor(saborPizza);
                    gastos.adicionarProduto(pizza);
                    x = x - gastos.somaTotal();
                    System.out.println("Dinheiro restante:\n" + x);
                    gastos.pressAnyKeyToContinue();
                }
                if (p == 2) {
                    System.out.println(
                            "----------------------------------------------------\n 1 -> Acai tradicional\n2 -> Acai com Leite\n3 ->Suco de acai");
                    int saboracai = input.nextInt();
                    System.out.println(saboracai);
                    System.out.println(
                            "----------------------------------------------------\ng/G -> Tamanho G\np/P -> Tamanho P\nm/M -> Tamanho M");
                    String tamanhoacai = input.next();
                    System.out.println("----------------------------------------------------\nQuantidade :\n");
                    int quantidadeacai = input.nextInt();
                    Acai acai = new Acai(quantidadeacai, tamanhoacai, saboracai);
                    acai.setSabor(saboracai);
                    gastos.adicionarProduto(acai);
                    x = x - gastos.somaTotal();
                    System.out.println("Dinheiro restante:\n" + x);
                    gastos.pressAnyKeyToContinue();
                }
                if (p == 3) {
                    System.out.println(
                            "----------------------------------------------------\n 1 -> Coca-cola\n2 -> Guaraná Antarctica\n3 ->Fanta laranja");
                    int saborrefri = input.nextInt();
                    System.out.println(saborrefri);
                    System.out.println(
                            "----------------------------------------------------\ng/G -> Tamanho G\np/P -> Tamanho P\nm/M -> Tamanho M");
                    String tamanhorefri = input.next();
                    System.out.println("----------------------------------------------------\nQuantidade :\n");
                    int quantidaderefri = input.nextInt();
                    Refrigerante refri = new Refrigerante(quantidaderefri, tamanhorefri, saborrefri);
                    refri.setSabor(saborrefri);
                    gastos.adicionarProduto(refri);
                    x = x - gastos.somaTotal();
                    System.out.println("Dinheiro restante:\n" + x);
                    gastos.pressAnyKeyToContinue();
                }

            }
            if (qual == 2) {
                input.nextLine();
                System.out.println(gastos.verCarrinho(carteira));
                gastos.pressAnyKeyToContinue();
            }
            if (qual == 3) {

            }
            if (qual == 4) {

            }
            if (qual == 5) {
                System.out.println("Programa encerrado!");
                System.exit(1);
            }

        }

        input.close();
    }

}