public class Refrigerante extends Produto {

    private double valor = 0.0;

    public Refrigerante(int quantidade, String tamanho, int sabor) {
        super(quantidade, tamanho, sabor);
    }

    @Override
    public double calcularPreco() {
        if (sabor == 1) {
            if (tamanho.equals("g") || tamanho.equals("G")) {
                valor = 34.20 * quantidade;
            } else if (tamanho.equals("m") || tamanho.equals("M")) {
                valor = 27.40 * quantidade;
            } else if (tamanho.equals("p") || tamanho.equals("P")) {
                valor = 23.50 * quantidade;
            }
        }

        if (sabor == 2) {
            if (tamanho.equals("g") || tamanho.equals("G")) {
                valor = 35.20 * quantidade;

            } else if (tamanho.equals("m") || tamanho.equals("M")) {
                valor = 28.40 * quantidade;

            } else if (tamanho.equals("p") || tamanho.equals("P")) {
                valor = 24.50 * quantidade;

            }
        }

        if (sabor == 3) {
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
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String nomeSabor() {
        String saborNome = "";
        if (sabor == 1) {
            saborNome = "Coca-cola";

        }

        if (sabor == 2) {
            saborNome = "Guaraná Antarctica";

        }

        if (sabor == 3) {
            saborNome = "Fanta laranja";

        }
        return saborNome;
    }

}
