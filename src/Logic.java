import java.util.ArrayList;
public class Logic {

	public static ArrayList Suffix(int a) {
		ArrayList<String> myArray = new ArrayList<>();
		String suffixST = "st";
		String suffixND = "nd";
		String suffixRD = "rd";
		String suffixTH = "th";
		//System.out.println("Last character is " + test.substring(test.length()-1));
		
		for (int i = 1; i <= 100; i++) {
			String number = new Integer(i).toString();
			String newString = number.substring(number.length()-1);		
			
			
			if (number.equals("11")) {
				number = number + suffixTH;
			}
			else if (number.equals("12")) {
				number = number + suffixTH;
			}
			else if (number.equals("13")) {
				number = number + suffixTH;
			}
			else if (newString.equals("1")) {
				number = number + suffixST;
			}
			else if (newString.equals("2")) {
				number = number + suffixND;
			}
			else if (newString.equals("3")) {
				number = number + suffixRD;
			}
			else {
				number = number + suffixTH;
			}
			
			myArray.add(number);
			if (i == a) {
				myArray.remove(i-1);
			}
			
		}
		return myArray;
	}
	
}
