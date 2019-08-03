package RemoveElement;

public class RemoveElementTest {
    public static void main(String[] args) {
        Solution sln = new Solution();
        System.out.println(sln.removeElement(new int[]{3, 2, 2, 3}, 3));

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int len = sln.removeElement(nums, 3);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
