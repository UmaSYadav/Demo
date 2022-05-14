package practice.java8.functional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestFunctionalClass {

	public static void show(String pName, int pCount) {
		System.out.println("Name: "+pName+", Count: "+pCount);
	}
	
	public void showDisp(Map<String, Integer> pMap, String pVal) {
		System.out.println("Val is: "+pVal);
		pMap.forEach(
			(pKey, pValue)-> {System.out.println("::: Key- "+pKey+", Value: "+pValue);}
		);
	}
	
	public String disp(String pName) {
		return "Name: "+pName;
	}
	
	public Integer additionList(List<Integer> pList) {
		return pList.stream().mapToInt(Integer::intValue).sum();
	}
	
	public boolean checkUserAge(int pAge) {
		return pAge >= 18 ? true : false;
	}
	
	public static void main(String[] args) {
		System.out.println("BiConsumer Testing");
		BiConsumer<String, Integer> biConsumer= TestFunctionalClass::show;
		biConsumer.accept("Uma", 10);
		biConsumer.accept("Shankar", 20);
		biConsumer.accept("Yadav", 30);
		biConsumer.accept("mau", 40);
		BiConsumer<String, Integer> biConsumer2= (pName, pCount) -> {System.out.println("Lambda-> "+pName+" :: "+pCount);};
		biConsumer2.accept("Again Uma", 4);
		System.out.println("#####################");
		
		System.out.println("BiConsumer Map Testing");
		TestFunctionalClass vTestFunctionalClass= new TestFunctionalClass();
		String vVal= "testVal";
		Map<String, Integer> vMap= new HashMap<>();
		vMap.put("Uma", 10);
		vMap.put("Shankar", 20);
		vMap.put("Yadav", 30);
		vMap.put("mau", 40);
		BiConsumer<Map<String, Integer>, String> biConsumer3= vTestFunctionalClass::showDisp;
		biConsumer3.accept(vMap, vVal);
		System.out.println("#####################");
		
		System.out.println("Test Functional 1");
		Function<String, String> vFunc= vTestFunctionalClass::disp;
		System.out.println(vFunc.apply("Uma"));;
		
		List<Integer> vList= new ArrayList<>();
		vList.add(10);
		vList.add(20);
		vList.add(30);
		vList.add(40);
		Function<List<Integer>, Integer> vFunc2= vTestFunctionalClass::additionList;
		int vSum= vFunc2.apply(vList);
		System.out.println("Function2 is: "+vSum);
		System.out.println("#####################");
		
		System.out.println("Test Predicate");
		Predicate<Integer> vPredicate= vTestFunctionalClass::checkUserAge;
		System.out.println(vPredicate.test(22));
		System.out.println(vPredicate.test(12));
		System.out.println("###################");
	}

}
