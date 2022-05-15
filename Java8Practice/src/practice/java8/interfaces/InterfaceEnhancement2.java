package practice.java8.interfaces;

public interface InterfaceEnhancement2 {

	void test();
	default void test(String pVal) {
		System.out.println("2 value is: "+pVal);
	}
}
