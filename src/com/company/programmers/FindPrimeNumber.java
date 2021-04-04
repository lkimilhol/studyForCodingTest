package com.company.programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindPrimeNumber {
    static ArrayList<Integer> combNum;
    static String[] numberArr;

    public static int solution(String numbers) {
        final int size = 9999999 + 2;
        final int[] primeNumbers = new int[size];

        primeNumbers[0] = 1;
        primeNumbers[1] = 1;

        numberArr = numbers.split("");

        combNum = new ArrayList<>();
        for(String s : numberArr){
            combNum.add(Integer.parseInt(s));
        }

        int root = (int) Math.sqrt(primeNumbers.length);

        for (int i = 2; i <= root; i++) {
            if (primeNumbers[i] == 0) {
                for(int j=i; i*j<size; j++) {
                    primeNumbers[i * j] = i * j;
                }
            }
        }

        if(numberArr.length>1){
            for(int i = 1;i<numberArr.length;i++){
                int len = i+1;
                int[] visit = new int[numberArr.length];
                for(int j = 1;j<numberArr.length;j++){
                    visit[j]=0;
                }
                searchComb("",visit,len);
            }
        }

        Set<Integer> sol = new HashSet<>();
        for(Integer i:combNum){
            if (primeNumbers[i] == 0) {
                sol.add(i);
            }
        }
        return sol.size();
    }

    public static void searchComb(String ori,int[] visit,int len){
        for(int i = 0;i<visit.length;i++){
            if(visit[i] == 0){
                var nOri = ori;
                nOri += numberArr[i];
                int[] newVisit = new int[visit.length];
                System.arraycopy(visit,0,newVisit,0,visit.length);
                newVisit[i] = 1;
                if(nOri.length()<len){
                    searchComb(nOri,newVisit,len);
                }else{
                    if(!combNum.contains(Integer.parseInt(nOri)))
                        combNum.add(Integer.parseInt(nOri));
                }
            }
        }
    }
}
