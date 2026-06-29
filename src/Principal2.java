public class Principal2 {

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
/*Não é uma boa prática, onde um metodo de instancia altera uma variavel
estática da classe Produto nesse caso e a variavel estatica é a
custoEmbalagem, TOMAR MUITO CUIDADO POIS ESSE TIPO DE PRÁTICA NÃO DA ALERTA
POIS É UM METODO DE INSTACIA NORMAL ACONTECE QUE O METODO DE INSTANCIA
alterarCustoEmbalgaem está alterando a variavel estatica custoEmbalagem,
apesar de funcionar tome cuidado para na hora de ler o código não vai
enganar ninguem.Para isso devemos criar metodos estaticos que iremos
ver na próxima aula.*/
       produto1.alterarCustoEmbalagem(12);
       produto2.alterarCustoEmbalagem(20);

        produto1.imprimirCustoEmbalagem();
        produto2.imprimirCustoEmbalagem();
    }

}
