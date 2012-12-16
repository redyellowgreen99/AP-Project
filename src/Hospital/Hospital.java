package Hospital;

import java.util.ArrayList;
import java.util.Iterator;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();

	public void addDoctor(Doctor doctorNeglia) {
		doctors.add(doctorNeglia);
	}
	
	public void add(Object object) {
		if(object instanceof Doctor)
		{
			//Add doctors to doctorList and patients to patientList
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
}
