package ExercInventario;

public class Vida extends Bem{

       
    public Vida(int quantidade){
            super(quantidade);  
    }


    @Override
    public double converterParaDolar(double dolarComercial) {
        double valor = 0;
        valor = quantidade* 0.2 * dolarComercial;
       return valor;
    }

    
}
