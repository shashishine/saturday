package Reverse;

public class Reverse {
	public static void main(String[] args) {
		String str="hello java how are you";
		String [] s1= str.split(" ");
		for(int i=0; i<s1.length; i++){
			String str1=s1[i];
			String reverse=" ";
			for(int j=str1.length()-1; j>=0; j--){
				reverse= reverse+str1.charAt(j);
			}
			System.out.print(reverse+" ");
		}
	}
}
