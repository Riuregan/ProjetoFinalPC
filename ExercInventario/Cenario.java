package ExercInventario;

public class Cenario extends Bem{

    private int nivel;
    private int tamanho;

    public Cenario(int quantidade,int nivel, int tamanho){
            super(quantidade);
            this.nivel = nivel;
            this.tamanho = tamanho;
    }

    @Override
    public double converterParaDolar(double dolarComercial) {
        double valor = quantidade *tamanho* nivel *0.05* dolarComercial;
       return valor;
    }

    public int getNivel2() {
        return nivel;
    }
    
}
