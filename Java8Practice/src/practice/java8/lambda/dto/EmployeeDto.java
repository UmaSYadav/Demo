package practice.java8.lambda.dto;

import java.io.Serializable;

public class EmployeeDto implements Serializable {

	private int iEmpId;
	private String sEmpName;
	private double dSalary;
	public EmployeeDto(int iEmpId, String sEmpName, double dSalary) {
		super();
		this.iEmpId = iEmpId;
		this.sEmpName = sEmpName;
		this.dSalary = dSalary;
	}
	public EmployeeDto() {
		super();
	}
	public int getiEmpId() {
		return iEmpId;
	}
	public void setiEmpId(int iEmpId) {
		this.iEmpId = iEmpId;
	}
	public String getsEmpName() {
		return sEmpName;
	}
	public void setsEmpName(String sEmpName) {
		this.sEmpName = sEmpName;
	}
	public double getdSalary() {
		return dSalary;
	}
	public void setdSalary(double dSalary) {
		this.dSalary = dSalary;
	}
	
}
