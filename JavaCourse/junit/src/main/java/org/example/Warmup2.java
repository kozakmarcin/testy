package org.example;

public class Warmup2 {
 
    // https://codingbat.com/prob/p167430

    public static boolean has271(int[] nums) {
        for(int i =0; i< nums.length-2;i++){
            if (nums[i+1] == nums[i] + 5  && (nums[i+2] > nums[i] -4 && nums[i+2] < nums[i] +2 )) return true;
        }
        return false;
    }


    // https://codingbat.com/prob/p170221
    
    public boolean noTriples(int[] nums) {
        for(int i =0; i< nums.length-2;i++){
            if (nums[i] == nums[i+1] && nums[i+1] == nums[i+2] ) return false;
        }
        return true;
    }

    // https://codingbat.com/prob/p110019

    public int array667(int[] nums) {
        int sum=0;
        for(int i =0; i< nums.length-1;i++){
            if (nums[i] == 6 &&( nums[i+1] == 6|| nums[i+1]==7)) sum++;
        }
        return sum;
    }

    // https://codingbat.com/prob/p126212
    
    public String stringYak(String str) {
        return str.replaceAll("yak", "");
    }
    
    //https://codingbat.com/prob/p121596 
    
    public String altPairs(String str) {
     StringBuilder sb = new StringBuilder();
     char[] chars = str.toCharArray();
     for (int i = 0; i< chars.length; i++){
         if(i ==0 || i == 1 || i%4 ==0 || (i-1)%4==0){
             sb.append(chars[i]);
         }
     }
     return sb.toString();
    }


    // https://codingbat.com/prob/p171260
    
    public String stringX(String str) {
        if(str.length()<=1) return str;
        else {
            StringBuilder sb = new StringBuilder();
            sb.append(str.charAt(0));
            for (int i = 1; i < str.length() - 1; i++) {
                if (!(str.charAt(i) == 'x')) sb.append(str.charAt(i));
            }
            sb.append(str.charAt(str.length() - 1));
            return sb.toString();
        }
    }


    // https://codingbat.com/prob/p198640
    
    public int stringMatch(String a, String b) {
        int sum = 0;
        for(int i=0; i<Math.min( a.length()-1,b.length()-1);i++){
            if( a.substring(i,i+2).equals(b.substring(i,i+2))) sum++;

        }
        return sum;
    }

    // https://codingbat.com/prob/p136041
    
    public boolean array123(int[] nums) {
        for(int i = 0; i<nums.length-2; i++){
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2] ==3) return true;
        }
        return false;

    }

    // https://codingbat.com/prob/p186031
    
    public boolean arrayFront9(int[] nums) {
        int lenght=0;
        lenght=  nums.length < 4 ? nums.length:  4;
        for (int i = 0; i<lenght; i++){
            if (nums[i]==9) return true;
        }
        return false;
    }

    // https://codingbat.com/prob/p184031
    
    public int arrayCount9(int[] nums) {
        int sum = 0;
        for(int n :nums){
           if (n==9) sum++ ;
        }
        return sum;
    }


    // https://codingbat.com/prob/p178318
    
    public int last2(String str) {
        int sum = 0;
        for(int i = 0; i< str.length()-2; i++){
            if (str.regionMatches(i,str.substring(str.length()-2),0,2)) sum+=1;
        }
        return sum;
    }



    // https://codingbat.com/prob/p117334
    
    public String stringSplosion(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<=str.length(); i++){
            sb.append(str.substring(0,i));
        }
        return sb.toString();
    }


    // https://codingbat.com/prob/p165666
    
     public String stringBits(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<str.length(); i+=2){
            sb.append(str.charAt(i));
        }
        return sb.toString();

    }
    
    // https://codingbat.com/prob/p186759

   public boolean doubleX(String str) {
       if (str.contains("xx")&& (str.indexOf("x")==str.indexOf("xx"))) return true;
       return false;
    }


    
    //https://codingbat.com/prob/p194667   
    
    public int countXX(String str) {
        int sum = 0;
        for(int i = 0; i< str.length(); i++){
            if (str.regionMatches(i,"xx",0,2)) sum+=1;
        }
        return sum;
    }
    
    // https://codingbat.com/prob/p101475
    
    public String frontTimes(String str, int n) {
        if (n==0) return "";
        else if (str.length()<3 ) return frontTimes(str, n-1) +str;
        else return frontTimes(str.substring(0,3), n-1) +str.substring(0,3);
    }

    
     // https://codingbat.com/prob/p142270
    
    public String stringTimes(String str, int n) {
        if (n==0) return "";
        return stringTimes(str, n-1) +str;
    }

}
