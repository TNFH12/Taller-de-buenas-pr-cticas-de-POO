/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;
import java.util.Comparator;
/**
 *
 * @author tania
 */
public class duration implements Comparator<Songs>{

    @Override
    public int compare(Songs o1, Songs o2) {
        Songs s1 = (Songs)o1;
        Songs s2 = (Songs)o2;
        return s1.getDuration().compareTo(s2.getDuration());
    }
    
}
