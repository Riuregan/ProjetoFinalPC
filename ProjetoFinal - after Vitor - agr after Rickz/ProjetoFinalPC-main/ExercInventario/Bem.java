package ExercInventario;

public abstract class Bem {

    protected int quantidade;

    public Bem(int quantidade){
        this.quantidade = quantidade;
    }

	public abstract double converterParaDolar(double dolarComercial);


	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

    
}
