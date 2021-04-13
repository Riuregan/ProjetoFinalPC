package ExercInventario;

public class Seguidor extends Bem{

private int fatorImpacto;

    public Seguidor(int quantidade,int fatorImpacto){
            super(quantidade);
            this.fatorImpacto = fatorImpacto;
    }

    @Override
    public double converterParaDolar(double dolarComercial) {
        double valor = 0;
        valor = getQuantidade() * 0.05* fatorImpacto * dolarComercial;
       return valor;
    }



    
}
