package org.example;

import java.util.Arrays;

public class Array2 {
    
    // https://codingbat.com/prob/p153059
    
    public String[] fizzBuzz(int start, int end) {
        String[] fizzBuzzChalange = new String[end-start];
        int number = start;
        for (int i = 0; i < fizzBuzzChalange.length; i++) {
            if (number%15 == 0) fizzBuzzChalange[i] = "FizzBuzz";
            else if (number%5 == 0) fizzBuzzChalange[i] = "Buzz";
            else if (number%3 == 0) fizzBuzzChalange[i] = "Fizz";
            else fizzBuzzChalange[i] = ""+number;
            number++;
        }
        
        return fizzBuzzChalange;
    }
    
    // https://codingbat.com/prob/p105771

    public int[] evenOdd(int[] nums) {
       int[] newNums = new int[nums.length];
        int indexEven=0;
        int indexOdd = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 == 0) {
                newNums[indexEven]=nums[i];
                indexEven++;
            } else {
                newNums[indexOdd]=nums[i];
                indexOdd--;
            }
        }
        return newNums;
    }
    
    // https://codingbat.com/prob/p187050
    
    public int[] zeroMax(int[] nums) {
        int maxOdd = 0;
        for (int i = nums.length-1; i >=0 ; i--) {
            if(nums[i]%2 != 0 && nums[i]>maxOdd) maxOdd=nums[i];
            if(nums[i]==0) nums[i] = maxOdd;
        }
        return nums;
    }
    
    https://codingbat.com/prob/p196976

    public int[] withoutTen(int[] nums) {
        int[] newNums = new int[nums.length];
        int indexTen=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==10) {
                indexTen++;
                newNums[nums.length-indexTen]=0;
            } else newNums[i-indexTen]=nums[i];
        }
        return newNums;
    }
    
    // https://codingbat.com/prob/p193753

    public int[] zeroFront(int[] nums) {
        int indexZero = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0) {
                indexZero++;
                nums[i]=nums[indexZero];
                nums[indexZero]=0;
            }
        }
        return nums;
    }

    https://codingbat.com/prob/p169506

    public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i <nums.length-1 ; i++) {
            if (nums[i] == val && nums[i-1]!=val && nums[i+1]!=val ) nums[i] = Math.max(nums[i-1],nums[i+1]);
        }
        return nums;
    }
    
    // https://codingbat.com/prob/p164144

    public int[] post4(int[] nums) {
        int[] array = new int[0];

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 4) array= Arrays.copyOfRange(nums,i+1,nums.length);
            if (nums[i+1]==4) array = new int[0];
        }
        return array;
    }

    // https://codingbat.com/prob/p100246

    public int[] pre4(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 4) return Arrays.copyOf(nums,i);
        }
        return new int[0];
    }
    
    // https://codingbat.com/prob/p199484

    public int[] tenRun(int[] nums) {
        int ten = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%10 == 0) ten=nums[i  ];
            if(ten>-1) nums[i] =ten;
        }
        return nums;
    }
    
    // https://codingbat.com/prob/p105031

    public int[] shiftLeft(int[] nums) {
        if (nums.length==0) return nums;
        int temp =nums[0];
        for (int i = 0; i <nums.length-1 ; i++) {
            nums[i] = nums[i+1];
        }
        nums[nums.length-1]=temp;
        return nums;
    }

    // https://codingbat.com/prob/p142539

    public int[] fizzArray3(int start, int end) {
        int[] fizz = new int[end-start];
        for (int i = 0; i < fizz.length; i++) {
            fizz[i] = start++;
        }
        return fizz;
    }

    // https://codingbat.com/prob/p137874
    
    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length-2; i++) {
            if(nums[i+1]==nums[i]+1&& nums[i+2]==nums[i+1]+1) return true;
        }
        return false;
    }
    
    // https://codingbat.com/prob/p134300
    
    public boolean sameEnds(int[] nums, int len) {
        int[] array1 = Arrays.copyOfRange(nums,0, len);
        int[] array2 = Arrays.copyOfRange(nums,nums.length-len, nums.length);
        return Arrays.equals(array1,array2);
    }

    // https://codingbat.com/prob/p102145

    public boolean twoTwo(int[] nums) {
        boolean flag = false;
        if (nums.length==0) return true;
        else if (nums.length==1 && nums[0] !=2) return true;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 2 && nums[i+1]==2) {
                flag=true;
                i++;
            } else if( nums[i] == 2 && nums[i + 1] != 2) return false;
            else if( nums[i] != 2 && nums[i + 1] == 2) flag = false;
            else if( nums[i] != 2 && nums[i + 1] != 2) flag = true;
        }
        return flag;
    }

    // https://codingbat.com/prob/p109783
    
    public boolean haveThree(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i<nums.length-1 && nums[i]==3 && nums[i+1]==3) return false;
            else if(nums[i]==3 )sum++;
        }
        return sum==3;
    }

    // https://codingbat.com/prob/p159979

    public boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length-2; i++) {
            if(nums[i]%2==0 && nums[i+1]%2==0  && nums[i+2]%2==0) return true;
            if(nums[i]%2!=0 && nums[i+1]%2!=0  && nums[i+2]%2!=0) return true;
        }
        return false;
    }
    
    // https://codingbat.com/prob/p169260
    
    public boolean has12(int[] nums) {
        boolean flag1 = false;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1 ) flag1=true;
            if(nums[i] == 2 && flag1) return true;
        }
        return false;
    }
    
    // https://codingbat.com/prob/p168357
    
    public boolean has77(int[] nums) {
        boolean flag1 = false;
        boolean flag2 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 7 && (flag1 || flag2)) return true;
            else if (nums[i]!=7 && flag1) {
                flag2 = true;
                flag1= false;
            }
            else {
                flag1 = nums[i] == 7;
                flag2 = false;
            }
        }
        return false;
    }

    // https://codingbat.com/prob/p136254

    public int matchUp(int[] nums1, int[] nums2) {
        int sum=0;
        for (int i = 0; i < nums1.length; i++) {
            if(Math.abs(nums1[i] -nums2[i])>0 && Math.abs(nums1[i] -nums2[i])<3)sum++;
        }
        return sum;
    }

    // https://codingbat.com/prob/p191878

    public boolean either24(int[] nums) {
        boolean flag2 = false;
        boolean flag4 = false;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==2 && nums[i+1]==2) flag2=true;
            if(nums[i]==4 && nums[i+1]==4) flag4 = true;
        }
        if(flag2 && flag4) return false;
        else return flag2 || flag4;
    }
    
    // https://codingbat.com/prob/p110222

    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length-1; i++) {
            if( nums[i] != val || nums [i+1]!=val) return false;
        }
        return true;
    }

    // https://codingbat.com/prob/p136648

    public boolean no14(int[] nums) {
        boolean flag1= false;
        boolean flag4 = false;
        for (int i : nums) {
            if (i==1) flag1 =true;
            if (i==4) flag4 = true;
        }
        return !(flag1&&flag4);
    }
    
    // https://codingbat.com/prob/p178353
    
    public String[] fizzArray2(int n) {
        String[] fizz = new String[n];
        for (int i = 0; i < n; i++) {
            fizz[i] = String.valueOf(i);
        }
        return fizz;
    }
    
    // https://codingbat.com/prob/p186672
    
    public boolean only14(int[] nums) {
        for (int i : nums) {
            if (i!=1 && i !=4) return false;
        }
        return true;
    }

    // https://codingbat.com/prob/p178353
    
    public int[] fizzArray(int n) {
        int[] fizz = new int[n];
        for (int i = 0; i < n; i++) {
            fizz[i] = i;
        }
        return fizz;
    }

    // https://codingbat.com/prob/p104627

    public boolean more14(int[] nums) {
        int sum1 = 0;
        int sum4 = 0;
        for (int i : nums) {
            if (i==1) sum1++;
            if (i==4) sum4++;
        }
        return sum1>sum4;
    }
    
    // https://codingbat.com/prob/p194525

    public boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] ==1 || nums[i]==3) return false;
        }
        return true;
    }

    // https://codingbat.com/prob/p121853

    public boolean has22(int[] nums) {
        boolean flag1 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && flag1) return true;
            else if (nums[i]==2) flag1 = true;
            else flag1 = false;
        }
        return false;
    }

    // https://codingbat.com/prob/p111327

    public int sum67(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 6) sum+=nums[i];
            else while ( nums[i]!=7){
                i++;
            }
        }
        return sum;
    }
    
    // https://codingbat.com/prob/p127384

    public int sum13(int[] nums) {
        if (nums.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i>0 && (nums[i] !=13 || nums[i-1] !=13)) sum+=nums[i];
            if(i==0 && nums[i]!=13) sum+=nums[i];
        }
        return sum;
    }
    
    // https://codingbat.com/prob/p136585
    
    public int centeredAverage(int[] nums) {
        return (Arrays.stream(nums).sum() - Arrays.stream(nums).max().getAsInt()-Arrays.stream(nums).min().getAsInt())/(nums.length-2);
    }
    
    // https://codingbat.com/prob/p196640
    
    public int bigDiff(int[] nums) {
        return (Arrays.stream(nums).max().getAsInt()- Arrays.stream(nums).min().getAsInt());
    }
    
    // https://codingbat.com/prob/p162010
    
    public int countEvens(int[] nums) {
        int sum = 0;
        for(int i: nums){
            if(i%2 ==0) sum++;
        }
        return sum;
    }

}
