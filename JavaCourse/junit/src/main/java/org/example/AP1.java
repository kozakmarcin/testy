package org.example;

import java.util.ArrayList;
import java.util.List;

public class AP1 {
    
    // https://codingbat.com/prob/p100369

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

    // https://codingbat.com/prob/p139150
    
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

    // https://codingbat.com/prob/p143482

    public int userCompare(String aName, int aId, String bName, int bId) {
        if(aName.compareTo(bName) == 0){
            if (aId<bId) return -1;
            else if (aId == bId) return 0;
            else return 1;
        }else if (aName.compareTo(bName) >0) return -1;
        else return 1;
    }
    
    // https://codingbat.com/prob/p197710

    public int bigHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            if(Math.abs(heights[i]-heights[i+1])>4) sum++;
        }
        return sum;
    }

    // https://codingbat.com/prob/p157900

    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            if(heights[i]<heights[i+1]) sum+=-2*(heights[i]-heights[i+1]);
            else sum+=heights[i]-heights[i+1];

        }
        return sum;
    }


    // https://codingbat.com/prob/p148138

    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum +=Math.abs(heights[i]-heights[i+1]);

        }
        return sum;
    }
    
    https://codingbat.com/prob/p140485
    
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

    // https://codingbat.com/prob/p121236
    
    public String[] wordsWithout(String[] words, String target) {
        ArrayList<String> wordsEdited =new ArrayList<>();
        for (String word: words) {
            if (!word.equals(target)) wordsEdited.add(word);
        }
        return   wordsEdited.toArray(new String[0]);
    }
    
    // https://codingbat.com/prob/p180365

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

    // https://codingbat.com/prob/p139677
    
    public int matchUp(String[] a, String[] b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i].length()!=0 && b[i].length()!=0 && a[i].charAt(0)==b[i].charAt(0) ) sum++;
        }
        return sum;
    }

    // https://codingbat.com/prob/p130124
    
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
    
    // https://codingbat.com/prob/p134174
    
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
    
    // https://codingbat.com/prob/p165941

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

    // https://codingbat.com/prob/p191212
    
    public boolean hasOne(int n) {
        do {
            if (n % 10 == 1) return true;
            else n /= 10;
        } while (n>0);
        return false;
    }

    // https://codingbat.com/prob/p183407
    
    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> arrayList = new ArrayList();
        for (String s: words) {
            if (s.length() != len) arrayList.add(s);
        }
        return arrayList;
    }
    
    // https://codingbat.com/prob/p183837
    
    public String[] wordsFront(String[] words, int n) {
        return Arrays.copyOf(words, n);
    }

    // https://codingbat.com/prob/p124620
    
    public int wordsCount(String[] words, int len) {
        int sum = 0;
        for (String s: words) {
            if (s.length()==len) sum++;
        }
        return sum;
    }

    // https://codingbat.com/prob/p123837
    
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
    
    // https://codingbat.com/prob/p194530

    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length-2; i++) {
            if (scores[i+2]-scores[i] <3) return true;
        }
        return false;
    }
    
    // https://codingbat.com/prob/p179487
    
    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length-1; i++) {
            if(scores[i]==100 && scores[i+1] == 100) return true;
        }
        return false;
    }

    // https://codingbat.com/prob/p146974
    
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length-1; i++) {
            if (scores[i+1]<scores[i]) return false;
        }
        return true;
    }


}
