package HospitalManagementSystem;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Hospital {
	private String name,address;
	int rating,contact,PricePerBed,BedsAvailable;
	ArrayList<Ward> wards=new ArrayList<Ward>();
	public String getName() {
		return name;
	}
	public Hospital() { 
		// TODO Auto-generated constructor stub
	}
	
	
	public ArrayList<Ward> getWards() {
		return wards;
	}
	public void setWards(ArrayList<Ward> wards) {
		this.wards = wards;
	}
	public Hospital(String name, String address, String phNo, int rating, int contact, int pricePerBed,
			int bedsAvailable) {
		super();
		this.name = name;
		this.address = address;
//		this.phNo = phNo;
		this.rating = rating;
		this.contact = contact;
		this.PricePerBed = pricePerBed;
		this.BedsAvailable = bedsAvailable;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public int getPricePerBed() {
		return PricePerBed;
	}
	public void setPricePerBed(int pricePerBed) {
		PricePerBed = pricePerBed;
	}
	public int getBedsAvailable() {
		return BedsAvailable;
	}
	public void setBedsAvailable(int bedsAvailable) {
		BedsAvailable = bedsAvailable;
	}
	public void showHospitalData() {
		System.out.println("Wards:");
		for (int i = 0; i < wards.size(); i++) {
			System.out.println("Unique Id :"+wards.get(i).getUniqueName());
			System.out.println("Capacity :"+wards.get(i).getCapacity());
			for (int j = 0; j < wards.get(i).getPatient().size(); j++) {
				System.out.println("Patient Name :"+wards.get(i).getPatient().get(j).getName());
				System.out.println("Doctor Name :"+wards.get(i).getPatient().get(j).getDoctor().getName());
				System.out.println("Patient Gender :"+wards.get(i).getPatient().get(j).getGender());
//				System.out.println();
			}
//			System.out.println("Patient Name :"+wards.get(i).getPatient();
		}
		System.out.println("Hospital Name :"+name);
		System.out.println("Hospital Address :"+address);
		System.out.println("Hospital Rating :"+rating);
		System.out.println("Hospital Contact :"+contact);
		System.out.println("Hospital Price per bed :"+PricePerBed);
		System.out.println("Hospital Beds Available :"+BedsAvailable);
		
//		
	}
	public void PrintPatientData() {
		for (int i = 0; i < wards.size(); i++) {
			for (int j = 0; j < wards.get(i).getPatient().size(); j++) {
				System.out.println("Patient Name :"+wards.get(i).getPatient().get(j).getName());
				System.out.println("Doctor Name :"+wards.get(i).getPatient().get(j).getDoctor().getName());
				System.out.println("Patient Gender :"+wards.get(i).getPatient().get(j).getGender());
			}
		}
		
	}
	public void BedsAvailable() {
		for (int i = 0; i < wards.size(); i++) {
			for (int j = 0; j < wards.get(i).getPatient().size(); j++) {
				System.out.println("Beds Available :"+(wards.get(i).getCapacity()-wards.get(i).getPatient().size()));
				
			}
		}
		
	}
	public void AddPatient(String name,String num,String address,char gender,Doctors doc) {
		Patient p=new Patient(name, address, num, doc, gender);
		wards.get(0).getPatient().add(p);
		
	}
	public void fileAndExceptionHandling() {
		try {
			ByteArrayOutputStream outContent = new ByteArrayOutputStream();
			ByteArrayOutputStream errContent = new ByteArrayOutputStream();
			PrintStream originalOut = System.out;
			PrintStream originalErr = System.err;

			System.setOut(new PrintStream(outContent));
		    System.setErr(new PrintStream(errContent));

			FileOutputStream obj=new FileOutputStream("file.txt");
			showHospitalData();
			
			byte[] array=outContent.toString().getBytes();
			obj.write(array);
			obj.close();
			System.setOut(originalOut);
		    System.setErr(originalErr);
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}
}
