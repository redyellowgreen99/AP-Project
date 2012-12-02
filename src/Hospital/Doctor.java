package Hospital;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> patientList = new ArrayList<Patient>();
	
	public boolean performsSurgery() {
		return false;
	}
	
	public boolean makesHouseCalls() {
		return false;
	}
	
	public void assignPatient(Patient alexBaratti) {
		patientList.add(alexBaratti);
	}
	
	public ArrayList<Patient> getPatients() {
		return patientList;
	}
}
