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

    private String Id, Title, Year, Duration, Gender, Cover, Description;
    Scanner sca = new Scanner(System.in);
    int option; //Guardaremos la opcion del usuario
    Songs p1 = new Songs("1", "Heroe Favorito", "2017", "3:59", "Bachata", "RomeoSantos.jpg", "Cancion hit del autor");
    Songs p2 = new Songs("2", "Culpa al corazon", "2017", "4:52", "Bachata", "PrinceRoyce.jpg", "Exito del cantante en 2017");
    Songs p3 = new Songs("3", "Pegame tu vicio", "2000", "5:01", "Merengue", "EddyHerrera.jpg", "Hits de fiestas colombianas");
    Songs p4 = new Songs("4", "No hay pesos", "1995", "4:42", "Merengue", "Loscantantes.jpg", "Cancion importante en los 90");
    Songs p5 = new Songs("5", "Believer", "2017", "3:24", "Rock", "Imagine Dragons.jpg", "Cancion emblematica del grupo Imagine Dragons");
    Songs p6 = new Songs("6", "Fiesta Pagana", "2000", "4:57", "Rock", "Mago de oz.jpg", "El señor de los gramillos");
    Songs p7 = new Songs("7", "Comen & Get It", "2013", "3:51", "Pop", "SelenaGomez.jpg", "Stars Dance");
    Songs p8 = new Songs("8", "Rolling in the Deep", "2011", "3:49", "Pop", "Adele.jpg", "Hot 100 55th Anniversary: The All-Time Top 100 Songs");
    Songs p9 = new Songs("9", "No me toquen ese bals", "1989", "2:32", "Clasica", "JulioJaramillo.jpg", "Musica clasica pero sabrosa");
    Songs p10 = new Songs("10", "Como te extraño mi amor", "1987", "3:09", "Clasica", "LeoDan.jpg", "Tema imponente del autor");
    public List<Songs> s = new ArrayList<Songs>();
    String search;

    @Override
    public void menu() {
        boolean exit = false;
        do {
            System.out.println("1. crear playlist");
            System.out.println("2. Filtra canciones del mismo genero");
            System.out.println("3. Filtrar canciones en el mismo año");
            System.out.println("4. Ordenar por fecha");
            System.out.println("5. Ordenar por duración");
            System.out.println("6. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                option = sca.nextInt();

                switch (option) {
                    case 1:
                        create_playlist();
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
        searchGender((ArrayList<Songs>) s);
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
        Collections.sort(s, new duration());
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
        Collections.sort(s);
        for (Songs elemento : s) {
            System.out.println(elemento);
        }

    }

    @Override
    public void create_playlist() {
        createList((ArrayList<Songs>) s);
    }

    

    public void createList(ArrayList<Songs> Introduce) {

        
            System.out.println("Ingrese una Id");
            Id = sca.next();
            System.out.println("Ingrese un titulo");
            Title = sca.next();
            System.out.println("Ingrese el año");
            Year = sca.next();
            System.out.println("Ingrese la duracion");
            Duration = sca.next();
            System.out.println("Ingrese un genero");
            Gender = sca.next();
            System.out.println("Ingrese la caratula");
            Cover = sca.next();
            System.out.println("Ingrese una descripcion");
            Description = sca.next();

            Introduce.add(new Songs(Id, Title, Year, Duration, Gender, Cover, Description));
        
    }
    
    public void searchGender(ArrayList<Songs> Search){
        int cont = 0;
        System.out.println("Escribe un genero musical");
        search = sca.next();
        for (Songs elemento : Search) {
            if (elemento.getGender().equalsIgnoreCase(search)) {//Buscamos el ALUMNO mediante un EQUALS
                System.out.println(elemento);
                cont += 1;
            }
        }
        if (cont == 0) {
            System.out.println("No hay generos con ese nombre");
        }
    }

}
