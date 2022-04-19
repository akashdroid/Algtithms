import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class twosumExampple {

    public static void main(String args[])  //static method
    {
        int[] nums  = {2,7,11,15};
       int  target = 9 ;
      System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }
}
