package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String3 {
    
    // https://codingbat.com/prob/p154137
    
    public String notReplace(String str) {
        StringBuilder sb = new StringBuilder();
        boolean isLetter = false;
        str = " " + str+ "  ";
        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i)=='i'){
                if( str.charAt(i+1)=='s'&& !isLetter && !Character.isLetter(str.charAt(i+2))){
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
        return sb.toString().substring(1);

    }

    // https://codingbat.com/prob/p121193

    public int sumNumbers(String str) {
        StringBuilder sb = new StringBuilder();
        int sum= 0;
        for(int i=0; i<str.length(); i++){
            if (str.substring(i,i+1).matches("[0-9.]+")) sb.append(str.substring(i,i+1));
            else {
                if (sb.length()!=0)  sum+=Integer.parseInt(sb.toString());
                sb = new StringBuilder();
            }
        }
        if (sb.length()!=0)  sum+=Integer.parseInt(sb.toString());
        return sum;
    }
    
    // https://codingbat.com/prob/p179479
    
    public int maxBlock(String str) {
        int max = 0;
        int temp = 1;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i)==str.charAt(i+1)) temp++;
            if (temp>max) max=temp;
            if (str.charAt(i) != str.charAt(i+1)) temp = 1;
        }
        return max;
    }

    // https://codingbat.com/prob/p139411
    
    public String mirrorEnds(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)== string.charAt(string.length()-i-1)) stringBuilder.append(string.charAt(i));
            else break;
        }

        return stringBuilder.toString();
    }

    // https://codingbat.com/prob/p131516
    
    public String sameEnds(String string) {
        String longestSub = "";
        for (int i = 0; i <= string.length()/2; i++) {
            String prefix =string.substring(0,i);
            String suffix = string.substring(string.length()-i);
            if (prefix.equals(suffix)) longestSub = prefix;
        }

        return longestSub;
    }
    
    // https://codingbat.com/prob/p197890

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

    // https://codingbat.com/prob/p195714
    
    public int countTriple(String str) {
        int countChar = 0;
        Pattern pattern = Pattern.compile("(.)\\1{2}");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            int index = matcher.start();
            countChar++;
            str= str.replaceFirst("(.)\\1{2}",str.substring(index,index+2));
            matcher = pattern.matcher(str);
        }
        return countChar;
    }
    
    // https://codingbat.com/prob/p198664

    public boolean gHappy(String str) {
        str=  str.replaceAll("g{2,}","");
        return !str.contains("g");
    }

    // https://codingbat.com/prob/p141736
    
    public boolean equalIsNot(String str) {
        int countIs= 0;
        int countNot = 0;
        while (str.matches(".*is+.*")){
            countIs++;
            str= str.replaceFirst("is","");
        }
        while (str.matches(".*not+.*")){
            countNot++;
            str= str.replaceFirst("not","");
        }
        return (countNot==countIs);
    }

    // https://codingbat.com/prob/p192570
    
    public String withoutString(String base, String remove) {
        return  (base.matches(".+(?i)"+remove + "+.*")) ?  base.replaceAll("(?i)"+remove,""): base ;
    }

    // https://codingbat.com/prob/p199171
    
    public int countYZ(String str) {
        String[] splitedStr = str.toLowerCase().split("[^a-z]");
        int count = 0;
        for (String check: splitedStr) {
            if (check.length()==1 && (check.equals("y")||(check.equals("z") ))) count++;
            else if (check.matches("[a-zA-Z]+y$|[a-zA-Z]+z$")) count++;
        }
        return count;
    }

}
