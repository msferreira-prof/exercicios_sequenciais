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
//        CalcularMediaPonderada();
//        CalcularValorCofre();   
        ConverterCelsiusFahrenheit();
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
    
    static void CalcularValorCofre() {
        double qtdDolares = 0.0d;
        double cotacaoDolar = 0.0d;
        double valorReais = 0.0d;
        
        // entrada de dados
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade do US$ no cofre: ");
        qtdDolares = scanner.nextDouble();
        System.out.print("Informe a cotação do US$ do dia: ");
        cotacaoDolar = scanner.nextDouble();
        
        // processamento
        valorReais = qtdDolares * cotacaoDolar;
        
        // saida de dados
        System.out.println("O cofre guarda R$ " + valorReais);
        
    }
    
    static void ConverterCelsiusFahrenheit() {
        double celsius, fahrenheit = 0.0d;
        
        // entrada de dados
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a temperatura em graus Celsius: ");
        celsius = scanner.nextDouble();
        
        // processamento
        fahrenheit = (9 * celsius + 160) / 5;
        
        // saida de dados
        System.out.println("A temperatura em Celsius....... " + celsius);
        System.out.println("A temperatura em Fahreinheit... " + fahrenheit);
    }
}
