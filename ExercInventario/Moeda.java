package ExercInventario;

public class Moeda extends Bem{

    private int nivel;

    public Moeda(int quantidade,int nivel){
            super(quantidade);
            this.nivel = nivel;
    }

    @Override
    public double converterParaDolar(double dolarComercial) {
        double valor = quantidade * nivel *0.05* dolarComercial;
       return valor;
    }

    public int getNivel1() {
        return this.nivel;
    }
    
}
