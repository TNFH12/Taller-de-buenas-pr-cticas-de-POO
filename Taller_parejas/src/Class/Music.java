/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Interfaces.MusikFilter;

import java.util.*;

/**
 *
 * @author tania
 */
public class Music extends music_libraries implements MusikFilter {

    Scanner sca = new Scanner(System.in);
    int option; //Guardaremos la opcion del usuario
    Songs p1 = new Songs("1", "Heroe Favorito", "2017", "3.59", "Bachata", "RomeoSantos.jpg", "Cancion hit del autor");
    Songs p2 = new Songs("2", "Culpa al corazon", "2017", "4.52", "Bachata", "PrinceRoyce.jpg", "Exito del cantante en 2017");
    Songs p3 = new Songs("3", "Pegame tu vicio", "2000", "5.01", "Merengue", "EddyHerrera.jpg", "Hits de fiestas colombianas");
    Songs p4 = new Songs("4", "No hay pesos", "1995", "4.42", "Merengue", "Loscantantes.jpg", "Cancion importante en los 90");
    Songs p5 = new Songs("5", "November Rain", "1992", "12.30", "Rock", "GunsN'Roses.jpg", "Cancion emblematica del grupo Guns N Roses");
    Songs p6 = new Songs("6", "Fiesta Pagana", "2000", "4.57", "Rock", "Mago de oz.jpg", "El señor de los gramillos");
    Songs p7 = new Songs("7", "Comen & Get It", "2013", "3.51", "Pop", "SelenaGomez.jpg", "Stars Dance");
    Songs p8 = new Songs("8", "Rolling in the Deep", "2011", "3.49", "Pop", "Adele.jpg", "Hot 100 55th Anniversary: The All-Time Top 100 Songs");
    Songs p9 = new Songs("9", "No me toquen ese bals", "1989", "2.32", "Clasica", "JulioJaramillo.jpg", "Musica clasica pero sabrosa");
    Songs p10 = new Songs("10", "Como te extraño mi amor", "1987", "3.09", "Clasica", "LeoDan.jpg", "Tema imponente del autor");
    public List<Songs> s = new ArrayList<Songs>();
    String busqueda;

    @Override
    public void menu() {
        boolean exit = false;
        do {
            System.out.println("1. crear playlist");
            System.out.println("2. Filtra canciones del mismo genero");
            System.out.println("3. Filtrar canciones en el mismo año");
            System.out.println("4. Ordenar por fecha");
            System.out.println("5. Ordenar por duracio");
            System.out.println("6. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                option = sca.nextInt();

                switch (option) {
                    case 1:

                    case 2:
                        Gender_filter();
                        break;
                    case 3:
                        Same_year();
                        break;
                    case 4:
                        Order_date();
                        break;
                    case 5:
                        Duration_order();
                        break;
                    case 6:
                        exit = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sca.next();
            }
        } while (!exit);
    }

    @Override
    public void Gender_filter() {
        s.add(p1);
        s.add(p2);
        s.add(p3);
        s.add(p4);
        s.add(p5);
        s.add(p6);
        s.add(p7);
        s.add(p8);
        s.add(p9);
        s.add(p10);
        System.out.println("Escribe un genero musical");
        busqueda = sca.next();
        s.indexOf(busqueda);
        for (Songs elemento : s) {
            System.out.println(elemento);
        }

    }

    @Override
    public void Same_year() {
        s.add(p1);
        s.add(p2);
        s.add(p3);
        s.add(p4);
        s.add(p5);
        s.add(p6);
        s.add(p7);
        s.add(p8);
        s.add(p9);
        s.add(p10);
        System.out.println("1. Filtrar canciones en el mismo año ascendente");
        System.out.println("2. Filtrar canciones en el mismo año descendente");
        try {
            System.out.println("Escribe una de las opciones");
            option = sca.nextInt();

            switch (option) {
                case 1:
                    Collections.sort(s);
                    for (Songs elemento : s) {
                        System.out.println(elemento);
                    }
                    menu();
                    break;
                case 2:
                    Collections.sort(s, Collections.reverseOrder());
                    for (Songs elemento : s) {
                        System.out.println(elemento);
                    }
                    menu();
                    break;

                default:
                    System.out.println("Solo números entre 1 y 2");
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sca.next();
        }
    }

    @Override
    public void Duration_order() {

        s.add(p1);
        s.add(p2);
        s.add(p3);
        s.add(p4);
        s.add(p5);
        s.add(p6);
        s.add(p7);
        s.add(p8);
        s.add(p9);
        s.add(p10);
        Collections.sort(s);
        for (Songs elemento : s) {
            System.out.println(elemento);
        }

    }

    @Override
    public void Order_date() {
        s.add(p1);
        s.add(p2);
        s.add(p3);
        s.add(p4);
        s.add(p5);
        s.add(p6);
        s.add(p7);
        s.add(p8);
        s.add(p9);
        s.add(p10);
        Collections.sort(s, new year());
        for (Songs elemento : s) {
            System.out.println(elemento);
        }

    }

    @Override
    public void create_playlist() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
