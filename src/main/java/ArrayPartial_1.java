import java.util.Arrays;

public class ArrayPartial_1 {
//    public int arrayPairSum(int[] nums) {
//        int result = 0;
//        Arrays.sort(nums);
//        String output = "";
//        for (int j = 0; j < nums.length; j++) {
//            output += nums[j] + " ";
//        }
//        System.out.println("打印后的数据：" + output);
//
//        for (int i = 0; i < nums.length; i += 2) {
//            result += nums[i];
//        }
//        return result;
//    }

    //用双指针
    public int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        int i = 0;
        int j = i + 1;
        while (i < nums.length - 1) {
            result += Math.min(nums[i], nums[j]);
            i += 2;
            j += 2;
        }
        return result;
    }
}
