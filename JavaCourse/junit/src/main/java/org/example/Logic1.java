package org.example;

public class Logic1 {
    
    // https://codingbat.com/prob/p118077
    
    public int sumLimit(int a, int b) {
        if (String.valueOf(a+b).length()>String.valueOf(a).length()) return a;
        return a+b;
    }

    // https://codingbat.com/prob/p153748

    public boolean shareDigit(int a, int b) {
        return (a/10 == b/10 || a/10 == b%10 ||a%10 == b/10 || a%10 == b%10 );
    }
    
    // https://codingbat.com/prob/p192267
    
    public int  blueTicket(int a, int b, int c) {
        if (a+b==10 || b+c==10 || a+c==10) return 10;
        else if (a+b==b+c+10||a+b==a+c+10) return 5;
        return 0;
    }

    // https://codingbat.com/prob/p120633

    public int greenTicket(int a, int b, int c) {
        if (a==b && b==c) return 20;
        else if (a==b || b==c || a==c) return 10;
        return 0;
    }
    
    // https://codingbat.com/prob/p170833
    
    public int redTicket(int a, int b, int c) {
        if(a==2&& a==b && b== c) return 10;
        else if(a==b && b== c) return 5;
        else if(a!=b && a!=c) return 1;
        return 0;
    }
    
    // https://codingbat.com/prob/p115384
    
    public int maxMod5(int a, int b) {
        if (a==b) return 0;
        else if (a%5 == b%5) return Math.min(a,b);
        return Math.max(a,b);
    }
    
    // https://codingbat.com/prob/p115233

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles ){
            if (die1 == die2 && die1 == 6) return 1+ die1;
            else if(die1==die2) return die1 +die2 +1;
        }
        return die1+die2;
    }

    // https://codingbat.com/prob/p179196

    public boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a-b)>=10 || Math.abs(b-c)>=10 || Math.abs(a-c)>=10);
    }
    
    // https://codingbat.com/prob/p140272
    
    public boolean lastDigit(int a, int b, int c) {
        return (a%10 == b%10 || a%10==c%10|| b%10 ==c%10);
    }

    // https://codingbat.com/prob/p140272

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) return a>=b && b>=c;
        return a > b && b>c;
    }

    // https://codingbat.com/prob/p154188

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) return c>b;
        return b>a &&c>b;
    }
    
    // https://codingbat.com/prob/p113261

    public boolean twoAsOne(int a, int b, int c) {
        return (a + b == c) || (b+c==a) || (a+c==b);

    }
    
    // https://codingbat.com/prob/p115243
    
    public String fizzString2(int n) {
        if (n%5 == 0 && n%3 == 0) return  "FizzBuzz";
        else if (n%3 == 0)  return  "Fizz!";
        else if (n%5 == 0) return "Buzz!";
        else return "" + n + "!";
    }


    // https://codingbat.com/prob/p137136

    public String fizzString(String str) {
        if (str.charAt(0)=='f' && str.charAt(str.length()-1)=='b') return  "FizzBuzz";
        else if(str.charAt(0)=='f') return  "Fizz";
        else if(str.charAt(str.length()-1)=='b') return  "Buzz";
        return str;

    }
    
    // https://codingbat.com/prob/p177181
    
    public int teaParty(int tea, int candy) {
        if (tea<5 || candy<5) return 0;
        else if (tea >= 2*candy || candy>=2*tea) return 2;
        return 1;
    }
    
    // https://codingbat.com/prob/p110973
    
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
         if (isAsleep) return false;
         else if (isMorning) return isMom;
         return true;

    }
    
    // https://codingbat.com/prob/p178728
    
    public int teenSum(int a, int b) {
        if ((a>=13 && a<=19) ||( b>=13 && b<=19)) return 19;
        return a+b;
    }
    
    // https://codingbat.com/prob/p193613
    
    public boolean nearTen(int num) {
            return num%10<=2 || num%10>=8;
    }

    // https://codingbat.com/prob/p133158
    
    public boolean less20(int n) {
        return (n%20 == 18|| n%20 == 19);
    }
    
    // https://codingbat.com/prob/p159612
    
    public boolean old35(int n) {
        if (n%3 == 0 && n%5 == 0) return false;
        return (n%3 == 0 || n%5 == 0);
    }

    // https://codingbat.com/prob/p118290
    
    public boolean more20(int n) {
        return (n%20 == 1|| n%20 == 2);
    }

    // https://codingbat.com/prob/p100962
    
    public boolean specialEleven(int n) {
        return (n%11 == 0|| n%11 == 1);
    }
    
    // https://codingbat.com/prob/p137365

    public boolean in1To10(int n, boolean outsideMode) {
        if(outsideMode) return (n <=1 || n >=10);
        else return n >= 1 && n <= 10;
    }


    // https://codingbat.com/prob/p137742
    
    public boolean love6(int a, int b) {
        if (a==6||b==6) return true;
        else if(a+b ==6) return true;
        else (Math.abs( a-b) == 6 || Math.abs(b-a) == 6) return true;
        return false;
    }
    
    // https://codingbat.com/prob/p160543

    public String alarmClock(int day, boolean vacation) {
        if (vacation){
            if (day == 0 || day== 6) return "off";
            return "10:00";
        }
        if (day == 0 || day== 6) return "10:00";
        return "7:00";
    }

    // https://codingbat.com/prob/p183071

    public int sortaSum(int a, int b) {
        return  (a+b>=10 && a+b<=19) ? 20: a+b;
    }

    // https://codingbat.com/prob/p157733
    
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

    // https://codingbat.com/prob/p141061

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (!isSummer && 60<=temp && temp<=90) return true;
        return (isSummer && 60<=temp && temp<=100);
    }
    
    // https://codingbat.com/prob/p103360
    
    public int dateFashion(int you, int date) {
        if (you <= 2 || date <=2) return 0;
        else if (you>=8 || date >= 8) return 2;
        return 1;
    }
    
    // https://codingbat.com/prob/p159531
    
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (!isWeekend && cigars >=40 && cigars<=60) return true;
        return (isWeekend && cigars >=40);
    }
}
