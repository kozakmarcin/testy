package org.example;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testy {

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


    public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i <nums.length-1 ; i++) {
            if (nums[i] == val && nums[i-1]!=val && nums[i+1]!=val ) nums[i] = Math.max(nums[i-1],nums[i+1]);
        }
        return nums;
    }

    public int[] post4(int[] nums) {
        int[] array = new int[0];

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 4) array= Arrays.copyOfRange(nums,i+1,nums.length);
            if (nums[i+1]==4) array = new int[0];
        }
        return array;
    }



    public int[] pre4(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 4) return Arrays.copyOf(nums,i);
        }
        return new int[0];
    }

    public int[] tenRun(int[] nums) {
        int ten = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%10 == 0) ten=nums[i  ];
            if(ten>-1) nums[i] =ten;
        }
        return nums;
    }

    public int[] shiftLeft(int[] nums) {
        if (nums.length==0) return nums;
        int temp =nums[0];
        for (int i = 0; i <nums.length-1 ; i++) {
            nums[i] = nums[i+1];
        }
        nums[nums.length-1]=temp;
        return nums;
    }



    public int[] fizzArray3(int start, int end) {
        int[] fizz = new int[end-start];
        for (int i = 0; i < fizz.length; i++) {
            fizz[i] = start++;
        }
        return fizz;
    }

    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length-2; i++) {
            if(nums[i+1]==nums[i]+1&& nums[i+2]==nums[i+1]+1) return true;
        }
        return false;
    }
    public boolean sameEnds(int[] nums, int len) {
        int[] array1 = Arrays.copyOfRange(nums,0,len);
        int[] array2 = Arrays.copyOfRange(nums,nums.length-len, nums.length);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        return Arrays.equals(array1,array2);
    }


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
//
    }

    public boolean haveThree(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i<nums.length-1 && nums[i]==3 && nums[i+1]==3) return false;
            else if(nums[i]==3 )sum++;
        }
        return sum==3;
    }


    public boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length-2; i++) {
            if(nums[i]%2==0 && nums[i+1]%2==0  && nums[i+2]%2==0) return true;
            if(nums[i]%2!=0 && nums[i+1]%2!=0  && nums[i+2]%2!=0) return true;
        }
        return false;
    }
    public boolean has12(int[] nums) {
        boolean flag1 = false;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1 ) flag1=true;
            if(nums[i] == 2 && flag1) return true;
        }
        return false;
    }
    public boolean has77(int[] nums) {
        boolean flag1 = false;
        boolean flag2 = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 7 && (flag1 || flag2)) return true;
            else if (nums[i]!=7 && flag1) {
//                System.out.println("i:"+i + "flag 2: " + flag2);
                flag2 = true;
                flag1= false;
//                System.out.println("i:"+ i + "flag 2: " + flag2);
            }
            else {
                flag1 = nums[i] == 7;
                flag2 = false;
            }
        }
        return false;
    }


    public int matchUp(int[] nums1, int[] nums2) {
        int sum=0;
        for (int i = 0; i < nums1.length; i++) {
            if(Math.abs(nums1[i] -nums2[i])>0 && Math.abs(nums1[i] -nums2[i])<3)sum++;
        }
        return sum;
    }



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


    public boolean isEverywhere(int[] nums, int val) {

        for (int i = 0; i < nums.length-1; i++) {
            if( nums[i] != val || nums [i+1]!=val) return false;


        }
        return true;

    }




    public boolean no14(int[] nums) {
        boolean flag1= false;
        boolean flag4 = false;
        for (int i : nums) {
            if (i==1) flag1 =true;
            if (i==4) flag4 = true;
        }
        return !(flag1&&flag4);
    }
    public String[] fizzArray2(int n) {
        String[] fizz = new String[n];
        for (int i = 0; i < n; i++) {
            fizz[i] = String.valueOf(i);
        }
        return fizz;
    }

    public boolean only14(int[] nums) {
        for (int i : nums) {
            if (i!=1 && i !=4) return false;
        }
        return true;
    }


    public int[] fizzArray(int n) {
            int[] fizz = new int[n];
            for (int i = 0; i < n; i++) {
                fizz[i] = i;
            }
            return fizz;
    }



    public boolean more14(int[] nums) {
        int sum1 = 0;
        int sum4 = 0;
        for (int i : nums) {
            if (i==1) sum1++;
            if (i==4) sum4++;
        }
        return sum1>sum4;
    }

    public boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] ==1 || nums[i]==3) return false;
        }
        return true;
    }



    public boolean has22(int[] nums) {
        boolean flag1 = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && flag1) return true;
            else if (nums[i]==2) flag1 = true;
            else flag1 = false;
        }
        return false;
    }


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


    public int sum13(int[] nums) {
        if (nums.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i>0 && (nums[i] !=13 || nums[i-1] !=13)) sum+=nums[i];
            if(i==0 && nums[i]!=13) sum+=nums[i];
        }
        return sum;
    }




    public String notReplace(String str) {
        StringBuilder sb = new StringBuilder();
        boolean isLetter = false;

        str = " " + str+ "  ";


        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i)=='i'){
                if(str.charAt(i+1)=='s'&& !isLetter && !Character.isLetter(str.charAt(i+2))){
                    sb.append("is not");
                    isLetter=true;
                    i++;
                } else {
                    sb.append(str.charAt(i));
                    isLetter = true;
                }
            } else {
                sb.append(str.charAt(i));
                if (Character.isLetter(str.charAt(i))) isLetter = true;
                else isLetter= false;
            }

        }
        return sb.substring(1);

    }



    public int sumNumbers(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int sum = 0;

        for (int i = 0; i <str.length()-1 ; i++) {
            if (Character.isDigit(str.charAt(i))) {
                System.out.println(str.charAt(i));

                if (Character.isDigit(str.charAt(i+1))){
                    stringBuilder.append(str.charAt(i));
                }
                else {
                    stringBuilder.append(str.charAt(i));
                    sum+=Integer.parseInt(stringBuilder.toString());
                    stringBuilder = new StringBuilder();
                }
            }

        }
        return  sum;
    }
    public int maxBlock(String str) {



        int max = 0;
        int temp = 1;
        for (int i = 0; i < str.length()-1; i++) {

//            System.out.println(i + " " +str.charAt(i) + " "+str.charAt(i+1));
            if (str.charAt(i)==str.charAt(i+1)) temp++;
//            System.out.println(temp);
            if (temp>max) max=temp;
            if (str.charAt(i) != str.charAt(i+1)) temp = 1;
        }
        return max;
    }


    public String mirrorEnds(String string) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)== string.charAt(string.length()-i-1)) stringBuilder.append(string.charAt(i));
            else break;
        }

        return stringBuilder.toString();
    }


    public String sameEnds(String string) {
        String longestSub = "";
        for (int i = 0; i <= string.length()/2; i++) {
            String prefix =string.substring(0,i);
            String suffix = string.substring(string.length()-i);
            if (prefix.equals(suffix)) longestSub = prefix;
        }

        return longestSub;
    }

    public int sumDigits(String str) {
        int sumInt = 0;
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
           sumInt+= Character.getNumericValue(str.charAt( matcher.start()));

            str= str.replaceFirst("\\d","");
            matcher = pattern.matcher(str);
        }

        return sumInt;
    }

