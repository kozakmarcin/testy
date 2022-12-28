package org.example;

public class Logic1 {
    public int sumLimit(int a, int b) {
        if (String.valueOf(a+b).length()>String.valueOf(a).length()) return a;
        return a+b;
    }


    public boolean shareDigit(int a, int b) {
        return (a/10 == b/10 || a/10 == b%10 ||a%10 == b/10 || a%10 == b%10 );
    }
    public int  blueTicket(int a, int b, int c) {
        if (a+b==10 || b+c==10 || a+c==10) return 10;
        else if (a+b==b+c+10||a+b==a+c+10) return 5;
        return 0;
    }


    public int greenTicket(int a, int b, int c) {
        if (a==b && b==c) return 20;
        else if (a==b || b==c || a==c) return 10;
        return 0;
    }
    public int redTicket(int a, int b, int c) {
        if(a==2&& a==b && b== c) return 10;
        else if(a==b && b== c) return 5;
        else if(a!=b && a!=c) return 1;
        return 0;
    }

    public int maxMod5(int a, int b) {
        if (a==b) return 0;
        else if (a%5 == b%5) return Math.min(a,b);
        return Math.max(a,b);
    }


    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles ){
            if (die1 == die2 && die1 == 6) return 1+ die1;
            else if(die1==die2) return die1 +die2 +1;
        }
        return die1+die2;
    }



    public boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a-b)>=10 || Math.abs(b-c)>=10 || Math.abs(a-c)>=10);
    }
    public boolean lastDigit(int a, int b, int c) {
        return (a%10 == b%10 || a%10==c%10|| b%10 ==c%10);
    }



    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) return a>=b && b>=c;
        return a > b && b>c;
    }


    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) return c>b;
        return b>a &&c>b;
    }

    public boolean twoAsOne(int a, int b, int c) {
        return (a + b == c) || (b+c==a) || (a+c==b);

    }


    public static String fizzString2(int n) {
        if (n%5 == 0 && n%3 == 0) return  "FizzBuzz";
        else if (n%3 == 0)  return  "Fizz!";
        else if (n%5 == 0) return "Buzz!";
        else return "" + n + "!";
    }




    public String fizzString(String str) {
        if (str.charAt(0)=='f' && str.charAt(str.length()-1)=='b') return  "FizzBuzz";
        else if(str.charAt(0)=='f') return  "Fizz";
        else if(str.charAt(str.length()-1)=='b') return  "Buzz";
        return str;

    }

    public int teaParty(int tea, int candy) {
        if (tea<5 || candy<5) return 0;
        else if (tea >= 2*candy || candy>=2*tea) return 2;
        return 1;
    }
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
         if (isAsleep) return false;
          else if (isMorning) return isMom;
          return true;

    }
    public int teenSum(int a, int b) {
        if ((a>=13 && a<=19) ||( b>=13 && b<=19)) return 19;
        return a+b;
    }
    public boolean nearTen(int num) {
            return num%10<=2 || num%10>=8;
    }

    public boolean old35(int n) {
        if (n%3 == 0 && n%5 == 0) return false;
        return (n%3 == 0 || n%5 == 0);
    }




    public boolean specialEleven(int n) {
        return (n%11 == 0|| n%11 == 1);
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if(outsideMode) return (n <=1 || n >=10);
        else return n >= 1 && n <= 10;
    }


    public boolean love6(int a, int b) {
        if (a==6||b==6) return true;
        else if(a+b ==6) return true;
        else (Math.abs( a-b) == 6 || Math.abs(b-a) == 6) return true;
        return false;
    }

    public String alarmClock(int day, boolean vacation) {
        if (vacation){
            if (day == 0 || day== 6) return "off";
            return "10:00";
        }
        if (day == 0 || day== 6) return "10:00";
        return "7:00";
    }


    public int sortaSum(int a, int b) {
        return  (a+b>=10 && a+b<=19) ? 20: a+b;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday){
            if (speed > 85) return 2;
            else if (speed > 65) return 1;
            return 0;
        }
        if (speed > 80) return 2;
        else if (speed > 60) return 1;
        return 0;
    }


    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (!isSummer && 60<=temp && temp<=90) return true;
        return (isSummer && 60<=temp && temp<=100);
    }
    public int dateFashion(int you, int date) {
        if (you <= 2 || date <=2) return 0;
        else if (you>=8 || date >= 8) return 2;
        return 1;
    }
}
