import java.util.HashMap;
import java.util.Map;

public class Demo1_ {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target-nums[i];
            if(map.containsKey(result) && i!= map.get(result)){
                return new int[]{map.get(result),i};
            }else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