//    public int countTriple(String str) {
//        int countChar = 0;
//        Pattern pattern = Pattern.compile("(.)\\1{2}");
//        Matcher matcher = pattern.matcher(str);
//        while (matcher.find()){
//            int index = matcher.start();
//            countChar++;
//            str= str.replaceFirst("(.)\\1{2}",str.substring(index,index+2));
//            System.out.println(str);
//            matcher = pattern.matcher(str);
//        }
//
//        return countChar;
//    }

//    public boolean gHappy(String str) {
//        str=  str.replaceAll("g{2,}","");
//        return !str.contains("g");
//    }


//    public boolean equalIsNot(String str) {
//
//        int countIs= 0;
//        int countNot = 0;
//        System.out.println(str);
//        while (str.matches(".*is+.*")){
//            countIs++;
//            str= str.replaceFirst("is","");
//            System.out.println(str);
//        }
//        while (str.matches(".*not+.*")){
//            countNot++;
//            str= str.replaceFirst("not","");
//            System.out.println(str);
//        }
//
//        return (countNot==countIs);
//
//    }


//    public String withoutString(String base, String remove) {
//
//        return  (base.matches(".+(?i)"+remove + "+.*")) ?  base.replaceAll("(?i)"+remove,""): base ;
//
//
//
//    }


//    public int countYZ(String str) {
//        String[] splitedStr = str.toLowerCase().split("[^a-z]");
//        int count = 0;
//        for (String check: splitedStr) {
//            if (check.length()==1 && (check.equals("y")||(check.equals("z") ))) count++;
//            else if (check.matches("[a-xA-X]+y$|[a-xA-X]+z$")) count++;
//        }
//        return count;
//    }


//    public String starOut(String str) {
//        return str.replaceAll(".?\\*  +.?","");
//
//
//    }

//    public String wordEnds(String str, String word) {
//        StringBuilder newStr = new StringBuilder();
//        if (str.equals(word)) return "";
//        if (str.startsWith(word)) newStr.append(str.charAt(word.length()));
//        for (int i = 1; i < str.length()-word.length(); i++) {
//            if (str.startsWith(word, i)) {
//                newStr.append(str.charAt(i-1));
//                newStr.append(str.charAt(i+word.length()));
//                i+=word.length()-1;
//            }
//        }
//        if(str.endsWith(word)) newStr.append(str.charAt(str.length()- word.length()-1));
//        return newStr.toString();
//    }

//    public String plusOut(String str, String word) {
//
//
//
//        StringBuilder newStr = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//            if (str.startsWith(word, i)) {
//                newStr.append(word);
//                i+=word.length()-1;
//            }
//            else  newStr.append("+");
//        }
//        return newStr.toString();
//
//    }
}

