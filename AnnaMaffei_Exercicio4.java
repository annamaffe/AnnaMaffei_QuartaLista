/*
 * Descrição: recebe um texto com quantidade mínima de 10 caracteres 
 * Autor: Anna Clara
 * Data: 30/05/2023
 */
 import java.util.Scanner;

 public class AnnaMaffei_Exercicio4 {
     public static void main(String[] args) {
         Scanner t = new Scanner(System.in);
         
         //inicializando e criando as variaveis
         System.out.print("Digite um texto: ");
         String texto = t.nextLine();
        //nextLine() para ler uma linha de texto e armazenar na variável texto
         
         //inicio do if e mostrando o resultado
         if (texto.length() > 10) { //length() para verificar o tamanho do texto
             System.out.println("Você digitou um palavrão!");
         } else {
             System.out.println("Você digitou uma palavrinha.");
         }
 
         t.close();
     }
 }
 