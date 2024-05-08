package com.who.shuk.leetcodeDaily;

public class RelativeRanks {
    //https://leetcode.com/problems/relative-ranks/description/
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        int maxVal=findMax(score);
        int[] map = new int[maxVal+1]; //making count array
        for(int i=0;i<n;i++){
            map[score[i]]=i+1;//storing index+1
        }
        String[] res = new String[n];
        int rank=1;
        for(int i=maxVal;i>=0;i--){
            if(map[i]!=0){
                int originalIndex = map[i]-1;
                if(rank==1){
                    res[originalIndex]="Gold Medal";
                }else if(rank==2){
                    res[originalIndex]="Silver Medal";
                }else if(rank==3){
                    res[originalIndex]="Bronze Medal";
                }else{
                    res[originalIndex]=Integer.toString(rank);
                }
                rank++;
                if(rank>n)break;
            }
        }
        return res;
    }
    public int findMax(int[] score){
        int maxi = Integer.MIN_VALUE;
        for(int element:score){
            maxi=Math.max(maxi,element);
        }
        return maxi;
    }
}