//    public String zipZap(String str) {
//       str.replaceAll("z\\wp","zp");
//    }



//    public String oneTwo(String str) {
//        char[] strTab = str.toCharArray();
//        int length = str.length()/3;
//        StringBuilder sb = new StringBuilder()
//        for (int i = 0; i < length*3; i+=3) {
//            sb.append(strTab[ i+1]); sb.append(strTab[ i+2]);sb.append(strTab[ i]);
//        }
//        return sb.toString();
//    }

//    public boolean sameStarChar(String str) {
//        boolean flag = true;
//        for (int i = 1; i < str.length()-1; i++) {
//            if (str.charAt(i)=='*' && str.charAt(i-1)==str.charAt(i+1)) flag = true;
//            else if (str.charAt(i)=='*' && str.charAt(i-1)!=str.charAt(i+1)) flag = false;
//
//        }
//        return flag;
//    }


//    public String getSandwich(String str) {
//        if(!str.contains("bread")) return "";
//        if (str.indexOf("bread")==str.lastIndexOf("bread")) return "";
//        return str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
//    }

//    public boolean xyzMiddle(String str) {
//
//        if (str.length() <3) return false;
//        boolean flag = false;
//        int index = 0;
//        for (int i = 0; i < str.length()-2; i++) {
//            if (str.substring(i,i+3).equals("xyz") )index = i ;
//            if (index <= str.length() - (index + 2) && index >= str.length() - (index + 4)) {
//                flag = true;
//                break;
//            }
//        }
//      return flag;
//    }



//    public boolean prefixAgain(String str, int n) {
//            for (int i = 0; i < str.length()-n; i++) {
//                if (str.substring(0,n).equals(str.substring(i+1,i+1+n))) return true;
//            }
//            return false;
//    }

//    public String repeatSeparator(String word, String sep, int count) {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i <count-1 ; i++) {
//            stringBuilder.append(word);
//            stringBuilder.append(sep);
//        }
//        stringBuilder.append(word);
//        return stringBuilder.toString();
//    }
//
//
//
//    public String repeatFront(String str, int n) {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i <n ; i++) {
//            stringBuilder.append(str.substring(0,n-i);
//        }
//        return stringBuilder.toString();
//    }
//
//    public String repeatEnd(String str, int n) {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i <n ; i++) {
//            stringBuilder.append(str.substring(str.length()-n));
//        }
//        return stringBuilder.toString();
//    }

//    public String mixString(String a, String b) {
//        StringBuilder sb = new StringBuilder();
//        String longer = (a.length()>b.length()) ? a : b ;
//        String shorter = (a.length()<b.length()) ? a : b ;
//        for (int i = 0; i <shorter.length() ; i++) {
//            sb.append(a.charAt(i));
//            sb.append(b.charAt(i));
//        }
//        sb.append(longer.substring(shorter.length()));
//        return sb.toString();
//    }




//    public boolean xyBalance(String str) {
//        int xPos= -1;
//        int yPos = -1;
//
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == 'x' ) xPos = i;
//            if(str.charAt(i) == 'y') yPos = i;
//        }
//
//        return (xPos == -1 || yPos>xPos);
//
//    }
//    public boolean xyzThere(String str) {
//        boolean flag = false;
//        if (str.equals("xyz")) return true;
//        for (int i = 0; i < str.length()-3; i++) {
//            String sub = str.substring(i,i+4);
//            if (sub.charAt(0)=='.' && sub.substring(1).equals("xyz")) flag = false;
//            else if (sub.charAt(0)!='.'  && sub.contains("xyz")) flag = true;
//        }
//        return flag;
//    }
//
////    public boolean endOther(String a, String b) {
////        return (a.endsWith(b.toLowerCase())|| b.endsWith(a.toLowerCase()));
////    }
//
//    public int countCode(String str) {
//        int count = 0;
//        for (int i = 0; i < str.length()-3; i++) {
//            if (str.substring(i,i+4).matches("co\\we")) count++;
//        }
//        return count;
//    }


//    public int countHi(String str) {
//        if (str.contains())
//    }


//    public String doubleChar(String str) {
//        StringBuilder sb = new StringBuilder();
//        for (char c : str.toCharArray()) {
//            sb.append(c);
//            sb.append(c);
//        }
//        return sb.toString();
//    }


//    @Test
//    void makeChocolate() {
//        assertAll(() -> assertEquals(4,new Testy().makeChocolate(4, 1, 9)),
//        () ->assertEquals(-1,new Testy().makeChocolate(4, 1, 10)),
//        () ->assertEquals(2,new Testy().makeChocolate(4, 1, 7)));
//    }
//    public int makeChocolate(int small, int big, int goal) {
//        int n = goal/5;
//        if (big == 0 && small>=goal) return small;
//        else if (big<n && goal<= big*5 +small) return goal-big*5;
//        else if (big >=n && goal<= n*5 +small)  return goal-n*5 ;
//        return -1;
//    }


