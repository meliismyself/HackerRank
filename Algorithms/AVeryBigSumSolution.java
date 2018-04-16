import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class AVeryBigSumSolution {

    /*
     * Complete the aVeryBigSum function below.
     */
    static long aVeryBigSum(int n, long[] ar) {
        /*
         * Write your code here.
         */
        
        long sum=0;
        for (int i=0; i<n; i++){
            sum+=ar[i];
        }
        
        return sum;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
		File file = new File("D:/myfile.txt");
		if (!file.exists()){
			file.createNewFile();
		}
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        int n = Integer.parseInt(scan.nextLine().trim());

        long[] ar = new long[n];

        String[] arItems = scan.nextLine().split(" ");

        for (int arItr = 0; arItr < n; arItr++) {
            long arItem = Long.parseLong(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        long result = aVeryBigSum(n, ar);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}
