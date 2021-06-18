package com.rnl.prc.array;

import java.util.*;

public class ElectionWinner {


    private static String findWinner(String[] str){
        if (null == str|| str.length == 0){
            return null;
        }
        if (str.length == 1){
            return str[0];
        }

        boolean tie = false;
        HashMap<String, Integer> winCnt = new HashMap<>();
        String maxOccur = null;
        int maxCount = 0;
        for(String s:str){

            if (winCnt.containsKey(s)){
                winCnt.put(s, winCnt.get(s)+1);

            }
            else{
                winCnt.put(s,1);
            }

            tie = winCnt.get(s) == maxCount;
            if(winCnt.get(s) > maxCount){
                maxCount = winCnt.get(s);
                maxOccur = s;
            }
        }

        System.out.println("tie present ?"+tie);
       return  (tie)?findTie(winCnt, maxCount):maxOccur;
        //return maxOccur;
    }

    public static String findTie(Map<String , Integer> map, int max){



        List<String> s = new ArrayList<String>();

        for(String key : map.keySet()){
            if(map.get(key) == max){
                s.add(key);
            }
        }

        Collections.sort(s);
        return s.get(0);

    }

    public static void main(String[] args){
        String[] str = new String[]{"aaa","bbb","aaa","bbb","CCC","CCC","CCC","CCC"};
        System.out.println("winner is :" +findWinner(str));
    }
}
