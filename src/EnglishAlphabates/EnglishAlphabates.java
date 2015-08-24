/**
 * 
 */
package EnglishAlphabates;

/**
 * @author Sumit Knoje
 * @email sumitkanoje@gmail.com
 * @Created 11-Jul-2015 10:16:08 PM
 * @FileName EnglishAlphabates.java
 */
public class EnglishAlphabates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input2[] = {"E#D#E#E","D#I#S#K#E","E#S#E#E#E","E#C#E#E#E","E#E#E#E#E"};
		int result = word_count(5, input2, "DISK");
		System.out.print(result);

	}
	public static int word_count(int input1,String[] input2,String input3)
    {
        //Write code here
		int matched=0;
		String Matrix[][]=new String[input1][input1];
		for(int i=0;i<input1;i++){
			int index=0;
			for(int j=0;j<input1;j++){
				Matrix[i][j]=input2[i].substring(index, index);
			}
		}
		for(int i=0;i<input1;i++){
			String hor="";
			String ver="";
			for(int j=0;j<input1;j++){
				for(int k=0;k<input1;k++)
					hor += input2[k].codePointAt(i);
				ver += input2[j].codePointAt(j);
				hor="DISKED";
				if(hor.matches("DISK")){
					matched++;
				}else if(ver.matches("DISK")){
					matched++;
				}
			}
		}
		return matched;
    }

}
