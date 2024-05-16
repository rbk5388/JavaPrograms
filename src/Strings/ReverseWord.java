package Strings;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "JavaProgram";
		String reversedStr = "";
		
		//loop the word for each char from the end of the string
		for(int i=str.length()-1; i>=0;i--)
		{
			reversedStr = reversedStr + str.charAt(i) + "";
		}

		System.out.println("The Word is:" +str);
		System.out.println("The Reversed Word is:" +reversedStr);
	}

}
