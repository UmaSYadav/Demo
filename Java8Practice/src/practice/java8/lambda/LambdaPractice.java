package practice.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

import practice.java8.lambda.dto.EmployeeDto;
import practice.java8.lambda.interfaces.AddThreeNumbers;
import practice.java8.lambda.interfaces.AddTwoNumbers;
import practice.java8.lambda.interfaces.DrawInterface;
import practice.java8.lambda.interfaces.SurfaceInterface;

public class LambdaPractice {

	public static void main(String[] args) {
		
		DrawInterface vDraw1= () -> {
			System.out.println("Draw test");
		};
		vDraw1.testDraw();
		
		
		String vSurface= "Square";
		SurfaceInterface vSurfaceInterface= (pSurface) -> {
			System.out.println("Surface is: " + pSurface);
		};
		vSurfaceInterface.surfaceDraw(vSurface);
		
		
		AddTwoNumbers vAddNums= (x,y) -> {
			System.out.println("Addition is: " + (x + y));
		};
		vAddNums.sum(11, 23);
		
		
		AddThreeNumbers vAddThreeNums= (x, y, z) -> {
			return (x + y + z);
		};
		System.out.println("Three Nums sum is: " + vAddThreeNums.sumThreeNumbers(10.4, 11.6, 9.0));
		
		
		ArrayList<String> vArrList= new ArrayList<>();
		vArrList.add("Maths");
		vArrList.add("Chemistry");
		vArrList.add("Physics");
		vArrList.add("Computers");
		vArrList.forEach(
			(n)-> System.out.print(n +"\t")
		);
		System.out.println();
		
		
		
		Runnable vRunnable= ()-> {
			System.out.println("Runnable run called. ");
		};
		Thread vThread1= new Thread(vRunnable);
		vThread1.start();
		
		
		ArrayList<EmployeeDto> vAlEmployeeDto= new ArrayList<>();
		vAlEmployeeDto.add(new EmployeeDto(1, "Uma", 10000));
		vAlEmployeeDto.add(new EmployeeDto(2, "Shankar", 20000));
		vAlEmployeeDto.add(new EmployeeDto(3, "Yadav", 30000));
		vAlEmployeeDto.add(new EmployeeDto(4, "Uma Yadav", 40000));
		vAlEmployeeDto.add(new EmployeeDto(5, "Mau", 35000));
		System.out.println("Before Sorting");
		vAlEmployeeDto.forEach(
			vEmployee-> {System.out.println(vEmployee.getiEmpId()+" :: " + vEmployee.getsEmpName() +" :: "+ vEmployee.getdSalary());}
		);
		System.out.println("After Sorting");
		Collections.sort(vAlEmployeeDto, (pEmp1, pEmp2)-> {
			return pEmp1.getsEmpName().compareTo(pEmp2.getsEmpName());
		} );
		vAlEmployeeDto.forEach(
			vEmployee-> {System.out.println(vEmployee.getiEmpId()+" :: " + vEmployee.getsEmpName() +" :: "+ vEmployee.getdSalary());}
		);
		System.out.println("After Filtering");
		Stream<EmployeeDto> pFilteredData= vAlEmployeeDto.stream().filter(vEmployee-> vEmployee.getdSalary() > 20000);
		pFilteredData.forEach(
			vEmployee-> {System.out.println(vEmployee.getiEmpId()+" :: " + vEmployee.getsEmpName() +" :: "+ vEmployee.getdSalary());}
		);
	}

}
