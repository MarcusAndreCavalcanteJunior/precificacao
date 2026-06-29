public class Produto {

    static double custoEmbalagem;//está em italico pois é uma variavel
    // estatica.

    double precoCusto;
    double precoVenda;

    void alterarPrecoCusto (double precoCusto) {
        this.precoCusto = precoCusto;
    }
/*Foram alterados os metodos abaixo para metodos estaticos, pois eles não
precisam da instancia de produto e esses metodos são ótimos candidatos para
isso pois eles só alteram a variavels estatica custo.Embalagem e por ser uma
boa pratica, alem de não fazer sentido ter uma instacia de produto para
alterar o custo.Embalagem sendo que o custoEmbalagem não é da instancia e
sim da classe Produto. E isso pode acabar enganando e desse jeito fica
explicito e legivel nas linhas.
Produto.alterarCustoEmbalagem(12);
Produto.imprimirCustoEmbalagem();*/
    static void alterarCustoEmbalagem(double custoEmbalagem){
        Produto.custoEmbalagem = custoEmbalagem;
    }

    static void imprimirCustoEmbalagem () {
        System.out.printf("Custo com embalagem %.2f%n",
                          Produto.custoEmbalagem);
    }
}

