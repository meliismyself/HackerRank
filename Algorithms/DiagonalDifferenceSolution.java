import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DiagonalDifferenceSolution {

    /*
     * Complete the diagonalDifference function below.
     */
    static int diagonalDifference(int[][] a) {
         /*
         * Write your code here.
         */
        
        int n = a.length;
        int sumD1=0, sumD2=0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                
                //Sum of primary diagonal
                if(i==j){
                    sumD1+=a[i][j];
                }
                
                //Sum of secondary diagonal
                if(i+j==n-1){
                    sumD2+=a[i][j];
                }
            }
        }
        
        return Math.abs(sumD1-sumD2);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
		File file = new File("D:/myfile.txt");
		if(!file.exists()){
			file.createNewFile();
		}
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[][] a = new int[n][n];

        for (int aRowItr = 0; aRowItr < n; aRowItr++) {
            String[] aRowItems = scan.nextLine().split(" ");

            for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
                int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
                a[aRowItr][aColumnItr] = aItem;
            }
        }

        int result = diagonalDifference(a);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}
