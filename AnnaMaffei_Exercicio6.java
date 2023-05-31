/*
 * Descrição: some 10 numeros inteiros e exibe a raiz quadrada da soma 
 * Autor: Anna Clara
 * Data: 30/05/2023
 */
import java.util.Scanner;

public class AnnaMaffei_Exercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //criação e inicialização das variaveis
        int cont = 0;
        int soma = 0;
        int valor = 0;
        double raiz = 0.0;

        //inicio do "while" para o usuario digitar os 10 numeros
        while (cont < 10) {
            System.out.print("Digite um valor (inteiro positivo):");
            valor = s.nextInt();
            
            //if para o algoritmo ignorar a entrada de numeros negativo 
            if (valor >= 0) {
                soma += valor;
                cont++;
            }
        }
        
        //calcula a raiz quadrada da soma
        raiz = Math.sqrt(soma);

        //mostra os resultados
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A raiz quadrada da soma é: " + raiz);

        s.close();
    }
}

