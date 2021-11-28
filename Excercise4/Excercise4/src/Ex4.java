import java.util.*;
public class Ex4 {
    public static void main(String[] args) throws Exception {
        Integer[] nums={2,7,11,15};
        Integer target=9;

        Map<Integer, String> states = new HashMap<Integer, String>(); 
        for(int i=0; i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j)
                {
                    states.put(nums[i]+nums[j], i+","+j);
                }
            }
        }
        System.out.println(states.get(target));
    }
}
