package pl.ttt;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by RENT on 2017-11-30.
 */
public class RemainderTest {

    @Test
    public void getChange_Test1(){
        //
        int amount = 300;

        //
        List<Integer> changeList = new ArrayList<Integer>();
        changeList.add(200);
        changeList.add(100);

        //
        assertEquals(changeList.size(),Remainder.getChange(amount).size());
        assertEquals(changeList.get(0), Remainder.getChange(amount).get(0));
        assertEquals(changeList.get(1), Remainder.getChange(amount).get(1));
    }



}
