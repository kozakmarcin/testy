package org.example;

public class Array3 {

    public int countClumps(int[] nums) {
        int actual = -1;
        int sum = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1] && nums[i] != actual){
                actual=nums[i];
                sum++;
            } else actual=nums[i];
        }
        return sum;
    }


    public int maxMirror(int[] nums) {
        int sum = 0;
        int sumMax = 0;
        boolean flag = false;
        int length = nums.length;
        int start=0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = length - 1; j >= 0; j--) {
                if (nums[i] == nums[j]) {
                    if (!flag) start=i;
                    if (i < nums.length - 1 && j > 0 && nums[i + 1] == nums[j - 1]) {
                        sum++;
                        length = j;
                        flag = true;
                        if (sumMax < sum) sumMax = sum;
                        break;
                    }
                    else {

                        sum++;
                        flag=false;
                        length = nums.length;
                        if (sumMax < sum) {
                            sumMax = sum;
                        }
                        sum = 0;
                        if (i>0 && j<nums.length - 1 && nums[i - 1] == nums[j + 1] && j>i){
                            i=start-1;
                            length = j;


                        }

                    }

                    break;
                }

            }

        }
        return sumMax;
    }






    public int[] seriesUp(int n) {
        int[] seriesArray = new int[n*(n + 1)/2];
        int count = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                seriesArray[count]= j;
                count++;
            }
        }
        return seriesArray;
    }


    public int[] squareUp(int n) {
        int[] squareArray = new int[n*n];
        int counter = 0;
        if (n==1) {
            squareArray[0]=1;
            return  squareArray;
        }
        for (int i = squareArray.length -1; i >0; i+=0) {

            for (int k = 1; k <=n; k++) {
                if(k == n+1-counter) {
                    squareArray[i] =0;
                    i=squareArray.length-1- ((counter+1)*n);
                    break;
                }
                else{
                    squareArray[i] =k;
                    i--;
                }

            }
            counter++;
            if (counter>n) counter=0;
        }
        return squareArray;
    }



    public boolean linearIn(int[] outer, int[] inner) {
        int j = 0;
        for (int i = 0; i < outer.length; i++) {
            if (j<inner.length && outer[i]==inner[j]) {
                j++;
            }
        }
        return j==inner.length;
    }

    public boolean canBalance(int[] nums) {
        int sumFirst = 0;
        for (int i = 0; i < nums.length; i++) {
            sumFirst+=nums[i];
            int sumSecond = 0;
            for (int j = i+1; j <nums.length ; j++) {
                sumSecond+=nums[j];
            }
            if (sumFirst==sumSecond) return true;
        }
        return false;
    }


    public int[] fix45(int[] nums) {
        int maxChanged = -1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==4 && nums[i+1]!=5){
                for (int j = 1; j < nums.length; j++) {
                    if(nums[0]==5 ) {
                        int temp = nums[i+1];
                        nums[i+1] = nums[0];
                        nums[0] = temp;
                        break;
                    }
                    if(nums[j]==5 && (nums[j-1]!=4)){
                        int temp = nums[i+1];
                        nums[i+1] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        return nums;
    }




    public int[] fix34(int[] nums) {
        int maxChanged = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==3 && nums[i+1]!=4){
                for (int j = 0; j < nums.length; j++) {
                    if(nums[j]==4 && maxChanged<=j) {
                        int temp = nums[i+1];
                        nums[i+1] = nums[j];
                        nums[j] = temp;
                        maxChanged = j;
                        break;
                    }
                }
                i++;
            }
        }
        return nums;
    }


    public int maxSpan(int[] nums) {
        int span = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = 1;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) x=j+1-i;
            }
            if (x>span) span= x;
        }
        return span;
    }
}
