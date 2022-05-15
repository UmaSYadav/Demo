package practice.java8.StringJoin;

import java.util.StringJoiner;

public class StringJoinerPrac {

	public static void main(String[] args) {

		StringJoiner vStrJoin1= new StringJoiner(",");
		StringJoiner vStrJoin2= new StringJoiner("_", "Comps", "Engg");
		
		
		vStrJoin1.add("Uma");
		vStrJoin1.add("Shankar");
		vStrJoin1.add("Yadav");
		vStrJoin1.add("Mau");
		System.out.println(vStrJoin1);
		
		vStrJoin2.add("Uma");
		vStrJoin2.add("Shankar");
		vStrJoin2.add("Yadav");
		vStrJoin2.add("Mau");
		System.out.println(vStrJoin2);
		
		StringJoiner vStrJoin3= vStrJoin1.merge(vStrJoin2);
		System.out.println(vStrJoin3);
		System.out.println(vStrJoin3.length());
		
		StringJoiner vStrJoin4= new StringJoiner(",");
		System.out.println(vStrJoin4.setEmptyValue("j"));
	}

}
