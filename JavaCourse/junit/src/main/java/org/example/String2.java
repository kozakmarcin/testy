package org.example;

public class String2 {

    public String wordEnds(String str, String word) {
        StringBuilder newStr = new StringBuilder();
        if (str.equals(word)) return "";
        if (str.startsWith(word)) newStr.append(str.charAt(word.length()));
        for (int i = 1; i < str.length()-word.length(); i++) {
            if (str.startsWith(word, i)) {
                newStr.append(str.charAt(i-1));
                newStr.append(str.charAt(i+word.length()));
                i+=word.length()-1;
            }
        }
        if(str.endsWith(word)) newStr.append(str.charAt(str.length()- word.length()-1));
        return newStr.toString();
    }

    public String plusOut(String str, String word) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith(word, i)) {
                newStr.append(word);
                i+=word.length()-1;
            }
            else  newStr.append("+");
        }
        return newStr.toString();

    }

    public String starOut(String str) {
        return str.replaceAll(".?\\*  +.?","");
    }

    public String zipZap(String str) {
       return str.replaceAll("z\\wp","zp");
    }



    public String oneTwo(String str) {
        char[] strTab = str.toCharArray();
        int length = str.length()/3;
        StringBuilder sb = new StringBuilder()
        for (int i = 0; i < length*3; i+=3) {
            sb.append(strTab[ i+1]); sb.append(strTab[ i+2]);sb.append(strTab[ i]);
        }
        return sb.toString();
    }

    public boolean sameStarChar(String str) {
        boolean flag = true;
        for (int i = 1; i < str.length()-1; i++) {
            if (str.charAt(i)=='*' && str.charAt(i-1)==str.charAt(i+1)) flag = true;
            else if (str.charAt(i)=='*' && str.charAt(i-1)!=str.charAt(i+1)) flag = false;

        }
        return flag;
    }


    public String getSandwich(String str) {
        if(!str.contains("bread")) return "";
        if (str.indexOf("bread")==str.lastIndexOf("bread")) return "";
        return str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
    }

    public boolean xyzMiddle(String str) {

        if (str.length() <3) return false;
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i,i+3).equals("xyz") )index = i ;
            if (index <= str.length() - (index + 2) && index >= str.length() - (index + 4)) {
                flag = true;
                break;
            }
        }
      return flag;
    }



    public boolean prefixAgain(String str, int n) {
            for (int i = 0; i < str.length()-n; i++) {
                if (str.substring(0,n).equals(str.substring(i+1,i+1+n))) return true;
            }
            return false;
    }

    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <count-1 ; i++) {
            stringBuilder.append(word);
            stringBuilder.append(sep);
        }
        stringBuilder.append(word);
        return stringBuilder.toString();
    }



    public String repeatFront(String str, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <n ; i++) {
            stringBuilder.append(str.substring(0,n-i);
        }
        return stringBuilder.toString();
    }

    public String repeatEnd(String str, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <n ; i++) {
            stringBuilder.append(str.substring(str.length()-n));
        }
        return stringBuilder.toString();
    }

    public String mixString(String a, String b) {
        StringBuilder sb = new StringBuilder();
        String longer = (a.length()>b.length()) ? a : b ;
        String shorter = (a.length()<b.length()) ? a : b ;
        for (int i = 0; i <shorter.length() ; i++) {
            sb.append(a.charAt(i));
            sb.append(b.charAt(i));
        }
        sb.append(longer.substring(shorter.length()));
        return sb.toString();
    }




    public boolean xyBalance(String str) {
        int xPos= -1;
        int yPos = -1;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'x' ) xPos = i;
            if(str.charAt(i) == 'y') yPos = i;
        }

        return (xPos == -1 || yPos>xPos);

    }
    public boolean xyzThere(String str) {
        boolean flag = false;
        if (str.equals("xyz")) return true;
        for (int i = 0; i < str.length()-3; i++) {
            String sub = str.substring(i,i+4);
            if (sub.charAt(0)=='.' && sub.substring(1).equals("xyz")) flag = false;
            else if (sub.charAt(0)!='.'  && sub.contains("xyz")) flag = true;
        }
        return flag;
    }

    public boolean endOther(String a, String b) {
        return (a.endsWith(b.toLowerCase())|| b.endsWith(a.toLowerCase()));
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-3; i++) {
            if (str.substring(i,i+4).matches("co\\we")) count++;
        }
        return count;
    }


    public int countHi(String str) {
        if (str.contains())
    }


    public String doubleChar(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(c);
            sb.append(c);
        }
        return sb.toString();
    }
}
