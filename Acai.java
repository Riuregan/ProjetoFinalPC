public class Acai extends Produto {

     double valor = 0.0;
    Compra gasto = new Compra();

    public Acai(int quantidade, String tamanho, int sabor) {
        super(quantidade, tamanho, sabor);
    }

    @Override
    public double calcularPreco() {
        if (sabor == 1) {
            if (tamanho.equals("g") || tamanho.equals("G")) {
                valor = 34.20 * quantidade;
                return 34.20 * quantidade;
            } else if (tamanho.equals("m") || tamanho.equals("M")) {
                valor = 27.40 * quantidade;

                return 27.40 * quantidade;
            } else if (tamanho.equals("p") || tamanho.equals("P")) {
                valor = 23.50 * quantidade;
                return 27.40 * quantidade;
            }
        }

        if (sabor == 2) {
            if (tamanho.equals("g") || tamanho.equals("G")) {
                valor = 35.20 * quantidade;

                return valor;
            } else if (tamanho.equals("m") || tamanho.equals("M")) {
                valor = 28.40 * quantidade;

                return valor;
            } else if (tamanho.equals("p") || tamanho.equals("P")) {
                valor = 24.50 * quantidade;

                return valor;
            }
        }

        if (sabor == 3) {
            if (tamanho.equals("g") || tamanho.equals("G")) {
                valor = 35.20 * quantidade;

                return valor;
            } else if (tamanho.equals("m") || tamanho.equals("M")) {
                valor = 28.40 * quantidade;

                return valor;
            } else if (tamanho.equals("p") || tamanho.equals("P")) {
                valor = 24.50 * quantidade;
                return valor;
            }
        }
        return 0;

    }

    @Override
    public double ultimoGasto() {
        return valor;
    }

}
