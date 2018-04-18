import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class PlusMinusSolution {

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        /*
         * Write your code here.
         */
        
        int nOfArray = arr.length;
        int positiveNum=0, negativeNum=0, zeroNum=0;
        double sumPositiveNum, sumNegativeNum, sumZeroNum;
        int result=0;
        for(int i=0; i<nOfArray; i++){
            if(arr[i]>0){
                positiveNum++;
            }
            
            if(arr[i]<0){
                negativeNum++;
            }
            
            if(arr[i]==0){
                zeroNum++;
            }
        }
        
        sumPositiveNum = (double)positiveNum/(double)nOfArray;
        sumNegativeNum = (double)negativeNum/(double)nOfArray;
        sumZeroNum = (double)zeroNum/(double)nOfArray;
        
        System.out.println(sumPositiveNum);
        System.out.println(sumNegativeNum);
        System.out.println(sumZeroNum);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}
