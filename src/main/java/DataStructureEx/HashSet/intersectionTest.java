package DataStructureEx.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class intersectionTest {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        intersectionTest test = new intersectionTest();
        test.intersection(nums1, nums2);
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        for (int num : set) {
            System.out.println(num);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
                set.remove(num);
            }
        }

        int[] ret = new int[result.size()];
        for (int i = 0; i < result.size() - 1; i++) {
            ret[i] = result.get(i);
        }
        return ret;
    }
}
