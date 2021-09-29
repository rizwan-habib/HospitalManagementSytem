package HospitalManagementSystem;

import java.util.ArrayList;

public class Ward {
	protected int uniqueName,capacity;
//	protected Hospital hospital;
	protected ArrayList<Patient> patient=new ArrayList<Patient>();
	public Ward() {
		// TODO Auto-generated constructor stub
	}
	public Ward(int uniqueName,int capacity,ArrayList<Patient> p) {
		super();
		this.uniqueName = uniqueName;
		this.capacity=capacity;
//		this.hospital=hospital;
		this.patient=p;
	}
	public int getUniqueName() {
		return uniqueName;
	}
	
	public ArrayList<Patient> getPatient() {
		return patient;
	}
	public void setPatient(ArrayList<Patient> patient) {
		this.patient = patient;
	}
	public void setUniqueName(int uniqueName) {
		this.uniqueName = uniqueName;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int ShowPatients() {
		return patient.size();
	}
}
