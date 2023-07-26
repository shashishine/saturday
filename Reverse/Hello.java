package Reverse;

public class Hello {
public static void main(String[] args) {
	String str ="Rama go to scholl Rama eat food Rama do homework";
	String s = "Rama";
	String[] s1 = str.split(" ");
	int count = 0;
	for(int i=0; i<s1.length;i++)
	{
//		System.out.println(s1[i]);
		if(s1[i].equals(s))
		{
			count++;
		}
	}
	System.out.println(count);
	
}
}
