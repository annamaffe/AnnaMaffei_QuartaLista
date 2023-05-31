/*
 * Descrição: gere 50 numeros inteiros e reais no aleatorio, some os dois e mostre qual a maior soma no final
 * Autor: Anna Clara
 * Data: 30/05/2023
 */
import java.util.Random;

    public class AnnaMaffei_Exercicio3 {
    public static void main(String[] args) {

        //criação e inicialização das variaveis
        int inteiro = 0;
        double real = 0.0;
        
        // "for" para gerar 50 numeros inteiros aleatórios e somar
        for (int i = 0; i < 50; i++) {
            int ninteiro = NumeroInteiroAleatorio();
            inteiro += ninteiro;
        }
        
        // "for" para gerar 50 numeros reais aleatórios e somar
        for (int i = 0; i < 50; i++) {
            double nreal = NumeroRealAleatorio();
            real += nreal;
        }
        
        // "if" e "else" para comparar as duas somas e ver qual é maior ou se são iguais
        if (inteiro > real) {
            System.out.println("A soma dos números inteiros é maior: " + inteiro);
        } else if (inteiro < real) {
            System.out.println("A soma dos números reais é maior: " + real);
        } else {
            System.out.println("As duas somas são iguais: " + inteiro);
        }
    }
    
    // Gera um número inteiro aleatório entre 0 e 1000
    private static int NumeroInteiroAleatorio() {
        Random ale = new Random();
        return ale.nextInt(1001);
    }
    
    // Gera um número real aleatório entre 0.0 e 1.0
    private static double NumeroRealAleatorio() {
        Random ale = new Random();
        return ale.nextDouble();
    }
}

 

