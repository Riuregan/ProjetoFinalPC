package ExercInventario;

public class Ferramenta extends Bem {

    private String acao;

    public Ferramenta(int quantidade, String acao) {
        super(quantidade);
        this.acao = acao;
    }

    @Override
    public double converterParaDolar(double dolarComercial) {
        double valor = 0;
        if (acao.equals("escudo")) {
            valor = quantidade * 0.3 * dolarComercial * 0.05;
        } else if (acao.equals("bloqueio")) {
            valor = quantidade * 0.3 * dolarComercial * 0.05;
        } else if (acao.equals("desativacao")) {
            valor = quantidade * 0.2 * dolarComercial * 0.05;
        } else if (acao.equals("inativacao")) {
            valor = quantidade * 0.2 * dolarComercial * 0.05;
        } else if (acao.equals("auto ativicao")) {
            valor = quantidade * 0.1 * dolarComercial * 0.05;
        }
        return valor;
    }

}
