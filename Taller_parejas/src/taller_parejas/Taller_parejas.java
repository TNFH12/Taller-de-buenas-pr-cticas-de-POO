/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_parejas;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author tania
 */
public class Taller_parejas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sca = new Scanner(System.in);
        boolean exit = false;
        int option; //Guardaremos la opcion del usuario

        /**
        * usuaremos un do while para el menu.
        */
         do{
 
            System.out.println("1. Filtra canciones del mismo genero");
            System.out.println("2. Filtrar canciones en el mismo año");
            System.out.println("3. Ordenar por fecha");
            System.out.println("4. Ordenar por duracio");
            System.out.println("5. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                option = sca.nextInt();
 
                switch (option) {
                    case 1:
                       
                        break;
                    case 2:
                     
                        break;
                    case 3:
                     
                        break;
                    case 4:
                     
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sca.next();
            }
        }while (!exit);
        
    }
    
}
