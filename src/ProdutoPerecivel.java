
import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {
    private static final double DESCONTO = 0.25;
    private static final int PRAZO_DESCONTO = 7;
    private LocalDate dataDeValidade;

    public ProdutoPerecivel(String desc, Double precoCusto, Double margemLucro, LocalDate validade) {
        super(desc, precoCusto, margemLucro);
        dataDeValidade = validade;
    }

    @Override
    public double valorDeVenda() {
        double precoFinal = precoCusto * (1+margemLucro);
        if(LocalDate.now().minusDays(PRAZO_DESCONTO).isBefore(dataDeValidade)) {
            return precoFinal * (1-DESCONTO);
        }
        return precoFinal;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
