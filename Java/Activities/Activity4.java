package activities;

import java.util.Arrays;

public class Activity4 {

    public static void main(String[] args){

        int[] a = {4, 3, 2,10,12,1,5,6};
        int temp =0;
        for(int i=0;i<=a.length-1;i++){

            for(int j= i+1;j<=a.length-1;j++){

                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array " + Arrays.toString(a));
    }
}
