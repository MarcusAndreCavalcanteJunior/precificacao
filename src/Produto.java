public class Produto {

    static double custoEmbalagem;

    double precoCusto;
    double precoVenda;
/*Por que this não funciona em metodo static? this aponta para o objeto
que chamou o metodo. Mas metodo static é chamado pela classe
(Produto.calcularCustosTotais(...)), sem nenhum objeto envolvido. Se não
tem objeto, o this não tem nada para apontar — por isso o Java bloqueia.
Solução: passar a instância como parâmetro (Produto produto)
e acessar normalmente via produto.precoCusto.*/
    static double calcularCustosTotais (Produto produto) {
        return produto.precoCusto + Produto.custoEmbalagem;
    }

    void alterarPrecoCusto (double precoCusto) {
        this.precoCusto = precoCusto;
    }

    static void alterarCustoEmbalagem(double custoEmbalagem){
        Produto.custoEmbalagem = custoEmbalagem;
    }

    static void imprimirCustoEmbalagem () {
        System.out.printf("Custo com embalagem %.2f%n",
                          Produto.custoEmbalagem);
    }
}

