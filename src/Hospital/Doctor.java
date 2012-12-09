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

	public void assignPatient(Patient alexBaratti) throws DoctorFullException {
		// TODO test if already full
		if (patientList.size() < 3) {
			patientList.add(alexBaratti);
		} else {
			throw new DoctorFullException();
		}
	}

	public ArrayList<Patient> getPatients() {
		return patientList;
	}

	public void doMedicine() {
		for (Patient patient : patientList) {
			patient.checkPulse();
		}
	}
}
