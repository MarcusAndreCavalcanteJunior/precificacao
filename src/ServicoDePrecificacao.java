public class ServicoDePrecificacao {

    void definirPrecoVenda (Produto produto, double percentualMargemLucro) {
/*Como o metodo é estatico não precisamor de uma instacia ou de um objeto
* da classe Matematica não precisamos instanciar basta chamar a classe
* Matematica e o metodo calcularAcresicimo como mostra na linha abaixo
* e não esquecer dos parametros produto.precoCusto, percentualMargemLucro
* e assim refatoramos e codigo usando a nossa classe utilitaria */
        double precoVendaCalculado = Matematica.calcularAcrescimo(
                produto.precoCusto, percentualMargemLucro);
        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda =  precoVendaCalculado;
    }

}
/*OBS: DEVEMOS EVITAR USAR MUITOS METODOS ESTATICOS FICAMOS MUITO PROXIMOS DA
PROGRAMAÇÃO PROCEDURAL E NÃO ADE ORIENTAÇÃO A OBJETOS. Mas em alguns casos
não há como evitar usar metodos estaticos e usamos eles em classes
utilitrias.*/
