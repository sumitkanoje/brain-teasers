package SkippingSum;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Sumit Knoje
 * @email sumitkanoje@gmail.com
 * @Created 15-Mar-2015 3:31:34 PM
 * @FileName SkippingSum.java
 */
public class SkippingSum {

	/**
	 * @param args
	 */
	int N=0;
	static int[] A;
	public static void main(String args[] ) throws Exception {
		//BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] numberStrs = line.split("\\s");
        int[] numbers = new int[numberStrs.length];
        for(int i = 0;i < numberStrs.length;i++)
        {
           numbers[i] = Integer.parseInt(numberStrs[i]);
        }
        line = br.readLine();
        numberStrs = line.split("\\s");
        A = new int[numberStrs.length];
        for(int i = 0;i < numberStrs.length;i++)
        {
           A[i] = Integer.parseInt(numberStrs[i]);
        }
        for(int i=0;i<numbers[1];i++){
        	line = br.readLine();
            numberStrs = line.split("\\s");
            int[] LRK = new int[numberStrs.length];
            for(int j = 0;j < numberStrs.length;j++)
            {
               LRK[j] = Integer.parseInt(numberStrs[j]);
            }
            skippingssum(LRK[0],LRK[1],LRK[2]);
        }
        
        
    }
	public static void skippingssum(int L,int R,int K){
    	int sum = 0;
    	while(L<=R){
    		sum = sum + A[L-1];
    		L += K;
    	}
		//return sum;
		System.out.println(sum);
    }
}
