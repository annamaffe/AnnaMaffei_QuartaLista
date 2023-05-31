/*
 * Descrição: receba tres números e enquanto a soma for diferente de 48 ou 71, continue recebendo os velores
 * Autor: Anna Clara
 * Data: 30/05/2023
 */
 import java.util.Scanner;

 public class AnnaMaffei_Exercicio2 {
     public static void main(String[] args) {
         Scanner d = new Scanner(System.in);
         
         //inicialização do "while" e das variaveis
         while (true) {
             System.out.println("Digite três números: ");
             int n1 = d.nextInt();
             int n2 = d.nextInt();
             int n3 = d.nextInt();
             
             //calculo dos tres numeros
             int soma = n1 + n2 + n3;
             
             //inicialização do if para a mostra do 48 e do 71
             if (soma == 48 || soma == 71) {
                 System.out.println("Soma igual a 48 ou 71. Saída do programa.");
             }
             d.close(); 
         }
     }
 }
 