/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_parejas;

import java.util.InputMismatchException;
import java.util.Scanner;
import taller_parejas.Songs.Songs;


/**
 *
 * @author tania
 */
public class Taller_parejas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Songs p1 = new Songs(1,"Heroe Favorito",2017 ,"3:59","Bachata","RomeoSantos.jpg","Cancion hit del autor");
        Songs p2 = new Songs(2,"Culpa al corazon",2017 ,"4:52","Bachata","PrinceRoyce.jpg","Exito del cantante en 2017");
        Songs p3 = new Songs(3,"Pegame tu vicio",2000 ,"5:01","Merengue","EddyHerrera.jpg","Hits de fiestas colombianas");
        Songs p4 = new Songs(4,"No hay pesos",1995 ,"4:42","Merengue","Loscantantes.jpg","Cancion importante en los 90");
        Songs p5 = new Songs(5,"November Rain",1992,"12:30","Rock","GunsN'Roses.jpg","Cancion emblematica del grupo Guns N Roses");
        Songs p6 = new Songs(6,"Fiesta Pagana",2000 ,"4:57","Rock","Mago de oz.jpg","El señor de los gramillos");
        Songs p7 = new Songs(7,"Comen & Get It",2013 ,"3:51","Pop","SelenaGomez.jpg","Stars Dance");
        Songs p8 = new Songs(8,"Rolling in the Deep",2011 ,"3:49","Pop","Adele.jpg","Hot 100 55th Anniversary: The All-Time Top 100 Songs");
        Songs p9 = new Songs(9,"No me toquen ese bals",1989 ,"2:32","Clasica","JulioJaramillo.jpg","Musica clasica pero sabrosa");
        Songs p10 = new Songs(10,"Como te extraño mi amor",1987 ,"3:09","Clasica","LeoDan.jpg","Tema imponente del autor");
        
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
