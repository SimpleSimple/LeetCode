package binarySearchEx;

import java.util.Arrays;

public class binarySearchTest {
    public static void main(String[] args) {
        int[] nums = {11, 23, 7, 4, 9, 15, 49, 33};

        binarySearchTest test = new binarySearchTest();
        //    第一中，无序的数组情况下：
        //System.out.println(test.binarySearch(nums, 33));

        //    第二种，进行有序的数组搜索
        Arrays.sort(nums);
        System.out.println(test.binarySearch(nums, 33));
    }

    public int binarySearch(int[] nums, int target) {
        /**
         * 二叉搜索，进行对半分搜索
         *  - 要点
         *      - 使用二叉搜索，如果查找的数组是无序的，要先进行排序
         */
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            // 这一句很重要
            int mid = (right - left) / 2 + left;    // 这里不明白为什么要加left
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
                mid++;
            }
        }
        return -1;
    }
}
