package Hospital;

import java.sql.Date;
import java.util.ArrayList;

public class Doctor {
	public Doctor(String numbers, Hospital hospitalName) {
		hospital1 = hospitalName;
		evil = numbers == "666";
	}

	public Doctor(String numbers) {
		evil = numbers == "666";
	}

	public Doctor() {

	}

	boolean evil = false;

	Hospital hospital1;
	ArrayList<Patient> patientList = new ArrayList<Patient>();

	public boolean performsSurgery() {
		return false;
	}

	public Hospital getHospital() {
//		System.out.println(hospital1);
		return hospital1;
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

	String dateOfDeath = new Date(0).toString();

	public void doMedicine() {
		if (evil) {
			for (int i = 0; i < patientList.size(); i++) {
				patientList.get(i).kill();
				Zombie zombie = new Zombie(dateOfDeath);
				if (hospital1 != null) {
					hospital1.getZombies().add(zombie);
					hospital1.getPatients().remove(i);
				}
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
