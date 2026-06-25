Isso é um conceito muito importante chamado passagem por valor — quando você passa um double como parâmetro, o Java faz uma cópia do valor. Então o método trabalha com a cópia, e a variável original no main nunca é alterada.
É por isso que alterar o parâmetro dentro do método é considerado má prática — você pensa que está mudando algo, mas na verdade está mudando só a cópia!
Isso vai fazer ainda mais sentido quando você chegar no Módulo 09 de gerenciamento de memória.
