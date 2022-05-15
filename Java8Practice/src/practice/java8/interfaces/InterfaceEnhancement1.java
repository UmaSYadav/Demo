package practice.java8.interfaces;

public interface InterfaceEnhancement1 {

	void test();
	default void test(String pVal) {
		System.out.println("1 value is: "+pVal);
	}
}
