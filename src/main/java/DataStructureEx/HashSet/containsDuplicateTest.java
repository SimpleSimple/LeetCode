package DataStructureEx.HashSet;

import java.util.HashSet;

public class containsDuplicateTest {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        containsDuplicateTest test = new containsDuplicateTest();

        System.out.println(test.containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        //for (int i = 0; i < nums.length; i++) {
        //
        //}

        for (int value : nums) {
            if (set.contains(value)) {
                return true;
            }
            set.add(value);
        }
        return false;
    }

}
