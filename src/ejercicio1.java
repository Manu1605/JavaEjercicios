
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ManuP
 */
public class ejercicio1 {
    
    
    
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidad de casos");
        int casos = entrada.nextInt();
        entrada.nextLine();
        
        for (int i = 0; i < casos; i++) {
            System.out.println("Introduzca la frase");
            String frase = entrada.nextLine();
            
            String palabras[] = frase.split(" ");
            System.out.println("Caso #"+(i+1)+": ");
            
            String resultado="";
            
            for (int j = palabras.length; j > 0; j--) {
                resultado+=palabras[j-1];
                if(j>1){
                    resultado+="\n";
                }
            }
            
            System.out.println(resultado+"\n");
        }
        
    }
    
}
