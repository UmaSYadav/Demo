package practice.java8.functional.interfaces;

@FunctionalInterface
public interface TestFunctionalInterface {

	public void abstractMethod();
	
	//can have any number of Object class methods
	int hashCode();
	String toString();
	boolean equals(Object pObj);
}
