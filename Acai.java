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
                valor = 12.50 * quantidade;
            } else if (tamanho.equals("m") || tamanho.equals("M")) {
                valor = 10.30 * quantidade;
            } else if (tamanho.equals("p") || tamanho.equals("P")) {
                valor = 8.00 * quantidade;
            }
        }

        if (sabor == 2) {
            // this.nomeSabor = "Acaí com leite";
            if (tamanho.equals("g") || tamanho.equals("G")) {
                valor = 12.50 * quantidade;

            } else if (tamanho.equals("m") || tamanho.equals("M")) {
                valor = 10.30 * quantidade;

            } else if (tamanho.equals("p") || tamanho.equals("P")) {
                valor = 8.00 * quantidade;

            }
        }

        if (sabor == 3) {
            // this.nomeSabor = "Suco de acaí";
            if (tamanho.equals("g") || tamanho.equals("G")) {
                valor = 12.50 * quantidade;

            } else if (tamanho.equals("m") || tamanho.equals("M")) {
                valor = 10.30 * quantidade;

            } else if (tamanho.equals("p") || tamanho.equals("P")) {
                valor = 8.00 * quantidade;
            }
        }
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
