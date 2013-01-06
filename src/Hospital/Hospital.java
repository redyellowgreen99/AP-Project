package Hospital;

import java.beans.FeatureDescriptor;
import java.util.ArrayList;
import java.util.Iterator;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	ArrayList<Zombie> zombies = new ArrayList<Zombie>();

	public void addDoctor(Doctor doctorNeglia) {
		doctors.add(doctorNeglia);
	}

	public void addZombie(Zombie zombie, String date) {

	}

	public void add(Object object) {
		if (object instanceof Doctor) {
			// Add doctors to doctorList and patients to patientList
			Doctor doctor = (Doctor) object;
			;
			doctors.add(doctor);
		}
		if (object instanceof Patient) {
			// Add doctors to doctorList and patients to patientList
			Patient patient = (Patient) object;
			;
			patients.add(patient);
		}
	}

	public void addPatient(Patient alexBaratti) {
		patients.add(alexBaratti);
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void assignPatientsToDoctors() {

		for (Patient patient : patients) {
			for (Doctor doctor : doctors) {
				try {
					doctor.assignPatient(patient);
					break;
				} catch (DoctorFullException e) {
					// TODO: handle exception
				}
			}
		}
	}

	public ArrayList<Zombie> getZombies() {
		return zombies;
	}

	public void makeDoctorsWork() {
		for (Doctor d : doctors) {
			d.doMedicine();
		}
	}
}
