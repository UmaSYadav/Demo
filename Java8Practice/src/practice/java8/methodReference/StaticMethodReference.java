package practice.java8.methodReference;

import java.util.function.BiFunction;

import practice.java8.methodReference.concrete.AddTwoNumbersInstanceConcrete;
import practice.java8.methodReference.concrete.AddTwoNumbersStaticConcrete;
import practice.java8.methodReference.interfaces.AddThreeInstanceReference;
import practice.java8.methodReference.interfaces.AddThreeStaticReference;
import practice.java8.methodReference.interfaces.AddTwoNumbersInstanceMethodReference;
import practice.java8.methodReference.interfaces.AddTwoNumbersStaticMethodReference;
import practice.java8.methodReference.interfaces.DisplayInstanceReference;
import practice.java8.methodReference.interfaces.DisplayReference;
import practice.java8.methodReference.interfaces.MessageContructorReference;
import practice.java8.methodReference.interfaces.MessageContructorReferenceArgs;

public class StaticMethodReference {

	public static void sampleStaticMethod() {
		System.out.println("Sample static method.");
	}
	
	public void sampleinstanceMethod() {
		System.out.println("Sample instance method.");
	}
	
	public static void addTwoNumbersStatic(double a, double b) {
		System.out.println("Sum is: " + (a + b));
	}
	
	public void addTwoNumbersInstance(double a, double b) {
		System.out.println("Sum is: " + (a + b));
	}
	
	public static double addThreeNumbersStatic(double a, double b, double c) {
		return (a + b + c);
	}
	
	public double addThreeNumbersInstance(double a, double b, double c) {
		return (a + b + c);
	}
	
	StaticMethodReference() {
		System.out.println("default contructor.");
	}
	
	StaticMethodReference(String pName) {
		System.out.println("args contructor : "+ pName);
	}
	
	public static void main(String[] args) {
		
		System.out.println("::::::::::::::: Static method reference");
		DisplayReference vDispRef= StaticMethodReference::sampleStaticMethod;
		vDispRef.drawMethod();
		
		AddTwoNumbersStaticMethodReference vStaticRef= StaticMethodReference::addTwoNumbersStatic;
		vStaticRef.add(10.0, 12.0);
		
		AddThreeStaticReference vStaticRefAdd= StaticMethodReference::addThreeNumbersStatic;
		System.out.println("Returned: "+vStaticRefAdd.add(11.4, 10.6, 8.0));
		
		
		System.out.println("::::::::::::::: Instance method reference");
		StaticMethodReference vStaticMethodReference= new StaticMethodReference();
		DisplayInstanceReference vInstanceRef= vStaticMethodReference::sampleinstanceMethod;
		vInstanceRef.displayInstanceMethod();
		
		AddTwoNumbersInstanceMethodReference vInstanceRefer= vStaticMethodReference::addTwoNumbersInstance;
		vInstanceRefer.add(11.0, 13.0);
		
		AddThreeInstanceReference vInstanceRefAdd= vStaticMethodReference::addThreeNumbersInstance;
		System.out.println("Returned: "+vInstanceRefAdd.add(3.4, 6.6, 2.2));
		
		System.out.println("For Concrete class");
		BiFunction<Integer, Double, Double> vFunc= AddTwoNumbersStaticConcrete::addTwoNums;
		System.out.println("Static concrete class : "+vFunc.apply(11, 9.5));
		
		AddTwoNumbersInstanceConcrete vInstanceConcrete= new AddTwoNumbersInstanceConcrete();
		BiFunction<Double, Double, Double> vFuncIns= vInstanceConcrete::addTwoNums;
		System.out.println("Static concrete class : "+vFuncIns.apply(10.5, 19.5));
		
		
		System.out.println("Contructor references");
		MessageContructorReference vConsRef1= StaticMethodReference::new;
		vConsRef1.constructRef();
		
		MessageContructorReferenceArgs vConsRef2= StaticMethodReference::new;
		vConsRef2.constructRef("Uma");
	}
}
