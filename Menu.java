import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Compra gastos = new Compra();
        int qual=0;

        int sair=0;
        while(sair==0){
        System.out.print("----------------------------------------------------------------------\nSeja Bem vindo a Pizzaria do Henrique\nInstruçoes:\n1 -> Digite os numeros/letras correspondes antes de cada instrução para selecioná-la\n----------------------------------------------------------------------\n");
        System.out.println("Digite sua quantidade de dinheiro você trouxe para gastar:");
        int x = input.nextInt();
        gastos.qtdDinheiroTotal(x);
        sair = 1;
        }
        sair=0;
        System.out.println("");


        while(sair==0){
            qual = 0;
            System.out.println("---------------------------Menu---------------------------\n1 -> Comprar\n2\n3 -> Pagar a conta\n4 -> Jogar\n5 -> Sair\n");
            qual = input.nextInt();
            if(qual==1){
                System.out.println("------------------------------------------------------\nO que voce deseja comprar?\n1 -> Pizza\n2 -> Acaiz\n3 -> Refrigerante\n4 -> Voltar\n");
                int p = input.nextInt();
                if(p==2){
                    System.out.println("----------------------------------------------------\n 1 -> Acai tradicional\n2 -> Acai com Leite\n3 ->Suco de acai");
                    int saboracai = input.nextInt();
                    System.out.println("----------------------------------------------------\ng/G -> Tamanho G\np/P -> Tamanho P\nm/M -> Tamanho M");
                    String tamanhoacai = input.next();
                    System.out.println("----------------------------------------------------\nQuantidade :\n");
                    int quantidadeacai = input.nextInt();
                    gastos.adicionarProduto(new Acai(quantidadeacai,tamanhoacai, saboracai));
                    System.out.println("Dinheiro restante:\n" + gastos.somaTotal());
                }

            }




        }























        input.close();
    }

}