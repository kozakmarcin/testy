package org.example;

public class Logic2 {

    public static int makeChocolate(int small, int big, int goal) {
        int n = goal/5;
        if (big == 0 && small>=goal) return small;
        else if (big<n && goal<= big*5 +small) return goal-big*5;
        else if (big >=n && goal<= n*5 +small)  return goal-n*5 ;
        return -1;
    }


    public boolean closeFar(int a, int b, int c) {
        return ((Math.abs(a-b)<=1 && Math.abs(a-c)>=2 && Math.abs(b-c)>=2) || (Math.abs(a-c)<=1 && Math.abs(a-b)>=2 && Math.abs(b-c)>=2) );
    }


    public static int round10(int num){
        if (num%10 >=5) return ((num/10)+1)*10;
        return (num/10)*10;
    }

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a)+fixTeen(b)+fixTeen(c);
    }

    public static int fixTeen(int n){
        if (n!=15 && n!= 16 && n>=13 && n<=19) return 0;
        return n;
    }

    public int luckySum(int a, int b, int c) {
        if (a==13) return 0;
        else if (b==13) return a;
        else if (c==13) return a+b;
        return a+b+c;
    }
    public int loneSum(int a, int b, int c) {
        if(a==b && b==c) return 0;
        else if(a==b) return b+c;
        else if(b==c) return a+c;
        return a+b+c;
    }


    public static boolean makeBricks(int small, int big, int goal) {
        int n = goal/5;
         if (big == 0) {System.out.println("1"); return (small>= goal);}
         else if ( big>n) {System.out.println("2"); return (small >=goal-n*5);}
        System.out.println("3"); return  ( small>= goal-big*5);
    }

}
