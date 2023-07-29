package supercallingstatement;

class Demo {
	public Demo(int a)
	{
		System.out.println("hi");
	}
}
class Tester extends Demo{
	public Tester(String str){
		super(10);
		System.out.println("hello"+ str);
	}
}
class Cool extends Tester{
	public Cool(int no, String str){
		super("hi");
		System.out.println("bye");
	}
}

class Mainclass{
	public static void main(String[] args) {
		Cool a=new Cool(10,"hi");
	}
}

