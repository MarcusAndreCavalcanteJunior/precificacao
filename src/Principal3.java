public class Principal3 {

    public static void main(String[] args) {
        Produto.alterarCustoEmbalagem(10);

        Produto produto = new Produto();
        produto.alterarPrecoCusto(100);

        System.out.printf("Total de custos: %.2f%n",
               Produto.calcularCustosTotais(produto));
    }
}
/*Nessa aula aprendi como metodos estaticos acessam membros de uma instancia
* podendo ser uma variavel de intancia ou pode ser um metodo de instancia
* quando queremos deixar mais global ou membros de instancia que é variavel
* ou o metodo. Como foi abordado no exemplo da aula com o metodo
* static double calcularCustosTotais (Produto produto) {
        return produto.precoCusto + Produto.custoEmbalagem;
    }  como com o this não pode ser referenciado no contexto estatico
* pois não tem uma instancia para ser executada sendo metodo de classe, porem
* não tem um objeto nesse caso aqui é que um metodo de classe ou estatico
* não pode acessar uma variavel de instancia, por isso criamos uma instancia de
* parametro para poder acessar no caso o Produto produto como foi abordado
* acima. */
