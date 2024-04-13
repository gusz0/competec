/*
1. Crie uma variável que armazena o preço de uma laranja;
2. Crie uma variável que informa o preço de uma uva;
3. Some o preço da laranja com a uva;
*/
import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {
    
    
        Scanner sc = new Scanner(System.in);


        // Escreva seu código aqui ⬇️
double precolaranja = sc.nextDouble();
double precomaça = sc.nextDouble();
double somapreco = precolaranja + precomaça;

System.out.println(somapreco); 

// Recebam duas idades, façam a soma delas e imprima no terminal
int idade = sc.nextInt();
int idadeb = sc.nextInt();
int somaidade = idade + idadeb;
System.out.println(somaidade);

}
}
