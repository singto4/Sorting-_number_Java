import java.util.ArrayList;
import java.util.Collections;

public class Num {
	
	public static void main(String []arge) {
		
		String input = "98_7_1_4_5_10_11_2_78_9_101";
		String[] text =  input.split("_");
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for(String x : text) 
		{
			int number = Integer.parseInt(x);
			num.add(number);
		}
		
		Collections.sort(num);
		
		String output = "";
		
		for(int c : num)
		{
			output = output + c +", "; 
		}
		
		int index = output.lastIndexOf(",");
		output = output.substring(0, index);
		
		System.out.print(output);
	}
}
