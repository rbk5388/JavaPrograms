package Strings;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I am a SDET Professional";
		String[] strArray = str.split(" ");
		String reversedSentence = "";
		
		for(int i=strArray.length-1; i>=0;i--)
		{
			reversedSentence = reversedSentence + strArray[i] + " ";
		}
		
		System.out.println("The Reversed Sentence is:" +reversedSentence);

	}

}
