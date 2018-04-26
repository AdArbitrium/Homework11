package edu.gcccd.csis;

import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.*;

public class RecursionTest {

    @Test
    public void printEveryOther() {
        int [] x = new int[] {1,2,3,4,5,6,7,8,9,10};
        assertEquals("9753", Recursion.printEveryOther(x, 2));
        assertNull(Recursion.printEveryOther(null,2));
    }

    @Test
    public void printStars() {
        String s = "THHHHISSSS II2ISSS SSOO3OO1OMMEE STRRRRIINNGGG2G";
        assertEquals("TH*H*H*HIS*S*S*S I*I2IS*S*S S*SO*O3O*O1OM*ME*E STR*R*R*RI*IN*NG*G*G2G", Recursion.printStars(s));
        assertNull(Recursion.printStars(null));
    }

    /*
     * we know the sum of the 1st k positive numbers is n(n+1)2
     */
    @Test
    public void sum() {
        for (int i = 0; i < 10; i++) {
            int k = new Random().nextInt(100);
            assertEquals(k * (k + 1) / 2, Recursion.sum(k));
        }
        // corner cases
        assertEquals(0, Recursion.sum(-1));
        assertEquals(0, Recursion.sum(0));
        try {
            int x = Recursion.sum(Integer.MAX_VALUE); // stackoverflow
            fail();
        } catch (StackOverflowError error) {
            assertTrue(true);
        }
    }
}