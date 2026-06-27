public class Principal {

    public static void main(String[] args) {
        Produto.custoEmbalagem = 10;

        Produto novoProduto = new Produto();

        novoProduto.alterarPrecoCusto(100);

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);

            System.out.printf("Preço: %.2f%n", novoProduto.precoCusto);
            System.out.printf("Preço: %.2f%n", novoProduto.precoVenda);

    }
}
/*Tomar cuidado sempre com static
 ao criar produto1 e produto2, o Java não "atribui 20 para os dois".
 Ele cria dois objetos distintos que, ao precisarem do valor de
 custoEmbalagem, são direcionados ao mesmo endereço de memória onde a classe
 Produto guarda esse único valor 20.
 Agora, custoEmbalagem com static — ela pertence a quem? Ao produto1,
 ao produto2, ou a outra coisa?
 acho que a outra coisa pois o custoEmbalagem pertence ao objeto Produto
 da classe principal ao criar produto1 e produto2, o Java não "atribui 20
 para os dois". Ele cria dois objetos distintos que, ao precisarem do valor
 de custoEmbalagem, são direcionados ao mesmo endereço de memória onde a
 classe Produto guarda esse único valor 20. esse finalzinho eu só dei uma
 verificada */