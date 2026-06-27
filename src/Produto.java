public class Produto {

    double precoCusto;
    double precoVenda;

    void alterarPrecoCusto (double precoCusto) {
        this.precoCusto = precoCusto;/* Agora utilizando a palavra chave
this o metodo vai alterar o valor da variavel de instancia precoCusto do
objeto Produto. E agora com o mesmo nome do parametro e da
variavel de instancia precoCusto e vai funcionar e alterar normalmente.*/
    }
    /*void alterarPrecoCusto (double novoPrecoCusto) {
        precoCusto = novoPrecoCusto;
    } dessa forma tbm altera mas caso queira usar a mesma variavel de
    instancia só usar a palavra chave this. como mostra acima assim da
    pra alterar a variavel de instancia pelo valor do parametro desajado.*/
}
/*Exato! Você lembrou certo. O Java prioriza o parâmetro local — então
precoCusto = precoCusto vira o parâmetro recebendo o valor dele mesmo.
A variável de instância do objeto nunca é tocada, por isso fica zerada.
Isso tem um nome técnico: shadowing (sombreamento). O parâmetro local
"esconde" a variável de instância.
E é exatamente aí que o this resolve — ele diz pro Java:
"esse aqui é o atributo do objeto, não o parâmetro".Então resumindo:

precoCusto = precoCusto → parâmetro recebendo ele mesmo, instância
intocada this.precoCusto = precoCusto → instância do objeto recebendo
o valor do parâmetro  */
