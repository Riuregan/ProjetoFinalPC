package ExercInventario;

import java.util.ArrayList;

public class Situacao {

    private ArrayList<Bem> bens = new ArrayList<Bem>();
    private ArrayList<Bem> bens2 = new ArrayList<Bem>();

    public Situacao(){
        
    }

    public void addValores1(Bem valores) {
        this.bens.add(valores);
    }
    
    public double calcularValorInventario1(){
        double valorTotal = 0;
        for(Bem bem : bens){
            valorTotal = valorTotal + bem.converterParaDolar(5);
        }
        return valorTotal;
    }

	public void addValores2(Bem valores) {
        this.bens2.add(valores);
	}

    public double calcularValorInventario2(){
        double valorTotal = 0;
        for(Bem bem : bens2){
            valorTotal = valorTotal + bem.converterParaDolar(5);
        }
        return valorTotal;
    }

    public int maiorNivelAlcancado(int nivel1, int nivel2) {
        int maior = 0;
        if (nivel1 > nivel2) {
            maior = nivel1;
        } else if (nivel1 < nivel2) {
            maior = nivel2;
        } else if (nivel1 == nivel2) {
            maior = nivel1;
        }
        return maior;
    }

    public boolean x(){
        Bem y;
        for (Bem i : bens) {
            y = i;
            System.out.println(y);
          }
        return false;
    }
    
}

