package RemoveElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int[] newnums = {};
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == val) {
                newnums[k] = nums[i];
                k++;
                continue;
            }
        }
        System.out.println(newnums.length);
    }
}
