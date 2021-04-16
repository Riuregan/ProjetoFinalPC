public class Comandos {

    int veracidade = 0;

    public void pressAnyKeyToContinue() {
        System.out.println("Press Enter key to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

    public int conferirVeracidadePizza(int sabor, String tamanho) {
        veracidade = 0;
        if ((tamanho.equals("g") || tamanho.equals("G") || tamanho.equals("m") || tamanho.equals("M")
                || tamanho.equals("p") || tamanho.equals("P")) && (sabor > 0 && sabor < 7)) {
            veracidade++;
        }
        return veracidade;
    }

    public int conferirVeracidadeAcai(int sabor, String tamanho) {
        veracidade = 0;
        if ((tamanho.equals("g") || tamanho.equals("G") || tamanho.equals("m") || tamanho.equals("M")
                || tamanho.equals("p") || tamanho.equals("P")) && (sabor > 0 && sabor < 4)) {
            veracidade++;
        }
        return veracidade;
    }

    public int conferirVeracidadeRefri(int sabor, String tamanho) {
        veracidade = 0;
        if ((tamanho.equals("g") || tamanho.equals("G") || tamanho.equals("m") || tamanho.equals("M")
                || tamanho.equals("p") || tamanho.equals("P")) && (sabor > 0 && sabor < 4)) {
            veracidade++;
        }
        return veracidade;
    }

}
