package org.example;

public class String1 {

    // https://codingbat.com/prob/p151359
    
    public String withoutX2(String str) {
        if (str.length()>=2  && str.startsWith("x")&& str.charAt(1)=='x' ) return str.substring(2);
        else if ( str.length()>=1 && str.startsWith("x") ) return str.substring(1);
        else if (str.length()>2  && str.charAt(1)=='x' ) return str.charAt(0)+ str.substring(2);
        return str;
    }

    // https://codingbat.com/prob/p151940
    
    public String withoutX(String str) {
        if (str.startsWith("x")&& str.endsWith("x") && str.length()>1) return str.substring(1,str.length()-1);
        else if (str.startsWith("x")) return str.substring(1);
        else if (str.endsWith("x")) return str.substring(0,str.length()-1);
        return str;
    }
    
    

    // https://codingbat.com/prob/p141494

    public String startWord(String str, String word) {
        if (word.length()>1 && str.regionMatches(1,word.substring(1),0,word.length()-1)) return str.substring(0,word.length());
        else if (word.length() ==1 && str.length()>0)return str.substring(0,1);
        return "";
    }
    
    // https://codingbat.com/prob/p110141
    
    public String deFront(String str) {    
        if  (str.startsWith("ab")) return str;  
        else if (str.startsWith("a")) return "a"+str.substring(2);
        else if (str.charAt(1)=='b')  return "b"+str.substring(2);
        return str.substring(2);
    }
    
    // https://codingbat.com/prob/p142247
    
    public String without2(String str) {
        if (str.length()>2 && str.endsWith(str.substring(0,2))) return str.substring(2);
        else if (str.length()>2 || str.length()==1) return str;
        return "";
    }
    
    // https://codingbat.com/prob/p172063
    
    public String extraFront(String str) {
        if(str.length()>2) return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
        return str + str + str;
    }

    
    // https://codingbat.com/prob/p105745
    
    public String minCat(String a, String b) {
        if(a.length()>b.length()) return a.substring(a.length()-b.length())+b;
        return a+b.substring(b.length()-a.length());
    }

    
    // https://codingbat.com/prob/p196652
    
    public boolean frontAgain(String str) {
        if (str.length()>1) return  str.endsWith(str.substring(0,2));
        return false;
    }
    
    // https://codingbat.com/prob/p199216
    
    public String seeColor(String str) {
        if (str.startsWith("red")) return "red";
        else if (str.startsWith("blue")) return "blue";
        return "";
    }
    
    // https://codingbat.com/prob/p194786
    
    public String lastTwo(String str) {
        if (str.length() >=2) {
            char c1 = str.charAt(str.length()-1);
            char c2 = str.charAt(str.length()-2);
            return str.substring(0, str.length()-2) + c1 + c2;
        } else if (str.length() ==1) return str;
        return "";
    }

    
    // https://codingbat.com/prob/p132118
    
   public String conCat(String a, String b) {
        if (a.length()>0&& b.length()>0 &&a.charAt(a.length()-1)==b.charAt(0)) return a.concat(b.substring(1));
        return a.concat(b);
    }

    // https://codingbat.com/prob/p138183
    
    public String lastChars(String a, String b) {
        String s = "";
        if (a.isEmpty()) s="@";
        else s += a.charAt(0);
        if ((b.isEmpty())) s+="@";
        else s+=b.charAt(b.length()-1);
        return s;
    }

    // https://codingbat.com/prob/p139076
    
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

    // https://codingbat.com/prob/p139075
    
    public boolean hasBad(String str) {
        return (str.startsWith("bad")|| str.startsWith("bad",1));
    }

    // https://codingbat.com/prob/p115863

    public String middleThree(String str) {
        for(int i=0; i<str.length()/2;i++){
            String s1 = str.substring(0,i);
            String s2 = str.substring(str.length()-i);
            if (str.length()-s1.length()-s2.length() == 3) return str.substring(s1.length(),s1.length()+3);
        }
        return "";

    }
    
    // https://codingbat.com/prob/p144623
    
    public String twoChar(String str, int index) {
        if (str.length()-2 < index || index<0) return str.substring(0,2);
        return str.substring(index,index+2);
    }
    
    // https://codingbat.com/prob/p174148

    public String nTwice(String str, int n) {
        return str.substring(0,n)+str.substring(str.length()-n);
    }

    // https://codingbat.com/prob/p103895

    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    // https://codingbat.com/prob/p137729

    public String middleTwo(String str) {
        return str.substring(str.length()/2-1,str.length()/2+1);
    }

    // https://codingbat.com/prob/p174254

    public String withouEnd2(String str) {
        return (str.length()<2)? "" :str.substring(1,str.length()-1);
    }

    // https://codingbat.com/prob/p162477

    public String theEnd(String str, boolean front) {
        return (front)? str.substring(0,1) : str.substring(str.length()-1);
    }

    // https://codingbat.com/prob/p130781

    public String right2(String str) {
        return str.substring(str.length()-2)+str.substring(0,str.length()-2);
    }

    // https://codingbat.com/prob/p197720

    public String left2(String str) {
        return str.substring(str.length()-2)+str.substring(0,str.length()-2);
    }


    // https://codingbat.com/prob/p143825

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }
    
    //     https://codingbat.com/prob/p168564

    public String comboString(String a, String b) {
        if (a.length()<b.length()) return a+b+a;
        return b+a+b;
    }


    // https://codingbat.com/prob/p130896
    
    public String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }
    
    // https://codingbat.com/prob/p172267

    public String firstHalf(String str) {
        return str.substring(0,str.length()/2);
    }

    // https://codingbat.com/prob/p163411

    public String firstTwo(String str) {
        if(str.length() < 2) return str;
        return str.substring(0,2);
    }

    // https://codingbat.com/prob/p108853

    public String extraEnd(String str) {
        return str.substring(str.length()-2)+str.substring(str.length()-2)+str.substring(str.length()-2);
    }

    // https://codingbat.com/prob/p184030    

    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2,4);
    }

    // https://codingbat.com/prob/p147483

    public String makeTags(String tag, String word) {
        String tagbegin = "<"+tag+">";
        String tagender = "</"+tag+">";
        return tagbegin + word + tagender;
    }

    // https://codingbat.com/prob/p161056

    public String makeAbba(String a, String b) {
        return a + b + b +a;
    }

    // https://codingbat.com/prob/p171896

    public String helloName(String name) {
        return "Hello "+ name+"!";
    }
}
