package practice.java8.CollecorsPr.dto;

public class CollectorsDto {

	private String sName;
	private int iId;
	private double dSalary;
	
	public CollectorsDto() {
		super();
	}
	public CollectorsDto(int iId, String sName, double dSalary) {
		super();
		this.sName = sName;
		this.iId = iId;
		this.dSalary = dSalary;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getiId() {
		return iId;
	}
	public void setiId(int iId) {
		this.iId = iId;
	}
	public double getdSalary() {
		return dSalary;
	}
	public void setdSalary(double dSalary) {
		this.dSalary = dSalary;
	}
	
	@Override
	public String toString() {
		return "CollectorsDto [sName=" + sName + ", iId=" + iId + ", dSalary=" + dSalary + "]";
	}
	
	
}
