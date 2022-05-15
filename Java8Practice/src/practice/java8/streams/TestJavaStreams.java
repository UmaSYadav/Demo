package practice.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestJavaStreams {

	public static void main(String[] args) {
		
		List<Integer> vList= new ArrayList<>();
		vList.add(20);
		vList.add(30);
		vList.add(10);
		vList.add(40);
		
		Optional<Integer> vOpAll= vList.stream().filter(pInt -> checkNumber(pInt)).findFirst();
		System.out.println("First: "+vOpAll.get());
		
		Optional<Integer> vOpAny= vList.stream().filter(pInt -> checkNumber(pInt)).findAny();
		System.out.println("Any: "+vOpAny.get());
		
		vList.stream().filter(i -> i > 12).forEach(System.out::println);
		vList.parallelStream().filter(i -> i > 12).forEach(System.out::println);
		
		System.out.println(vList.stream().isParallel());
		System.out.println(vList.parallelStream().isParallel());
		
		System.out.println("Count1: "+vList.stream().filter(i -> i > 12).count());
		System.out.println("Count2: "+vList.parallelStream().filter(i -> i > 12).count());
		
		List<String> vNameList= new ArrayList<>();
		vNameList.add("Uma Yadav");
		vNameList.add("Shankar Yadav");
		vNameList.add("Uma Shankar");
		vNameList.add("Sapna Singh");
		vNameList.add("Shankar Yadav");
		
		System.out.println("All match: "+ vNameList.stream().allMatch(pN -> pN.contains("Um")));
		System.out.println("Any match: "+ vNameList.stream().anyMatch(pN -> pN.contains("Um")));
		
		List<String> vTestStr= vNameList.stream().filter(n -> n.contains("Um")).collect(Collectors.toList());
		vTestStr.forEach(System.out::println);
		
		System.out.println("----");
		Stream<String> vTestSr= vNameList.stream().filter(n-> n.contains("Yad")).distinct();
		vTestSr.forEach(System.out::println);
		System.out.println("-@---");
		vNameList.stream().peek(System.out::println);
		
		Optional<String> vReduceOptional= vNameList.stream().reduce((n1, n2)-> n1.length() < n2.length() ? n1 : n2);
		System.out.println(vReduceOptional.get());
		
	}
	
	private static boolean checkNumber(Integer pInt) {
		return pInt >= 0 && pInt <= 40 ? true : false;
	}
}
