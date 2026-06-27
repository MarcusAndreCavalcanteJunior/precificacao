public class Produto {

    static double custoEmbalagem;//está em italico pois é uma variavel estatica.
    double precoCusto;
    double precoVenda;

    void alterarPrecoCusto (double precoCusto) {
        this.precoCusto = precoCusto;
    }

    void imprimirCustoEmbalagem () {
        System.out.printf("Custo com embalagem %.2f%n",
                          Produto.custoEmbalagem);
    }
}

