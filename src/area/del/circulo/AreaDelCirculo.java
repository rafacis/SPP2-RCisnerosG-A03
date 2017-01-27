/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.del.circulo;
import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class AreaDelCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Utilizare math.pow para sacar el area del circulo
        double r,A,Pi;
        Scanner T = new Scanner (System.in);
        Pi = 3.1416;
        
        // Pedir datos 
        System.out.println("Escribe el radio");
        r = T.nextDouble ();
        
        // Operacion 
        A = Pi * (Math.pow(r,2));
        
        System.out.println("El Area es: " + A);
       
       
    }
    
}
