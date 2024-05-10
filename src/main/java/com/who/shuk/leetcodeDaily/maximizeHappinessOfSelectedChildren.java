package com.who.shuk.leetcodeDaily;

import java.util.Arrays;

public class maximizeHappinessOfSelectedChildren {
    public long maximumHappinessSum(int[] happiness, int k) {
        int turns=0;
        long sum=0;
        int n=happiness.length;
        Arrays.sort(happiness);
        for(int i=n-1;i>=0;i--){
            sum= sum+Math.max((happiness[i]-turns),0);
            turns++;
            if(turns>=k)break;
        }
        return sum;

    }
}
