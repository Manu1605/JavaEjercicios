
import javax.swing.*;

/**
 *
 * @author ManuP
 */
public class ejercicio1 {
    
    
    
    public static void main(String[] args) {

        boolean flag;
        int casos=0;
        do{
            flag=false;
            try {
                casos = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la cantidad de casos"));
                if(casos<=0){
                    JOptionPane.showMessageDialog(null, "Introduce valores numéricos positivos");
                    flag=true;
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Introduce valores numéricos positivos");
                flag=true;
            }
        }while(flag);

        for (int i = 0; i < casos; i++) {
            String frase = JOptionPane.showInputDialog(null, "Introduzca la frase");
            
            String[] palabras = frase.split(" ");
            String resultado="";
            
            for (int j = palabras.length; j > 0; j--) {
                resultado+=palabras[j-1];
                if(j>1){
                    resultado+="\n";
                }
            }
            JOptionPane.showMessageDialog(null, "Caso #"+(i+1)+": \n"+resultado);
        }
        
    }
    
}
