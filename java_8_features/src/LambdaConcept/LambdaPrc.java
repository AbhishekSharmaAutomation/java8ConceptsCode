package LambdaConcept;

public class LambdaPrc {
	public static void main(String[] args) {
		
		//WebPage p1= (String val1) -> {System.out.println("Inside title mentod body the value is:" + val1); };
		
		//WebPage p2= (val2) -> {System.out.println("Inside title mentod body the value is:" + val2); };
		
		//WebPage p3= (n) -> System.out.println("Inside title mentod body the value is:" + n.toUpperCase());
		 
		WebPage p4 = (n, m) -> { System.out.println("Name is:" + n + " and age is: "+ m); };
		
		
//		WebPage p2= new WebPage() {
//			
//			@Override
//			public void title(String val2) {
//				System.out.println("Inside title mentod body the value is:" + val2);
//				
//			}
//		};
		
//		p1.title("Abhishek");
//		p2.title("Sharma");
//		p3.title("testing lambda");
		p4.title("Abhishek", 6);
		
		
	}

}
