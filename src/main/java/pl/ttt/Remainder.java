package pl.ttt;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by RENT on 2017-11-30.
 */
public class Remainder {
    public static List<Integer> getChange(int amount){
        int [] nominals = new int [] {500, 200, 100, 50, 20, 10, 5, 2, 1};
               int index = 0;
               List<Integer> result = new ArrayList<Integer>();
//        ArrayList<Integer>  list = new ArrayList<Integer>();
//        list.add(500);
//        list.add(200);
//        list.add(100);
//        list.add(50);
//        list.add(20);
//        list.add(10);
//        list.add(5);

        while (amount > 0) {
            int currentNominal = nominals[index];
            if (currentNominal < amount) {
                result.add(currentNominal);
                amount -= currentNominal
            } else {
                index++;
            }
        }
        return result;
    }

}
