package Hospital;

import java.util.ArrayList;

public class Doctor {
	boolean evil = false;

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
		if (evil) {
			for (int i = 0; i < patientList.size(); i++) {
				patientList.get(i).kill();
			}
		} else {
			for (Patient patient : patientList) {
				patient.checkPulse();
			}
		}
	}

	public void giveFluShot() {
		for (Patient patient : patientList) {
			patient.checkPulse();
			patient.fluShot();
		}
	}

	public boolean isEvil() {
		return evil;
	}

	public void joinTheDarkSide() {
		evil = true;
	}
}
