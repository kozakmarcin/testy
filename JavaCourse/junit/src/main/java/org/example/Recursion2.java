package org.example;

public class Recursion2 {
    // https://codingbat.com/prob/p105136
    public boolean groupSumClump(int start, int[] nums, int target) {
        int sumClump = 0;
        int temp = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1] || nums[i]==temp ) {
                temp = nums[i];
                sumClump+=nums[i];
                nums[i]=0;
            }
        }

        if (start>=nums.length && target==0) return true;
        else if (start>=nums.length) return false;
        else if (nums[start]==0 && sumClump!=0) return groupSumClump(start,nums,target-sumClump) ;
        else return groupSumClump(start+1,nums,target-nums[start]) || groupSumClump(start+1,nums,target);

    }


    // https://codingbat.com/prob/p138907

    public boolean groupSum5(int start, int[] nums, int target) {
        if (start>=nums.length && target==0) return true;
        else if (start>=nums.length) return false;
        else if (nums[start]%5==0) {
            if (start<nums.length-1 && nums[start+1]==1) return groupSum5(start+2,nums,target-nums[start]);
            else return groupSum5(start+1,nums,target-nums[start]);
        }
        else return groupSum5(start+1,nums,target-nums[start]) || groupSum5(start+1,nums,target);
    }

    // https://codingbat.com/prob/p169605

    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start>=nums.length && target==0) return true;
        else if (start>=nums.length) return false;
        else return groupNoAdj(start+2,nums,target-nums[start]) || groupNoAdj(start+1,nums,target);
    }


    // https://codingbat.com/prob/p199368

    public boolean groupSum6(int start, int[] nums, int target) {
        if (start>=nums.length && target==0) return true;
        else if (start>=nums.length) return false;
        else if (nums[start]==6) return groupSum6(start+1,nums,target-6);
        else return groupSum6(start+1,nums,target-nums[start]) || groupSum6(start+1,nums,target);
    }


    // https://codingbat.com/prob/p145416

    public boolean groupSum(int start, int[] nums, int target) {
        if (start>=nums.length && target==0) return true;
        else if (start>=nums.length) return false;
        else return groupSum(start+1,nums,target-nums[start]) || groupSum(start+1,nums,target);
    }
}
