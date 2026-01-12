// AUla 1 de Anatomia de Classe
public class MinhaClasse {
    

    public static void main(String[] args) {
        System.out.print("Olà Mundo");
        String primeiroNome = "Matheus";
        String segundoNome = "Rodrigues";

        String nomeCompleto= nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    // AUla 1 de Anatomia de Classe

    //Aula 2 de Anatomia de Classe padrao de nomenclatura.
/*Aula 2 de Anatomia de Classe padrao de nomenclatura.
    Qunado se trata do padrão de mnoenclatura e tão importante quanto o algoritmo a ser escrito.
    primero topico todo arquivo .java deve começar com letra maiúscula e se for um nome composta tambem deve começar com a letra maiuscula tambem conhecido como "cammelCase".
    toda classe deve possuir o mesmo nome do arquivo 
    ex: Calculadora.java
    public class Calculadora {}.


    tipos de variaveis 

    String BR = "Brasil";
    double PI  = 3.14;
    int ESTADOS_BRSILEIROS = 27;
    int ANO_2000 = 2000;


    ex: final String = " final "

    "final" torna á variavel se torna imutavel 
    OBS: isso ta me lembrando Dart
*/
//Aula 3 nomenclatura e declaração de variaveis e metodos
/*
    toda vaiavel deve começar pelo tipo nome = Atribuoção(opcional em alguns casos)

    ex: 
    String meu nome = "Gleyson";
    int anoFabicacao = 2022;
    booLean verdadeira = true;
    booLean falso =false;
    boolean resposta;

  variavel reatribida
    anoFabricacao = 2025;


    Métodos

    TipoDeRetorno NomeObjetivo  Parametros

    ex 
    int somar (int numeroUm, int numeroDois){}


    ex2
    este metodo recebe um paramentro long e transforma para string

    String formatarCep(long cep)

    ou seja um metodo recebe como parametros tipos diferentes e retornar outros tipos


*/


    public static String nomeCompleto(String primeiroNome, String segundoNome){
        
     
    return " "+"Resultado do Método"+primeiroNome.concat(" ").concat(segundoNome);

}
// Aula 4(foda-se) e 5(estrutura de pasta)




//Aula 6 


}


