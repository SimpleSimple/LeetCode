## Array Partition I

使用双指针的实现方案：
```
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
```