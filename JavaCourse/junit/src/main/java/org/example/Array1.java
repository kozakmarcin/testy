package org.example;

public class Array1 {

    public int[] front11(int[] a, int[] b) {
        if (a.length>0 && b.length>0 ) return new int[] {a[0],b[0]};
        else if(a.length>0 ) return new int[]{a[0]};
        else if (b.length>0) return new int[]{b[0]};
        return new int[0];
    }

    public int[] make2(int[] a, int[] b) {
       int[] n =  Arrays.copyOf(a,2);
       if(n[0]==0) {n[0]=b[0]; n[1] = b[1];}
       else if(n[1]==0) n[1] = b[0];
       return n;
    }

    public boolean unlucky1(int[] nums) {
        if(nums.length>=2 && ((nums[0]==1 && nums[1]==3)|| (nums[1]==1 && nums[2]==3) ||
                (nums[nums.length-2]==1&& nums[nums.length-1]==3))) return true;
        return false;
    }

    public int[] frontPiece(int[] nums) {
        if(nums.length>=2) return new int[] {nums[0],nums[1]};
        else if (nums.length==1) return new int[] {nums[0]};
        return new int[0];
    }

    public int maxTriple(int[] nums) {
        Arrays.stream(new int[]{nums[0], nums[nums.length / 2], nums[nums.length - 1]}).max().getAsInt();
    }

    public int[] swapEnds(int[] nums) {
        int t = nums[0];
        nums[0]= nums[nums.length-1];
        nums[nums.length-1]=t;
        return nums;
    }


    public int[] plusTwo(int[] a, int[] b) {

         int[] n=Arrays.copyOf(a,4);
        for (int i = a.length; i < n.length ; i++) {
            n[i] = b[i-a.length];
        }
        return n;
    }


    public int[] makeMiddle(int[] nums) {

        return new int[]{nums[nums.length/2 - 1], nums[nums.length/2]};
    }

    public int[] biggerTwo(int[] a, int[] b) {
        if (Arrays.stream(a).sum() >= Arrays.stream(b).sum()) return a;
        return b;
    }

    public int start1(int[] a, int[] b) {
        int sum = 0;
        if (a.length >0  && a[0]==1 ) sum++;
        if (b.length>0 && b[0]==1)sum++;
        return sum;
    }


    public int[] fix23(int[] nums) {
        if (nums[0]==2 && nums[1]==3) nums[1]=0;
        if (nums[1]==2 && nums[2]==3) nums[2]=0;
        return nums;
    }

    public static boolean double23(int[] nums) {
        return (Arrays.equals(nums,new int[]{2, 2})  || Arrays.equals(nums,new int[]{3, 3}));
    }


    public int[] middleWay(int[] a, int[] b) {
        return new int[] {a[1],b[1]};
    }




    public int[] makeLast(int[] nums) {
        int i[]= new int[nums.length*2];
        i[i.length-1]=nums[nums.length-1];
        return i;
    }


    public boolean has23(int[] nums) {
        for (int n: nums) {
            if (n==2 || n==3) return true;
        }
        return false;
    }

    public int sum2(int[] nums) {
        int[] n = Arrays.stream(nums).limit(2).toArray();
        if(n.length==0) return 0;
        return Arrays.stream(n).sum();
    }



    public int[] maxEnd3(int[] nums) {
        int max = (nums[0]>nums[2])? nums[0] : nums[2];
        for (int i =0; i< nums.length; i++) {
            nums[i] =  max;
        }
        return nums;
    }



    public int[] reverse3(int[] nums){
        for (int i = 0; i<nums.length/2;i++){
            int temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
        }
        return nums;




    public static int[] rotateLeft3(int[] nums) {
        int rotated[] = new int[nums.length];
        rotated[nums.length-1]=nums[0]
        for(int i=1; i< nums.length;i++){
            rotated[i-1]=nums[i];
        }

    }

    public int sum3(int[] nums) {
        return Arrays.stream(nums).sum();
    }
    public static boolean commonEnd(int[] a, int[] b) {
        if(a[0] == b[0] || a[a.length-1] == b.[b.length-1]) return  true;
        return false;
    }


    public int[] makePi() {
        return new int[]{3,1,4};
    }

    public boolean sameFirstLast(int[] nums) {
        return (nums.length>=1 && nums[0]==nums[nums.length-1]);
    }

    public static boolean firstLast6(int[] nums) {
        return (nums[0]==6 || nums[nums.length-1]==6);
    }
}
