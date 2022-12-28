package org.example;

import java.util.ArrayList;
import java.util.List;

public class AP1 {

    public int commonTwo(String[] a, String[] b) {
        int sum = 0;
        int i = 0;
        int j = 0;
        while (i<a.length && j<b.length){
            if (i>0 && a[i-1].equals(a[i]) || a[i].compareTo(b[j])<0) {
                i++;
            } else if  (j>0 && b[j-1].equals(b[j]) || a[i].compareTo(b[j])>0) {
                j++;
            } else {
                sum++;
                if (i<=a.length-1) i++;
                if (j<=b.length-1) j++;
            }

        }
        return sum;
    }


    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] merged = new String[n];
        int i = 0;
        int j = 0;
        int count = 0;
        while(count<n) {
            if (a[i].compareTo(b[j])<0) {
                merged[count] = a[i];
                i++;
            }
            else if  (a[i].compareTo(b[j])>0){
                merged[count]=b[j];
                j++;
            }else  {
                merged[count] = a[i];
                i++;
                j++;
            }
            count++;
        }
        return merged;
    }


    public int userCompare(String aName, int aId, String bName, int bId) {
        if(aName.compareTo(bName) == 0){
            if (aId<bId) return -1;
            else if (aId == bId) return 0;
            else return 1;
        }else if (aName.compareTo(bName) >0) return -1;
        else return 1;
    }

    public int bigHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            if(Math.abs(heights[i]-heights[i+1])>4) sum++;
        }
        return sum;
    }


    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            if(heights[i]<heights[i+1]) sum+=-2*(heights[i]-heights[i+1]);
            else sum+=heights[i]-heights[i+1];

        }
        return sum;
    }




    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum +=Math.abs(heights[i]-heights[i+1]);

        }
        return sum;
    }
    public int scoresSpecial(int[] a, int[] b) {
        return maxScore(a)+maxScore(b);
    }


    public int maxScore(int[] a){
        int max = 0;
        for (int i: a) {
            if(i%10==0 && i>max)max = i;
        }
        return max;
    }

    public String[] wordsWithout(String[] words, String target) {
        ArrayList<String> wordsEdited =new ArrayList<>();
        for (String word: words) {
            if (!word.equals(target)) wordsEdited.add(word);
        }
        return   wordsEdited.toArray(new String[0]);
    }

    public int scoreUp(String[] key, String[] answers) {
        int sum = 0;
        for (int i = 0; i < key.length; i++) {
            sum+=punctation(key[i],answers[i]);
        }
        return sum;
    }


    public int punctation(String key, String answer){
        if (key.equals(answer) ) return 4;
        else if (answer.equals("?")) return 0;
        else return -1;
    }


    public int matchUp(String[] a, String[] b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i].length()!=0 && b[i].length()!=0 && a[i].charAt(0)==b[i].charAt(0) ) sum++;
        }
        return sum;
    }


    public int[] copyEndy(int[] nums, int count) {
        int[] copy = new int[count];
        int i = 0;
        int j = 0;
        do {
            if (isEndy(nums[i])) {
                copy[j] = nums[i];
                j++;
                count--;
            }
            i++;
        } while (count!=0);
        return copy;
    }
    public boolean isEndy(int n){
        return (n>=0 && n<=10 || n >=90 && n<=100);
    }
    public int[] copyEvens(int[] nums, int count) {
        int[] copy = new int[count];
        int i = 0;
        int j = 0;
        do {
            if (nums[i] % 2 == 0) {
                copy[j] = nums[i];
                j++;
                count--;
            }
            i++;
        } while (count!=0);
        return copy;
    }

    public boolean dividesSelf(int n) {
        ArrayList<Integer> digits =  lastDigit(n);
        for (int i :digits) {
            if (i==0 || n %i != 0) return false;
        }
        return true;
    }


    public ArrayList<Integer> lastDigit(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        do {
            arrayList.add(n%10);
            n /= 10;
        } while (n>0);
        return arrayList;
    }


    public boolean hasOne(int n) {
        do {
            if (n % 10 == 1) return true;
            else n /= 10;
        } while (n>0);
        return false;
    }


    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> arrayList = new ArrayList();
        for (String s: words) {
            if (s.length() != len) arrayList.add(s);
        }
        return arrayList;
    }


    public int wordsCount(String[] words, int len) {
        int sum = 0;
        for (String s: words) {
            if (s.length()==len) sum++;
        }
        return sum;
    }

    public int scoresAverage(int[] scores) {
        int averageFirst = average(scores,0,scores.length/2);
        int averageSecond = average(scores, scores.length/2, scores.length);
        return Math.max(averageFirst,averageSecond);
    }

    public int average(int[] scores, int start, int end){
        int sum = 0;
        for (int i = start; i < end ; i++) {
            sum+=scores[i];
        }
        return sum/(end-start);
    }

    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length-2; i++) {
            if (scores[i+2]-scores[i] <3) return true;
        }
        return false;
    }
    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length-1; i++) {
            if(scores[i]==100 && scores[i+1] == 100) return true;
        }
        return false;
    }


    public boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length-1; i++) {
            if (scores[i+1]<scores[i]) return false;
        }
        return true;
    }


}
