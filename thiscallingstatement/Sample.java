package thiscallingstatement;

class Sample {
	Sample(double b)
	{

		System.out.println("Hi");
	}
	Sample(int a)
	{
		this(10.0);
		System.out.println("Hi");
	}
	Sample(String str)
	{
		System.out.println("hello");
	}
	Sample(int a,String b)
	{
		this ("java");
		System.out.println("bye");
	}
}
class Mainclass{
	public static void main(String[] args) {
		new Sample(10,"java");
	}
}
