public class Principal {
/*SEMPRE QUE FOR ESCREVER UMA VARIAVEL MAIS ESPECIFICA E NÃO SEMPRE COLOCAR
* O PROPRIO NOME DA CLASSE ATRAPALHA NA INSTANCIAÇÃO DE OBJETOS, TENTE
* SEMPRE DESCREVER MELHOR AS VARIAVEIS. POIS ASSIM VC VAI TER UMA LEGIBILIDADE
* MUITO BOA DO SEU CÓDIGO COMO MOSTRA NO EXEMPLO ABAIXO*/
    public static void main(String[] args) {
        Produto novoProduto = new Produto();
        novoProduto.precoCusto = 100;

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);

            System.out.printf("Preço: %.2f%n", novoProduto.precoVenda);

    }
}
/*Entendi que quando um objeto ou a variavel do objeto é referenciado
em um metodo especifico o objeto ele não é duplicado ele é passado o endereço
do objeto. Qualquer alteração vai refletir para o principal pois é o mesmo objeto
ele só foi e pode ser alterado, no exemplo acima ele sai do metodo volta
para o main o novoProduto continua referenciando o mesmo, porem o precoVenda
já foi alterado no ServicoDePrecificacao.*/
