package org.example;

public class String1 {

    public static String withoutX2(String str) {
        if (str.length()>=2  && str.startsWith("x")&& str.charAt(1)=='x' ) return str.substring(2);
        else if ( str.length()>=1 && str.startsWith("x") ) return str.substring(1);
        else if (str.length()>2  && str.charAt(1)=='x' ) return str.charAt(0)+ str.substring(2);
        return str;
    }


    public static String withoutX(String str) {
        if (str.startsWith("x")&& str.endsWith("x") && str.length()>1) return str.substring(1,str.length()-1);
        else if (str.startsWith("x")) return str.substring(1);
        else if (str.endsWith("x")) return str.substring(0,str.length()-1);
        return str;

    }



    public static String startWord(String str, String word) {

        if (word.length()>1 && str.regionMatches(1,word.substring(1),0,word.length()-1)) return str.substring(0,word.length());
        else if (word.length() ==1 && str.length()>0)return str.substring(0,1);
        return "";
    }

    public static String conCat(String a, String b) {
        if (a.charAt(a.length()-1)==b.charAt(0)) return a.concat(b.substring(1));
        return a.concat(b);

    }


    public String lastChars(String a, String b) {
        String s = "";
        if (a.isEmpty()) s="@";
        else s += a.charAt(0);
        if ((b.isEmpty())) s+="@";
        else s+=b.charAt(b.length()-1);
        return s;
    }


    public String atFirst(String str) {
        int len = str.length();
        if (len <2) {
            for (int i = len; i < 2; i++) {
                str+="@";
            }
            return str;
        }
        return str.substring(0,2);
    }

    public static boolean hasBad(String str) {
        return (str.startsWith("bad")|| str.startsWith("bad",1));
    }



    public static String middleThree(String str) {
        for(int i=0; i<str.length()/2;i++){
            String s1 = str.substring(0,i);
            String s2 = str.substring(str.length()-i);
            if (str.length()-s1.length()-s2.length() == 3) return str.substring(s1.length(),s1.length()+3);
        }
        return "";

    }
//    public static String twoChar(String str, int index) {
        if (str.length()-2 < index) return str.substring(0,2);
        return str.substring(index,index+2);
    }


    public static String middleTwo(String str) {
        return str.substring(str.length()/2-1,str.length()/2+1);
    }


    public static String withouEnd2(String str) {
        return (str.length()<2)? "" :str.substring(1,str.length()-1);
    }

    public static String theEnd(String str, boolean front) {
        return (front)? str.substring(0,1) : str.substring(str.length()-1);
    }

    public static String left2(String str) {
        return str.substring(str.length()-2)+str.substring(0,str.length()-2);
    }


    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public static String comboString(String a, String b) {
        if (a.length()<b.length()) return a+b+a;
        return b+a+b;
    }



    public static String spinWords(String sentence) {
        StringBuilder sb1 = new StringBuilder();

        for (String s: sentence.split(" ")) {
            if (s.length()<5) sb1.append(s +" ");
            else {
                sb1.append(new StringBuilder(s).reverse().toString()+" ");
            }
        }
        sb1.delete(sb1.length()-1,sb1.length());
        return sb1.toString();

    }

    public static String firstTwo(String str) {
        if(str.length() < 2) return str;
        return str.substring(0,2);
    }
    public static String extraEnd(String str) {
        return str.substring(str.length()-2)+str.substring(str.length()-2)+str.substring(str.length()-2);
    }


    public static String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2,4);
    }
}
