package ExercInventario;

/**
 * 
 * OLÁ PROFESSORA, COMO VOCÊ CRIOU A QUESTÃO TEVE
 *  VÁRIAS COISAS QUE NÃO FAZIAM MUITO SENTIDO, IMPLEMENTEI O QUE 
 * ENTENDI
 * 
 * 
 * @author Vitor Theodoro
 * 
 * */


public class Inventario {

    public static void main(String[] args){

       Situacao total = new Situacao(); 

        Bem seguidor = new Seguidor(50,10);
        total.addValores1(seguidor);
        Bem seguidor2 = new Seguidor(70,13);
        total.addValores2(seguidor2);


        Bem moeda = new Moeda(350,20);
        total.addValores1(moeda);
        Bem moeda2 = new Moeda(350,70);
        total.addValores1(moeda2);

        Bem vida = new Vida(50);
        total.addValores1(vida);
        Bem vida2 = new Vida(60);
        total.addValores2(vida2);

        Bem recurso = new Recurso(100,40);
        total.addValores1(recurso);

        Bem ferramenta = new Ferramenta(5,"desativacao");
        total.addValores1(ferramenta);

        total.addValores1(new Cenario(4,60,10));
        Bem cenario2 = new Cenario(7,688,10);
        total.addValores2(cenario2);


        System.out.println("O valor final do inventário 1 é: " + total.calcularValorInventario1());
        System.out.println("Maior nivel do inventário 1"+ total.maiorNivelAlcancado(20,60));
        System.out.println("O valor final do inventário 2 é: " + total.calcularValorInventario2());
        System.out.println("Maior nivel do inventário 2"+ total.maiorNivelAlcancado(70,688));
            
        
        }
        


    }
    
