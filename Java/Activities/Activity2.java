package activities;

public class Activity2 {
    public static void main(String[] args){
        int[] a = {10, 77, 10, 54, -11, 10};
        int sum = 0;
        for(int i=0;i<=a.length-1;i++) {

            if (a[i] == 10) {
                sum = sum + a[i];
            }
        }
        if(sum == 30){
            System.out.println("The sum of all 10's is " + sum);
        }
        else{
            System.out.println("The sum of all 10's is not 30");
        }

    }
}
