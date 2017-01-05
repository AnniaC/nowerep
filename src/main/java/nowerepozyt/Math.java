package nowerepozyt;

import java.util.*;

/**
 * Created by RENT on 2017-01-05.
 */
public class Math {
    public static List<Factors> getFactors (int number ) {
        List<Factors> list = new ArrayList<>();
        int x;
        int y;
        int limit = 1;
        while (limit <number) {
            if (number%limit == 0) {
                x=limit;
                y=number/limit;
                limit++;
                list.add(new Factors(x,y));
            }
        }
        return list;
    }
}
