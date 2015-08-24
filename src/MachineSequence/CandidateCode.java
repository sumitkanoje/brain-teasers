/**
 * 
 */
package MachineSequence;

/**
 * @author Sumit Knoje
 * @email sumitkanoje@gmail.com
 * @Created 30-Jun-2015 4:27:48 PM
 * @FileName CandidateCode.java
 */
public class CandidateCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sequences("1,5,9,2,3,5,6"));

	}
	public static String sequences(String input1)
    {
		String [] items = input1.split(",");
		
		 int[] ints = new int[items.length];
		    for (int i=0; i < items.length; i++) {
		        ints[i] = Integer.parseInt(items[i]);
		    }
		    //System.out.println(ints.length);
		    
		 while(ints.length!=1){
			 int[] temp = new int[ints.length-1];
			 for(int i=0;i<ints.length;i++){
				 if(i==ints.length-1)
					 continue;
					 temp[i] = ints[i+1]-ints[i];
				 System.out.print(temp[i]+",");

			 }
			 System.out.println(" :"+temp.length);
			 ints = temp.clone();
		 }
		   
		return ints[0]+"";
        //Write code here
    }
	

}
