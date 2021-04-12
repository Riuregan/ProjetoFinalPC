package ExercInventario;

public class Recurso extends Bem{

    private int tipo;

    public Recurso(int quantidade,int tipo){
            super(quantidade);
            this.tipo = tipo;
    }

    @Override
    public double converterParaDolar(double dolarComercial) {
        double valor = quantidade * tipo *0.2* dolarComercial;
       return valor;
    }
    
}
