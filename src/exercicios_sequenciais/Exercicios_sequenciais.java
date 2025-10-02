package exercicios_sequenciais;

import java.util.Scanner;

/**
 *
 * @author marcos.silva
 */
public class Exercicios_sequenciais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalcularMediaPonderada();
    }
    
    static void CalcularMediaPonderada() {
        float nota1 = 0; float nota2 = 0; float nota3 = 0; float nota4 = 0;
        
        // entrada
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a 1a. nota: ");
        nota1 = scanner.nextFloat();
        System.out.print("Informe a 2a. nota: ");
        nota2 = scanner.nextFloat();
        System.out.print("Informe a 3a. nota: ");
        nota3 = scanner.nextFloat();
        System.out.print("Informe a 4a. nota: ");
        nota4 = scanner.nextFloat();
        
        // processamento
        /*
            media_ponderada 
            (x1 * p1 + ... + xn * pn) / p1 + ... + pn
        */
        float somaPonderada = (nota1 * 1) + (nota2 * 2) + (nota3 * 3) + (nota4 * 4);
        float somaPeso = 1 + 2 + 3 + 4;
        
        float mediaPonderada = somaPonderada / somaPeso;
        
        // saida
        System.out.println("A média ponderada é " + mediaPonderada);
    }
}
