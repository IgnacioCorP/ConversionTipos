/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiontipos;

import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class ConversionTipos {
    public static Scanner ent = new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("\t\tBIENVENIDO A LA APLICACIÓN\n\n");
        System.out.print("Introducir texto: ");
        
        String N = ent.nextLine();
        int numEntero = Integer.parseInt(N);
        System.out.print("Introducir otro texto: ");
        numEntero = ent.nextInt();
       
        
    }
    
}
