public abstract class Produto {
    protected int quantidade, sabor;
    protected String tamanho;

    public Produto(int quantidade, String tamanho, int sabor) {
        this.quantidade = quantidade;
        this.tamanho = tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getSabor() {
        return sabor;
    }

    public void setSabor(int sabor) {
        this.sabor = sabor;
    }

    public abstract double calcularPreco();

    public abstract double ultimoGasto();

}
