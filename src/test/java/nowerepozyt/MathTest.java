package nowerepozyt;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;

/**
 * Created by RENT on 2017-01-05.
 */
public class MathTest {

    @Test
    public void correctFor10 () {
        //given
        int ten = 10;

        //when
        List<Factors> list = Math.getFactors(ten);
        Factors factors = new Factors(1,10);

        //then
        assertTrue(list.get(0).equals(factors) );
    }
}
