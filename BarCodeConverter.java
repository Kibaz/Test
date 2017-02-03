import java.util.Scanner;

public class BarCodeConverter{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	String zipCode = "";
	String digits = "^[0-9]";
	do{
	 System.out.println("Please enter your zip code. MUST CONTAIN ONLY DIGITS!");
	 zipCode = in.nextLine();
	}while(!zipCode.matches(digits));
	System.out.println(zipCode);
	}
	public static void checkDigit(String d){
		int checkDigitValue = 0;
		String a = "";
		for(int i = 0; i < d.length()-1; i++){
			if(Character.isDigit(d.charAt(i))){
				a = a + d.charAt(i);
			}else{
				if(!a.equals("")){
			checkDigitValue = checkDigitValue + Integer.parseInt(d);
			a = "";
		}
	}

		}
	}






}
