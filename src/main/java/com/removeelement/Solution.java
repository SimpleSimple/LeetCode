package com.removeelement;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> newnums = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                newnums.add(nums[i]);
                continue;
            }
        }
        System.out.println(newnums.size());
        return newnums.size();
    }
}
