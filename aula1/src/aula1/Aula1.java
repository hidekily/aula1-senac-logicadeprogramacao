/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1;
/**
 *
 * @author murilo.htaue
 */

//imports
import java.util.Scanner;


public class Aula1 {
    public static void main(String[] args) {
        int valorMax = 10;
        int counter = 0;
        int res = 0;
        // criacao do input        
        Scanner input = new Scanner(System.in);
        System.out.println("digie o texto que voce quer que aparece no antes do resultado");
        var hi = input.nextLine();
        
            for(; counter < valorMax; counter++){
                System.out.println(hi + ": " + res);
                res += 2;
            }
            
        // agora vou calc uma nota        
        double x = 6.5;
        double y = 2.3;
        double z = 10;
        
        double response = x + y;
        System.out.printf("sua nota: " + response + "\n");
        
        /* 
            o 06.2 siginifica "quero que o texto contenha 6 digitos E o maximo de 2 casas decimais", inclusive o "," conta como digito
            entao, %06.02 de 10 siginifica 010,00 = 6 digitos e 2 casas decimais 
        */
        
        System.out.printf("z = %06.2f \n", z);
        
        // agora, vamos fazer um input
        
        System.out.println("digite o valor de A: ");
        double a = input.nextFloat();
        System.out.println("digite o valor de B:");
        double b = input.nextFloat();
        double responseAB = a + b;
        
        System.out.printf("o valor da soma de a + b = %.2f \n", responseAB);
        
    }
}
    
