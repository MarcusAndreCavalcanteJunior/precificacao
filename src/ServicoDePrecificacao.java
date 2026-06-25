public class ServicoDePrecificacao {
/*NÃO É UMA BOA PRÁTICA VC FICAR ALTERANDO O VALOR DE PARAMETRO, O IDEAL
* CASO VC PRECISE ALTERAR O VALOR DE UMA VARIAVEL É QUE VC ECLARE UMA NOVA
* VARIAVEL COMO IREI COMENTAR NO METODO ESCRITO */
    void calcularPrecoVenda (double precoCusto) {
        // adciona 20% de margem de lucro
        precoCusto = precoCusto * 1.20;

        // faz varias outras coisas
        /*JEITO CERTO SERIA MasNÃO É UMA BOA PRÁTICA FICAR ALTERANDO O
        VALOR DA VARIAVEL QUE VC RECEBEU COMO PARAMETRO
        double calcularPrecoVenda (double precoCusto) {
        * double precoVenda = precoCusto * 1.20
        * return precoVenda
        }*/
    }


}


/* Eu não sabia que da para listar todos os TODO implemetar no caso o que
fazer a tradução e para achar eles é ir nos nos 3 pontinhos e ele vai e
listar todos para vc*/
