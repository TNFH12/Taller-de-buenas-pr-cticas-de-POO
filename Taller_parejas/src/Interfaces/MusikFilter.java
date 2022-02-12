package Interfaces;

/**
 *Esta interfaces contiene los metodos para las opciones del menu
 * @author Jair Ortiz - jairalbert1997@hotmail.com
 * @author Tania Forero - tanianickoll11@gmail.com
 * @version 1.0 2022-02-12 
 */
public interface MusikFilter {

    /*interfaces metodos
    * Se crean los metodos que realizaran: 
    *1. Los filtros de las cancione por Año y Genero.
    *2. La organizacion por Duracion y Fecha.
    * 3. Ademas se crea la opcion de agregar una nueva cancion para una playlist
    */
    void Gender_filter();

    void Same_year();

    void Duration_order();

    void Order_date();

    void create_playlist();

}
