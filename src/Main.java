import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(method1(nums,target));

    }

    public static int[] method1( int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i])){
                res[0]=i;
                res[1]=map.get(target-nums[i]);
                return res;
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
