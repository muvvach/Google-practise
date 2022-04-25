package google;

public class constructor {
	int n1;
	int n2;
	public constructor() {
		System.out.println("what the fuck");
		 n1=5;
		 n2=4;
	}
	 public constructor(double n) {
		 n1=(int) n;
			 
		 }
		
		public static void main(String[] args) {
		
		constructor c =new constructor(7.5);

		System.out.println(c.n1);
	
	
	
	}
}
