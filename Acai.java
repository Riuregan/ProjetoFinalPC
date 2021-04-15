public class Acai extends Produto {

    private double valor = 0.0;
    Compra gasto = new Compra();
    // private String nomeSabor = "";

    public Acai(int quantidade, String tamanho, int sabor) {
        super(quantidade, tamanho, sabor);
    }

    @Override
    public double calcularPreco() {
        if (sabor == 1) {
            // this.nomeSabor = "Acaí tradicional";
            if (tamanho.equals("g") || tamanho.equals("G")) {
                valor = 34.20 * quantidade;
            } else if (tamanho.equals("m") || tamanho.equals("M")) {
                valor = 27.40 * quantidade;
            } else if (tamanho.equals("p") || tamanho.equals("P")) {
                valor = 23.50 * quantidade;
            }
        }

        if (sabor == 2) {
            // this.nomeSabor = "Acaí com leite";
            if (tamanho.equals("g") || tamanho.equals("G")) {
                valor = 35.20 * quantidade;

            } else if (tamanho.equals("m") || tamanho.equals("M")) {
                valor = 28.40 * quantidade;

            } else if (tamanho.equals("p") || tamanho.equals("P")) {
                valor = 24.50 * quantidade;

            }
        }

        if (sabor == 3) {
            // this.nomeSabor = "Suco de acaí";
            if (tamanho.equals("g") || tamanho.equals("G")) {
                valor = 35.20 * quantidade;

            } else if (tamanho.equals("m") || tamanho.equals("M")) {
                valor = 28.40 * quantidade;

            } else if (tamanho.equals("p") || tamanho.equals("P")) {
                valor = 24.50 * quantidade;
            }
        }
        return valor;
    }

    @Override
    public double ultimoGasto() {
        return valor;
    }

    @Override
    public String nomeSabor() {
        String saborNome = "";
        if (sabor == 1) {
            saborNome = "Acaí tradicional";

        }

        if (sabor == 2) {
            saborNome = "Acaí com leite";

        }

        if (sabor == 3) {
            saborNome = "Suco de acaí";

        }
        return saborNome;
    }

}
