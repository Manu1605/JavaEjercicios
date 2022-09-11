
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ManuP
 */
public class ejercicioMorse {
    
    public static String AbcMorse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    
    public static String convertirMorse(String mensaje){
        
        mensaje=mensaje.toLowerCase();
        
        String mensajeEnMorse="";
        
        char caracteres[] = mensaje.toCharArray();
        
        for (int i = 0; i < caracteres.length; i++) {
            mensajeEnMorse += AbcMorse[caracteres[i]-'a'];
            
        }
        
        return mensajeEnMorse;
    }
    
    public static int cantidadMensajes(String mensajeEnMorse, int longitudMensaje){
        
        int n=0;
        
        for (int i = 0; i < AbcMorse.length; i++) {
            int nSub = AbcMorse[i].length();
            if(nSub<=mensajeEnMorse.length()){
                String subcadena = mensajeEnMorse.substring(0,nSub);
                if(subcadena.equals(AbcMorse[i])){
                    if(nSub<=mensajeEnMorse.substring(nSub).length()){
                        String restante = mensajeEnMorse.substring(nSub);
                    }
                }
            }
        }
        
        return n;
    }
    
    public static void main(String[] args) {
        
        String frase = JOptionPane.showInputDialog("Introduce la frase");
        
        String fraseMorse = convertirMorse(frase);
        
        JOptionPane.showMessageDialog(null, "La frase en morse es: "+fraseMorse);
        
    }
    
}
