package Class;

import java.util.Comparator;

/**
 * Esta clase contiene el metodo para la organizacion de duracion
 *
 * @author Jair Ortiz - jairalbert1997@hotmail.com
 * @author Tania Forero - tanianickoll11@gmail.com
 * @version 1.0 2022-02-12
 */
public class duration implements Comparator<Songs> {
//Se emplea el metodo compare para organizar la lista de canciones segun la duracion de la cancion

    @Override
    public int compare(Songs o1, Songs o2) {
        Songs s1 = (Songs) o1;
        Songs s2 = (Songs) o2;
        return s1.getDuration().compareTo(s2.getDuration());
    }

}
