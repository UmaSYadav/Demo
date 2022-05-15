package practice.java8.interfaces.impl;

import practice.java8.interfaces.InterfaceEnhancement1;
import practice.java8.interfaces.InterfaceEnhancement2;
import practice.java8.interfaces.InterfaceEnhancement3;
import practice.java8.interfaces.InterfaceEnhancement4;

public class InterfaceEnhancImpl implements InterfaceEnhancement1, InterfaceEnhancement2, InterfaceEnhancement3, InterfaceEnhancement4 {

	@Override
	public void test() {
		
	}
	
	@Override
	public void test(String pVal) {
		InterfaceEnhancement1.super.test(pVal);
	}

	public static void main(String[] args) {
		
		InterfaceEnhancImpl vInterfaceEnhancImpl= new InterfaceEnhancImpl();
		
		vInterfaceEnhancImpl.test("test1");
		
		InterfaceEnhancement3.testStat("val3");
		InterfaceEnhancement4.testStat("val4");
	}

	

}
