package LambdaConcept;

// SAM--- > Single abstract method
// Functional interface can have one abstract method as Lambda can be applied on Single functional interface/(SAM)
@FunctionalInterface
public interface WebPage {
	
	//void title(String val1);
	
	void title(String val2, int age);

}
