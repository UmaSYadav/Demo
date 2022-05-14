package practice.java8.optional;

import java.util.Optional;

public class TestOptionals {

	public static void main(String[] args) {
		
		String[] vArrString= new String[10];
		Optional<String> vCheckExistance1= Optional.ofNullable(vArrString[5]);
		System.out.println(vCheckExistance1.isPresent() ? "1. Value Present." : "1. Value Missing.");
		vArrString[5]= "Testing";
		Optional<String> vCheckExistance2= Optional.ofNullable(vArrString[5]);
		System.out.println(vCheckExistance2.isPresent() ? "2. Value Present." : "2. Value Missing.");
		vCheckExistance2.ifPresent(System.out::println);
		System.out.println("4: "+vCheckExistance2.get());
		Optional<String> vCheckExistance3= Optional.of(vArrString[5]);
		System.out.println("5: "+vCheckExistance3.filter((s)-> s.equals("tr")));
		System.out.println("6: "+vCheckExistance3.filter((s)-> s.equals("Testing")));
		System.out.println("7: Value is- "+vCheckExistance3.hashCode());
		System.out.println("8: Value present- "+vCheckExistance3.isPresent());
		System.out.println("9. Or else- "+vCheckExistance3.orElse("show"));
		System.out.println("10: empty- "+vCheckExistance3.isEmpty());
	}

}
