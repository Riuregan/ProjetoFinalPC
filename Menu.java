import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Compra gastos = new Compra();
        Comandos comando = new Comandos();
        double carteira = 0.0;
        double x = 0.0;
        int qual = 0;
        double valorDaCompra = 0.0;

        int sair = 0;
        while (sair == 0) {
            System.out.print(
                    "----------------------------------------------------------------------\nSeja Bem vindo a Pizzaria do Henrique\nInstruçoes:\n1 -> Digite os numeros/letras correspondes antes de cada instrução para selecioná-la\n----------------------------------------------------------------------");
            System.out.println("\nDigite sua quantidade de dinheiro você trouxe para gastar:");
            System.out.print("R: ");
            x = input.nextInt();
            carteira = x;
            gastos.qtdDinheiroTotal(x);
            sair = 1;
        }
        sair = 0;
        // System.out.println("");

        while (sair == 0) {
            qual = 0;
            System.out.println(
                    "--------------------------Menu-------------------------\n1 -> Comprar\n2 -> Ver seu carrinho\n3 -> Pagar a conta\n4 -> Sair\n------------------------------------------------------");
            System.out.print("R: ");
            qual = input.nextInt();
            if (qual == 1) {
                System.out.println(
                        "------------------------------------------------------\nO que voce deseja comprar?\n1 -> Pizza\n2 -> Açai\n3 -> Refrigerante\n4 -> Voltar\n------------------------------------------------------");
                System.out.print("R: ");
                int p = input.nextInt();
                if (p == 1) {
                    System.out.println(
                            "----------------------------------------------------\n1 -> Calabresa\n2 -> Portuguesa\n3 -> Pepperoni\n4 -> Frango com catupiry\n5 -> Marguerita\n6 -> Napolitana\n----------------------------------------------------");
                    int saborPizza = input.nextInt();
                    System.out.println(
                            "----------------------------------------------------\ng/G -> Tamanho G // R$ 34.20 \nm/M -> Tamanho M // R$ 27.40 \np/P -> Tamanho P // R$ 23.50 \n----------------------------------------------------");
                    String tamanhoPizza = input.next();
                    System.out.print("----------------------------------------------------\nQuantidade : ");
                    int quantidadePizza = input.nextInt();
                    System.out.println("----------------------------------------------------");
                    if (comando.conferirVeracidadePizza(saborPizza, tamanhoPizza) == 1) {
                        Pizza pizza = new Pizza(quantidadePizza, tamanhoPizza, saborPizza);
                        pizza.setSabor(saborPizza);
                        gastos.adicionarProduto(pizza);
                        x = x - gastos.somaTotal();
                        System.out.println("Produto Adicionado ao carrinho");
                        // System.out.println("Você ainda tem : " + x +" reais para poder gastar");
                    } else {
                        System.out.println("Você tem certeza que digitou os valores corretos? tente de novo..");
                    }
                    comando.pressAnyKeyToContinue();
                }
                if (p == 2) {
                    System.out.println(
                            "----------------------------------------------------\n1 -> Acai tradicional\n2 -> Acai com Leite\n3 -> Suco de acai\n----------------------------------------------------");
                    System.out.print("R: ");
                    int saboracai = input.nextInt();
                    System.out.println(saboracai);
                    System.out.println(
                            "----------------------------------------------------\ng/G -> Tamanho G // R$ 12.50 \nm/M -> Tamanho M // R$ 10.30 \np/P -> Tamanho P // R$ 8.00 \n----------------------------------------------------");
                    System.out.print("R: ");
                    String tamanhoacai = input.next();
                    System.out.println("----------------------------------------------------\nQuantidade : ");
                    System.out.print("R: ");
                    int quantidadeacai = input.nextInt();
                    if (comando.conferirVeracidadeAcai(saboracai, tamanhoacai) == 1) {
                        Acai acai = new Acai(quantidadeacai, tamanhoacai, saboracai);
                        acai.setSabor(saboracai);
                        gastos.adicionarProduto(acai);
                        x = x - gastos.somaTotal();
                        System.out.println("Produto Adicionado ao carrinho");

                    }

                    comando.pressAnyKeyToContinue();
                }
                if (p == 3) {
                    System.out.println(
                            "----------------------------------------------------\n1 -> Coca-cola\n2 -> Guaraná Antarctica\n3 -> Fanta laranja\n----------------------------------------------------");
                    System.out.print("R: ");
                    int saborrefri = input.nextInt();
                    System.out.println(saborrefri);
                    System.out.println(
                            "----------------------------------------------------\ng/G -> Tamanho G // R$ 8.20 \nm/M -> Tamanho M // R$ 6.20 \np/P -> Tamanho P // R$ 8.20 \n----------------------------------------------------");
                    System.out.print("R: ");
                    String tamanhorefri = input.next();
                    System.out.println("----------------------------------------------------\nQuantidade : ");
                    System.out.print("R: ");
                    int quantidaderefri = input.nextInt();
                    if (comando.conferirVeracidadeAcai(saborrefri, tamanhorefri) == 1) {
                        Refrigerante refri = new Refrigerante(quantidaderefri, tamanhorefri, saborrefri);
                        refri.setSabor(saborrefri);
                        gastos.adicionarProduto(refri);
                        x = x - gastos.somaTotal();
                        System.out.println("Produto Adicionado ao carrinho");

                    }

                    comando.pressAnyKeyToContinue();
                }

            }
            if (qual == 2) {
                input.nextLine();
                System.out.println("----------------------------------------------------");
                System.out.println(gastos.verCarrinho(carteira));
                comando.pressAnyKeyToContinue();
            }
            if (qual == 3) {
                valorDaCompra = gastos.somaTotal();
                System.out.println(gastos.realizarCompra(carteira, valorDaCompra));
                comando.pressAnyKeyToContinue();
                System.exit(1);

            }
            if (qual == 4) {
                System.out.println("Programa encerrado!");
                System.exit(1);
            }

        }

        input.close();
    }

}