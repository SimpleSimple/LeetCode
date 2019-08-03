package RemoveElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        // 使用双指针的方案
        // 终点位置值与起始位置进行比较，当起始位置值与目标值val相等时，那就把右指针位置值赋值给左指针位置的值
        // 如果起始位置值与目标值不一样时，就把起始索引位置向右移一个位置（+1）
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                j -= 1;
            } else
                i++;
        }
        if (nums[i] == val) return i;
        else return i + 1;
    }
}
