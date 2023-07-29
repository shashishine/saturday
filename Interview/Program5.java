package Interview;

// star pattern program rectangle//
// output like
	//*****
	//*****
	//*****
	//*****
	//*****

public class Program5 {
	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}
		
		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print(i+1 +" ");
//			}
//			System.out.println();
//		}
//	}
//}
		
//		op
//		1 1 1 1 1 
//		2 2 2 2 2 
//		3 3 3 3 3 
//		4 4 4 4 4 
//		5 5 5 5 5 
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i == 0 || i == 4 || j == 0 || j == 4){
				System.out.print("*");
				}else{
				System.out.print(" ");
			}
		}
	}
}
}
