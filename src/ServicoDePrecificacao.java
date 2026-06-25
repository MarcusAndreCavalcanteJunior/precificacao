public class ServicoDePrecificacao {

    void definirPrecoVenda (Produto produto, double percentualMargemLucro) {
        // poderia ter calculos muito mais complexos aqui

produto.precoVenda = produto.precoCusto * ((percentualMargemLucro / 100) +1);
    }

}

