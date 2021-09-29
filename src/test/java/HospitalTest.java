//import static org.junit.Assert.*;
//
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//import java.util.ArrayList;
//
//import org.junit.Test;
//
//import HospitalManagementSystem.Doctors;
//import HospitalManagementSystem.Hospital;
//import HospitalManagementSystem.Patient;
//import HospitalManagementSystem.Ward;
//
//public class HospitalTest {
//
//	@Test
//	public void showHospitalTest() {
//		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
//		PrintStream originalOut = System.out;
//		PrintStream originalErr = System.err;
//
//		System.setOut(new PrintStream(outContent));
//	    System.setErr(new PrintStream(errContent));
//	    
//		Hospital h1=new Hospital();
//		h1.setAddress("hh");
//		h1.setBedsAvailable(1);
//		h1.setContact(123);
//		h1.setName("HBL");
//		h1.setPricePerBed(12);
//		Ward w1=new Ward();
//		w1.setCapacity(2);
//		w1.setUniqueName(1);
//		ArrayList<Patient> patients=new ArrayList<Patient>();
//		Patient p1=new Patient();
//		p1.setName("Talha");
//		p1.setAddress("F-11");
//		p1.setGender('M');
//		p1.setPhNo("112");
//		Doctors d1=new Doctors();
//		d1.setName("Ibrahim");
//		d1.setAddress("F-9");
//		d1.setPhNo("43");
//		
//		p1.setDoctor(d1);
//		patients.add(p1);
//		w1.setPatient(patients);
//		
//		ArrayList<Ward> ward=new ArrayList<Ward>();
//		ward.add(w1);
//		h1.setWards(ward);
//		h1.showHospitalData();
//		assertEquals("Wards:\r\n"
//				+ "Unique Id :1\r\n"
//				+ "Capacity :2\r\n"
//				+ "Patient Name :Talha\r\n"
//				+ "Doctor Name :Ibrahim\r\n"
//				+ "Patient Gender :M\r\n"
//				+ "Hospital Name :HBL\r\n"
//				+ "Hospital Address :hh\r\n"
//				+ "Hospital Rating :0\r\n"
//				+ "Hospital Contact :123\r\n"
//				+ "Hospital Price per bed :12\r\n"
//				+ "Hospital Beds Available :1\r\n"
//				+ "", outContent.toString());
//		System.setOut(originalOut);
//	    System.setErr(originalErr);
//	}
//
//	@Test
//	public void showPatientTest() {
//		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
//		PrintStream originalOut = System.out;
//		PrintStream originalErr = System.err;
//
//		System.setOut(new PrintStream(outContent));
//	    System.setErr(new PrintStream(errContent));
//	    
//		Hospital h1=new Hospital();
//		h1.setAddress("hh");
//		h1.setBedsAvailable(1);
//		h1.setContact(123);
//		h1.setName("HBL");
//		h1.setPricePerBed(12);
//		Ward w1=new Ward();
//		w1.setCapacity(2);
//		w1.setUniqueName(1);
//		ArrayList<Patient> patients=new ArrayList<Patient>();
//		Patient p1=new Patient();
//		p1.setName("Talha");
//		p1.setAddress("F-11");
//		p1.setGender('M');
//		p1.setPhNo("112");
//		Doctors d1=new Doctors();
//		d1.setName("Ibrahim");
//		d1.setAddress("F-9");
//		d1.setPhNo("43");
//		
//		p1.setDoctor(d1);
//		patients.add(p1);
//		w1.setPatient(patients);
//		
//		ArrayList<Ward> ward=new ArrayList<Ward>();
//		ward.add(w1);
//		h1.setWards(ward);
//		h1.PrintPatientData();
//		assertEquals("Patient Name :Talha\r\n"
//				+ "Doctor Name :Ibrahim\r\n"
//				+ "Patient Gender :M\r\n"
//				+ "", outContent.toString());
//		System.setOut(originalOut);
//	    System.setErr(originalErr);
//	}
//	@Test
//	public void PatientTest() {
//		Ward w1=new Ward();
//		w1.setCapacity(2);
//		w1.setUniqueName(1);
//		ArrayList<Patient> patients=new ArrayList<Patient>();
//		Patient p1=new Patient();
//		p1.setName("Talha");
//		p1.setAddress("F-11");
//		p1.setGender('M');
//		p1.setPhNo("112");
//		Doctors d1=new Doctors();
//		d1.setName("Ibrahim");
//		d1.setAddress("F-9");
//		d1.setPhNo("43");
//		
//		p1.setDoctor(d1);
//		patients.add(p1);
//		w1.setPatient(patients);
//		
////		ArrayList<Ward> ward=new ArrayList<Ward>();
////		ward.add(w1);
//		assertEquals(w1.ShowPatients(),1);
//	} 
//	@Test
//	public void bedsAvailableTest() {
//		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
//		PrintStream originalOut = System.out;
//		PrintStream originalErr = System.err;
//
//		System.setOut(new PrintStream(outContent));
//	    System.setErr(new PrintStream(errContent));
//	    
//		Hospital h1=new Hospital();
//		h1.setAddress("hh");
//		h1.setBedsAvailable(1);
//		h1.setContact(123);
//		h1.setName("HBL");
//		h1.setPricePerBed(12);
//		Ward w1=new Ward();
//		w1.setCapacity(2);
//		w1.setUniqueName(1);
//		ArrayList<Patient> patients=new ArrayList<Patient>();
//		Patient p1=new Patient();
//		p1.setName("Talha");
//		p1.setAddress("F-11");
//		p1.setGender('M');
//		p1.setPhNo("112");
//		Doctors d1=new Doctors();
//		d1.setName("Ibrahim");
//		d1.setAddress("F-9");
//		d1.setPhNo("43");
//		
//		p1.setDoctor(d1);
//		patients.add(p1);
//		w1.setPatient(patients);
//		
//		ArrayList<Ward> ward=new ArrayList<Ward>();
//		ward.add(w1);
//		h1.setWards(ward);
//		h1.BedsAvailable();
//		assertEquals("Beds Available :1\r\n"
//				+ "", outContent.toString());
//		System.setOut(originalOut);
//	    System.setErr(originalErr);
//	}
//	@Test
//	public void PatientAdmitTest() {
//		Hospital h1=new Hospital();
//		h1.setAddress("hh");
//		h1.setBedsAvailable(1);
//		h1.setContact(123);
//		h1.setName("HBL");
//		h1.setPricePerBed(12);
//		Ward w1=new Ward();
//		w1.setCapacity(2);
//		w1.setUniqueName(1);
//		ArrayList<Patient> patients=new ArrayList<Patient>();
//		Patient p1=new Patient();
//		p1.setName("Talha");
//		p1.setAddress("F-11");
//		p1.setGender('M');
//		p1.setPhNo("112");
//		Doctors d1=new Doctors();
//		d1.setName("Ibrahim");
//		d1.setAddress("F-9");
//		d1.setPhNo("43");
//		
//		p1.setDoctor(d1);
//		patients.add(p1);
//		w1.setPatient(patients);
//		
//		ArrayList<Ward> ward=new ArrayList<Ward>();
//		ward.add(w1);
//		h1.setWards(ward);
////		h1.BedsAvailable();
//		h1.AddPatient("Naveed", "123", "G-11", 'M', d1);
//		Patient p2=new Patient("Naveed", "G-11", "123", d1, 'M');
//		assertEquals(h1.getWards().get(0).getPatient().get(1).getName(),p2.getName() );
//	}
//}
