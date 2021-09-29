package HospitalManagementSystem;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital h1=new Hospital();
		h1.setAddress("hh");
		h1.setBedsAvailable(1);
		h1.setContact(123);
		h1.setName("HBL");
		h1.setPricePerBed(12);
		Ward w1=new Ward();
		w1.setCapacity(2);
		w1.setUniqueName(1);
		ArrayList<Patient> patients=new ArrayList<Patient>();
		Patient p1=new Patient();
		p1.setName("Talha");
		p1.setAddress("F-11");
		p1.setGender('M');
		p1.setPhNo("112");
		Doctors d1=new Doctors();
		d1.setName("Ibrahim");
		d1.setAddress("F-9");
		d1.setPhNo("43");
		
		p1.setDoctor(d1);
		patients.add(p1);
		w1.setPatient(patients); 
		
		ArrayList<Ward> ward=new ArrayList<Ward>();
		ward.add(w1);
		h1.setWards(ward);
		h1.fileAndExceptionHandling();
	}

}
