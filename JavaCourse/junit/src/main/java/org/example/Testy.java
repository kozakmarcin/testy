package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testy {


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
//        int strLength = str.length();
//        while (str.matches("(.)\\1+")){
//            System.out.println(str);
//            str = str.replaceFirst("(.)\\1+","");
//            int temp = str.length();
//            System.out.println(temp);
//        }
//
//
//        return -1;
////        String[] tab = str.split("(.+)\\1");
////        System.out.println( Arrays.toString(tab));
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


