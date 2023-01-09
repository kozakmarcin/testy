package org.example;

import java.util.Arrays;

public class Recursion2 {
    // https://codingbat.com/prob/p168295

    public boolean split53(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if(sum%2 != 0) return false;
        int dividedSum = sum/2;
        if(dividedSum%5 !=3) return helper(0,nums,dividedSum);
        return false;
    }

    //alternatywne rozwiązanie zgodne z założeniami twórców
    public boolean split53Alter(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        return helper3(0,nums,sum1,sum2);
    }

    public boolean helper3(int start, int[] nums, int sum1, int sum2){
        if(start==nums.length && sum1==sum2 && sum1%5!=3) return true;
        else if (start==nums.length) return false;
        else return helper3(start+1,nums,sum1+nums[start],sum2) || helper3(start+1,nums,sum1,sum2+nums[start]);
    }

    //https://codingbat.com/prob/p171660

    public boolean splitOdd10(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int mod = sum%10;
        int divided = sum/10;
        if(mod%2 == 0) return false;
        else return helper(0,nums,divided*10);
    }


    //alternatywne rozwiązanie zgodne z założeniami twórców
    public boolean splitOdd10Alter(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        return helper2(0,nums,sum1,sum2);
    }

    public boolean helper2(int start, int[] nums, int sum1, int sum2){
        if(start==nums.length && sum1%10==0 && sum2%2 != 0 ) return true;
        else if (start==nums.length) return false;
        else return helper2(start+1,nums,sum1+nums[start],sum2) || helper2(start+1,nums,sum1,sum2+nums[start]);
    }

    // https://codingbat.com/prob/p185204

    public boolean splitArray(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if(sum%2 != 0) return false;
        else return helper(0,nums,sum/2);
    }

    public boolean helper(int start, int[] nums,int target){
        if (start>=nums.length && target==0) return true;
        else if (start>=nums.length) return false;
        else return helper(start+1,nums,target-nums[start]) || helper(start+1,nums,target);
    }

    // Alternatywne rozwiazanie zgodne z załozeniami twórców
    public boolean splitArrayAler(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        return helper1(0,nums,sum1,sum2);
    }


    public boolean helper1(int start, int[] nums, int sum1, int sum2){
        if(start==nums.length && sum1==sum2) return true;
        else if (start==nums.length) return false;
        else return helper1(start+1,nums,sum1+nums[start],sum2) || helper1(start+1,nums,sum1,sum2+nums[start]);
    }



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
