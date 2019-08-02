package binarySearchEx;

import java.util.Arrays;

public class binarySearchTest2 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        binarySearchTest2 s = new binarySearchTest2();
        int result = s.search(nums, 0);
        System.out.println("result：" + result);
    }

    //public int search(int[] nums, int target) {
    //    int[] nums2 = new int[nums.length];
    //    nums2 = nums.clone();
    //    Arrays.sort(nums2);
    //    int left = 0, right = nums2.length - 1;
    //    int mid = 0;
    //    while (left <= right) {
    //        // 这一句很重要
    //        mid = (right - left) / 2 + left;    // 这里不明白为什么要加left
    //        if (nums2[mid] == target) {
    //            for (int j = 0; j < nums.length; j++) {
    //                if (nums[j] == nums2[mid]) {
    //                    return j;
    //                }
    //            }
    //        } else if (nums2[mid] < target) {
    //            left = mid + 1;
    //        } else {
    //            right = mid - 1;
    //        }
    //    }
    //    return -1;
    //}

    public static int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    private static int search(int[] nums, int left, int right, int target) {
        if (left > right) {     // 如果左指示大于右指示索引
            return -1;
        }
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            // 如果确定 nums[left] <= target < nums[mid]，则使用二分查找
            if (nums[left] <= target) {
                int binarySearch = Arrays.binarySearch(nums, left, mid, target);
                return binarySearch >= 0 ? binarySearch : -1;
            }
        }
        int rightvalue = search(nums, mid + 1, right, target);
        if (rightvalue >= 0) {
            return rightvalue;
        }
        return search(nums, left, mid - 1, target);
    }
}
