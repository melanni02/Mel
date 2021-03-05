/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramide;
import java.util.Scanner;

/**
 *
 * @author Flor Melanni Infante
 */
public class Piramide {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner piramide=new Scanner (System.in);
        System.out.println("Ingrese el numero de filas: ");
        int filas=piramide.nextInt();
        piramide.close();
        
        System.out.println();
        for(int alto =0; alto<=filas; alto++){
        //espacios que lleva
            for (int espacio=1; espacio<=filas-alto; espacio++){
            System.out.print("");
            }
            //asteriscos
            for(int asteriscos=1; asteriscos<=(alto*1); asteriscos++){
            System.out.print("*");
            }
            System.out.println();  
        }
        
    }
   }
    

    

