import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class StairCaseSolution{

    /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
        /*
         * Write your code here.
         */
		 
		 int spaceCounter=n-1;
		 int hashtagCounter = 1;
		 
        for(int i=0; i<n; i++){
			for(int j=0; j<spaceCounter; j++){
				System.out.print(" ");
			}
			
			for(int k=0; k<hashtagCounter;k++){
				System.out.print("#");
			}
			System.out.println();
			spaceCounter--;
			hashtagCounter++;
		}

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}
