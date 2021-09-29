package HospitalManagementSystem;


public class Patient {
	private String name,address,phNo;
	private Doctors doctor;
	
	private char gender;
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	public Patient(String name, String address, String phNo, Doctors doc,char gender) {
		super();
		this.name = name;
		this.address = address;
		this.phNo = phNo;
		this.doctor=doc;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Doctors getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctors doctor) {
		this.doctor = doctor;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	
}
