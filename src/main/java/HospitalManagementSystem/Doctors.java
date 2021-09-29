package HospitalManagementSystem;


public class Doctors {
	private String name,phNo,address;
	public Doctors() {
		// TODO Auto-generated constructor stub
	}
	
	public Doctors(String name, String phNo, String address) {
		super();
		this.name = name;
		this.phNo = phNo;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	
}
