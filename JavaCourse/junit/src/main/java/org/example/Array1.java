package org.example;

import java.util.Arrays;

public class Array1 {

    // https://codingbat.com/prob/p128270
    
    public int[] front11(int[] a, int[] b) {
        if (a.length>0 && b.length>0 ) return new int[] {a[0],b[0]};
        else if(a.length>0 ) return new int[]{a[0]};
        else if (b.length>0) return new int[]{b[0]};
        return new int[0];
    }

    // https://codingbat.com/prob/p143461
    
    public int[] make2(int[] a, int[] b) {
        int[] n =  Arrays.copyOf(a,2);
        if(n[0]==0) {n[0]=b[0]; n[1] = b[1];}
        else if(n[1]==0) n[1] = b[0];
        return n;
    }

    
    // https://codingbat.com/prob/p197308
    
    public boolean unlucky1(int[] nums) {
        if(nums.length>=2 && ((nums[0]==1 && nums[1]==3)|| (nums[1]==1 && nums[2]==3) ||
                (nums[nums.length-2]==1&& nums[nums.length-1]==3))) return true;
        return false;
    }
    
    // https://codingbat.com/prob/p142455

    public int[] frontPiece(int[] nums) {
        if(nums.length>=2) return new int[] {nums[0],nums[1]};
        else if (nums.length==1) return new int[] {nums[0]};
        return new int[0];
    }
    
    // https://codingbat.com/prob/p185176

    public int maxTriple(int[] nums) {
       return Arrays.stream(new int[]{nums[0], nums[nums.length / 2], nums[nums.length - 1]}).max().getAsInt();
    }
    
    // https://codingbat.com/prob/p155713
    
    public int[] midThree(int[] nums) {
        return new int[]{nums[nums.length/2 - 1],nums[nums.length/2],  nums[nums.length/2+1]};
    }


    // https://codingbat.com/prob/p118044
    
    public int[] swapEnds(int[] nums) {
        int t = nums[0];
        nums[0]= nums[nums.length-1];
        nums[nums.length-1]=t;
        return nums;
    }

    
    // https://codingbat.com/prob/p180840
    
    public int[] plusTwo(int[] a, int[] b) {
        int[] n=Arrays.copyOf(a,4);
        for (int i = a.length; i < n.length ; i++) {
            n[i] = b[i-a.length];          
        }
        return n;
    }
    
    // https://codingbat.com/prob/p199519
    
    public int[] makeMiddle(int[] nums) {
        return new int[]{nums[nums.length/2 - 1], nums[nums.length/2]};
    }
    
    // https://codingbat.com/prob/p109537
    
    public int[] biggerTwo(int[] a, int[] b) {
        if (Arrays.stream(a).sum() >= Arrays.stream(b).sum()) return a;
        return b; 
    }

    // https://codingbat.com/prob/p109660
    
    public int start1(int[] a, int[] b) {
        int sum = 0;
        if (a.length >0  && a[0]==1 ) sum++;
        if (b.length>0 && b[0]==1)sum++;
        return sum;
    }
    
    // https://codingbat.com/prob/p120347
    
    public int[] fix23(int[] nums) {
      if (nums[0]==2 && nums[1]==3) nums[1]=0;
      if (nums[1]==2 && nums[2]==3) nums[2]=0;
      return nums;
    }
    
    // https://codingbat.com/prob/p145365
    
    public boolean double23(int[] nums) {
        return (Arrays.equals(nums,new int[]{2, 2})  || Arrays.equals(nums,new int[]{3, 3}));
    }

    // https://codingbat.com/prob/p137188

    public int[] makeLast(int[] nums) {
        int i[]= new int[nums.length*2];
        i[i.length-1]=nums[nums.length-1];
        return i;
    }
    
    // https://codingbat.com/prob/p175689
    
    public boolean no23(int[] nums) {
        for (int n: nums) {
            if (n==2 || n==3) return false;
        }
        return true;
    }

    // https://codingbat.com/prob/p171022

    public boolean has23(int[] nums) {
        for (int n: nums) {
            if (n==2 || n==3) return true;
        }
        return false;
    }
    
    // https://codingbat.com/prob/p101230
    
    public int[] makeEnds(int[] nums) {
        return new int[] {nums[0],nums[nums.length-1]};
    }
    
    // https://codingbat.com/prob/p146449
    
    public int[] middleWay(int[] a, int[] b) {
        return new int[] {a[1],b[1]};
    }

    // https://codingbat.com/prob/p190968
    
    public int sum2(int[] nums) {
        int[] n = Arrays.stream(nums).limit(2).toArray();
        if(n.length==0) return 0;
        return Arrays.stream(n).sum();
    }


    // https://codingbat.com/prob/p146256
    
    public int[] maxEnd3(int[] nums) {
        int max = (nums[0]>nums[2])? nums[0] : nums[2];
        for (int i =0; i< nums.length; i++) {
            nums[i] =  max;
        }
        return nums;
    }


    // https://codingbat.com/prob/p112409
    
    public int[] reverse3(int[] nums) {
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        return nums;
    }


    // https://codingbat.com/prob/p185139

    public int[] rotateLeft3(int[] nums) {
        int rotated[] = new int[nums.length];
        rotated[nums.length-1]=nums[0];
        for(int i=1; i< nums.length;i++){
            rotated[i-1]=nums[i];
        }
        return rotated;
    }

    // https://codingbat.com/prob/p175763        
        
    public int sum3(int[] nums) {
        return Arrays.stream(nums).sum();
    }
        
    // https://codingbat.com/prob/p191991      
        
    public boolean commonEnd(int[] a, int[] b) {
        if(a[0] == b[0] || a[a.length-1] == b[b.length-1]) return  true;
        return false;
    }

    // https://codingbat.com/prob/p167011    
    
    public int[] makePi() {
        return new int[]{3,1,4};
    }

    // https://codingbat.com/prob/p118976        
        
    public boolean sameFirstLast(int[] nums) {
        return (nums.length>=1 && nums[0]==nums[nums.length-1]);
    }

    // https://codingbat.com/prob/p185685        
        
    public boolean firstLast6(int[] nums) {
        return (nums[0]==6 || nums[nums.length-1]==6);
    }
}
