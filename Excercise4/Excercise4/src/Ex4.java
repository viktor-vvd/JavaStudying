import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class Ex4 {
    public static void main(String[] args) throws Exception {
        Integer[] nums = { 2, 7, 11, 15 };
        Integer target = 9;
        System.out.println(IndexTarget(nums, target));
    }

    public static String IndexTarget(Integer[] nums, Integer target) {
        Map<Integer, String> states = new HashMap<Integer, String>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    states.put(nums[i] + nums[j], j + "," + i);
                }
            }
        }
        return states.get(target);
    }

    @Test
    public void textEx() {
        assertEquals("0,1", IndexTarget(new Integer[] { 2, 7, 11, 15 }, 9));
        assertEquals("1,2", IndexTarget(new Integer[] { 3, 2, 4 }, 6));
        assertEquals("0,1", IndexTarget(new Integer[] { 3, 3 }, 6));
    }

}
