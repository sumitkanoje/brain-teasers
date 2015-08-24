/**
 * 
 */
package ThRiseOfTheWeirdThings;

import java.awt.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Sumit Knoje
 * @email sumitkanoje@gmail.com
 * @Created 01-Jul-2015 10:41:28 PM
 * @FileName WeiredThings.java
 */
public class WeiredThings {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        line = br.readLine();
        String[] numberStrs = line.split("\\s");
        int[] numbers = new int[numberStrs.length];
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        int oddSum = 0;
        int evenSum = 0;
        for(int i = 0;i < numberStrs.length;i++)
        {
           numbers[i] = Integer.parseInt(numberStrs[i]);
           if(numbers[i]%2==0){
        	   even.add(numbers[i]);
        	   evenSum += numbers[i];
           }else{
        	   odd.add(numbers[i]);
        	   oddSum += numbers[i];
           }
        }
        int count = 0; 
        Collections.sort(even);
        while (even.size() > count) {
        	System.out.print(even.get(count)+" ");
        	count++;
        }
        System.out.print(evenSum);
        count = 0;
        Collections.sort(odd);
        while (odd.size() > count) {
        	System.out.print(" "+odd.get(count));
        	count++;
        }
        System.out.print(" "+evenSum);


	}

}
