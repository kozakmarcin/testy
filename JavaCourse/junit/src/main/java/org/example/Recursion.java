package org.example;

public class Recursion {
    public String noX(String str) {
        if(str.length()<1 ) return "";
        if (str.charAt(str.length()-1)=='x') return noX(str.substring(0, str.length() - 1)) + "";
        return noX(str.substring(0, str.length()-1))+ str.charAt(str.length()-1);
    }

    public String changePi(String str) {
        if(str.length()<1 ) return "";
        if(str.length()<3 && !str.equals("pi")) return str.substring(0, str.length());
        String substring = str.substring(str.length()-2);
        if (substring.equals("pi")) return changePi(str.substring(0, str.length() - 2))+"3.14";
        else return  changePi(str.substring(0, str.length() - 1) )+ str.charAt(str.length()-1);
    }


    public String changeXY(String str) {
        if(str.length()<1 ) return "";
        if (str.charAt(str.length()-1)=='x') return changeXY(str.substring(0, str.length() - 1)) + "y" ;
        else return  changeXY(str.substring(0, str.length() - 1)) + str.charAt(str.length()-1);
    }

    public int countHi(String str) {
        if(str.length()<3 && !str.equals("hi")) return 0;
        String substring = str.substring(str.length()-2);
        if (substring.equals("hi")) return 1 +countHi(str.substring(0, str.length() - 1));
        return countHi(str.substring(0, str.length() - 1));
    }

    public int countX(String str) {
        if(str.length()==0) return 0;
        String substring = str.substring(0, str.length() - 1);
        if (str.charAt(str.length()-1)=='x') return 1+countX(substring);
        return countX(substring);
    }


    public int powerN(int base, int n) {
        if(n == 0) return 1;
        return base*powerN(base,n-1);
    }

    public int count8(int n) {
        if (n==0) return 0;
        if (n%10==8){
            if((n/10)%10==8) return 2+count8(n/=10);
            else return  1+count8(n/=10);
        }
        return count8(n/=10);
    }


    public int count7(int n) {


        if (n==0) return 0;
        if (n%10==7)return  1+count7(n/=10);
        return count7(n/=10);
    }

    public int sumDigits(int n) {
        if (n==0) return 0;
        int last=n%10;
        return last+sumDigits(n/=10);
    }

    public int triangle(int rows) {
        if (rows==0) return 0;

        return rows+triangle(rows-1);
    }
    public int bunnyEars2(int bunnies) {
        if (bunnies==0) return 0;
        if (bunnies%2 !=0) return 2+bunnyEars2(bunnies-1);
        else return 3+bunnyEars2(bunnies-1);
    }

    public int fibonacci(int n) {
        if (n == 0) return 0;
        else if (n== 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }


    public int bunnyEars(int bunnies) {
        if (bunnies == 0) return 0;

        return 2+bunnyEars(bunnies-1);
    }


    public int factorial(int n) {
        if (n>0){
            return n*factorial(n-1);
        } else return 1;
    }
}
