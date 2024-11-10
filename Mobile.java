package com.nit.swatiExam;
interface Telecom{
	public void activeService();
	
}
class Sim implements Telecom{
	private int simNumber;
	private String simType;
	
	public Sim(int simNumber, String simType) {
		super();
		this.simNumber = simNumber;
		this.simType = simType;
	}
	public int getSimNumber() {
		return simNumber;
	}
	public void setSimNumber(int simNumber) {
		this.simNumber = simNumber;
	}
	public String getSimType() {
		return simType;
	}
	public void setSimType(String simType) {
		this.simType = simType;
	}
	public   void call() {
		System.out.println("call always");
	}
	public void activeService() {
		System.out.println("all sim is good");
	}
}
class Jio implements Telecom{
	private int simNumber;
	private String simType;
	public Jio(int simNumber, String simType) {
		super();
		this.simNumber = simNumber;
		this.simType = simType;
	}
	public int getSimNumber() {
		return simNumber;
	}
	public void setSimNumber(int simNumber) {
		this.simNumber = simNumber;
	}
	public String getSimType() {
		return simType;
	}
	public void setSimType(String simType) {
		this.simType = simType;
	}
	@Override
	public void activeService() {
		System.out.println("service is good");
	}
	@Override
	public String toString() {
		return "Jio [simNumber=" + simNumber + ", simType=" + simType + "]";
	}
	
	
}
class Airtel implements Telecom{
	private int simNumber;
	private String simType;
	public Airtel(int simNumber, String simType) {
		super();
		this.simNumber = simNumber;
		this.simType = simType;
	}
	public int getSimNumber() {
		return simNumber;
	}
	public void setSimNumber(int simNumber) {
		this.simNumber = simNumber;
	}
	public String getSimType() {
		return simType;
	}
	public void setSimType(String simType) {
		this.simType = simType;
	}
	@Override
	public void activeService() {
		System.out.println(" airtel service is good");
	}
}
public class Mobile {

	public static void main(String[] args) {
		Airtel s=new Airtel(24553,"voda");
		System.out.println(s);
		s.activeService();
		
Jio j= new Jio(2564,"jio");
System.out.println(j);
j.activeService();

	}

}
