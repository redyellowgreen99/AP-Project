package Hospital;

import java.util.List;

import junit.framework.TestCase;

/* requirements:
 * 1. hospital has doctors and patients
 * 2. doctors can be GeneralPractictioner or Surgeon
 * 3. patients can be assigned to doctors
 * 4. doctors can have no more than 3 patients
 */

public class HospitalTest extends TestCase {

	Hospital testHospital = new Hospital();

	public void testAddDoctor() {
		testHospital.addDoctor(new GeneralPractitioner());
		testHospital.addDoctor(new GeneralPractitioner());
		testHospital.addDoctor(new Surgeon());
		assertEquals(3, testHospital.getDoctors().size());
	}

	public void testAddPatient() throws Exception {
		testHospital.addPatient(new Patient());
		testHospital.addPatient(new Patient());
		testHospital.addPatient(new Patient());
		assertEquals(3, testHospital.getPatients().size());
	}

	/* Fix asserts one at a time */
	public void testDoctorsHaveSpecialties() throws Exception {
		Doctor testDoctor = new Doctor();
		assertEquals(false, testDoctor.performsSurgery());

		Doctor testSurgeon = new Surgeon();
		assertEquals(true, testSurgeon.performsSurgery());

		GeneralPractitioner testGP = new GeneralPractitioner();
		assertEquals(true, testGP.makesHouseCalls());
		assertEquals(false, testSurgeon.makesHouseCalls());
		assertEquals(false, testDoctor.makesHouseCalls());
	}

	/* A doctor has a list of patients */
	public void testAssignDoctor() throws Exception {
		Doctor testDoctor = new GeneralPractitioner();
		testDoctor.assignPatient(new Patient());
		assertEquals(1, testDoctor.getPatients().size());
		testDoctor.assignPatient(new Patient());
		assertEquals(2, testDoctor.getPatients().size());
		testDoctor.assignPatient(new Patient());
		assertEquals(3, testDoctor.getPatients().size());
	}

	/* When you check a patient's pulse, they feel cared for */
	public void testCheckPulse() throws Exception {
		Patient testPatient = new Patient();
		assertEquals(false, testPatient.feelsCaredFor());
		testPatient.checkPulse();
		assertEquals(true, testPatient.feelsCaredFor());
	}

	/* Doctors work on their Patients */
	public void testDoctorsWork() throws Exception {
		Doctor testDoctor = new GeneralPractitioner();
		Patient max = new Patient();
		Patient macky = new Patient();
		testDoctor.assignPatient(max);
		testDoctor.assignPatient(macky);
		assertEquals(false, max.feelsCaredFor());
		assertEquals(false, macky.feelsCaredFor());
		testDoctor.doMedicine();
		assertEquals(true, max.feelsCaredFor());
		assertEquals(true, macky.feelsCaredFor());
	}
	
	/* Doctors work on their Patients */
	public void testFluShot() throws Exception { //Made by Alex Baratti
		Doctor testDoctor = new GeneralPractitioner();
		Patient max = new Patient();
		Patient macky = new Patient();
		testDoctor.assignPatient(max);
		testDoctor.assignPatient(macky);
		assertEquals(false, max.feelsCaredFor());
		assertEquals(false, macky.feelsCaredFor());
		testDoctor.giveFluShot();
		assertEquals(true, max.feelsCaredFor());
		assertEquals(true, macky.feelsCaredFor());
		assertEquals(true, max.hasFluShot);
		assertEquals(true, macky.hasFluShot);
		assertEquals(true, max.hasBandage);
		assertEquals(true, macky.hasBandage);
	}

	/* test calling assignPatient when doctor is full throws exception */
	public void testDoctorsCanOnlyHandle3Patients() throws Exception {
		Doctor testDoctor = new Doctor();
		testDoctor.assignPatient(new Patient());
		testDoctor.assignPatient(new Patient());
		testDoctor.assignPatient(new Patient());
		try {
			testDoctor.assignPatient(new Patient());
			assertTrue(false);
		} catch (DoctorFullException dfe) {
			assertTrue(true);
		}
	}

	public void test8Patients() throws Exception {
		// add 3 doctors to hospital
		testHospital.addDoctor(new GeneralPractitioner());
		testHospital.addDoctor(new GeneralPractitioner());
		testHospital.addDoctor(new Surgeon());
		// add 8 patients to hospital
		testHospital.addPatient(new Patient());
		testHospital.addPatient(new Patient());
		testHospital.addPatient(new Patient());
		testHospital.addPatient(new Patient());
		testHospital.addPatient(new Patient());
		testHospital.addPatient(new Patient());
		testHospital.addPatient(new Patient());
		testHospital.addPatient(new Patient());
		// hospital assigns patients to doctors
		testHospital.assignPatientsToDoctors();
		// hospital.getDoctors shows doctors have 3, 3, 2 patients
		List<Doctor> testDoctors = testHospital.getDoctors();
		assertEquals(3, testDoctors.get(0).getPatients().size());
		assertEquals(3, testDoctors.get(1).getPatients().size());
		assertEquals(2, testDoctors.get(2).getPatients().size());
	}
	
	public void testAPatientCanDie() throws Exception {
		Patient doomedPatient = new Patient();
		assertEquals(true, doomedPatient.isAlive());
		doomedPatient.kill();
		assertEquals(false, doomedPatient.isAlive());
	}

	public void testSomeDoctorsAreEvil() throws Exception {
		Doctor doctor = new Doctor();
		assertEquals(false, doctor.isEvil());
		doctor.joinTheDarkSide();
		assertEquals(true, doctor.isEvil());
	}

	public void testEvilDoctorsKillPatients() throws Exception {
		Doctor evilDoctor = new Doctor();
		evilDoctor.joinTheDarkSide();
		Patient doomedPatient = new Patient();
		assertEquals(true, doomedPatient.isAlive());
		evilDoctor.assignPatient(doomedPatient);
		evilDoctor.doMedicine();
		assertEquals(false, doomedPatient.isAlive());

		Doctor goodDoctor = new Doctor();
		Patient luckyPatient = new Patient();
		assertEquals(true, luckyPatient.isAlive());
		goodDoctor.assignPatient(luckyPatient);
		goodDoctor.doMedicine();
		assertEquals(true, luckyPatient.isAlive());
	}

	// use “instanceof”
	public void testNewWayToAddDoctorsAndPatients() throws Exception {
		Hospital hospital = new Hospital();
		hospital.add(new Doctor());
		hospital.add(new Patient());
		hospital.add(new Patient());
		assertEquals(1, hospital.getDoctors().size());
		assertEquals(2, hospital.getPatients().size());
	}

//	// please use foreach loop
//	public void testHospitalMakesDoctorsWork() throws Exception {
//		Hospital hospital = new Hospital();
//		hospital.add(new Doctor());
//		hospital.addPatient(new Patient());
//		hospital.addPatient(new Patient());
//		hospital.assignPatientsToDoctors();
//		hospital.makeDoctorsWork();
//		assertTrue(hospital.getPatients().get(0).feelsCaredFor());
//		assertTrue(hospital.getPatients().get(1).feelsCaredFor());
//	}
//
//	public void testDoctorNumber666IsEvil() throws Exception {
//		Hospital elHospital = new Hospital();
//
//		Doctor niceDoctor = new Doctor("777");
//		elHospital.addDoctor(niceDoctor);
//		Patient luckyPatient = new Patient();
//		niceDoctor.assignPatient(luckyPatient);
//
//		Doctor evilDoctor = new Doctor("666");
//		elHospital.addDoctor(evilDoctor);
//		Patient doomedPatient = new Patient();
//		evilDoctor.assignPatient(doomedPatient);
//
//		elHospital.makeDoctorsWork();
//		assertEquals(false, doomedPatient.isAlive());
//		assertEquals(true, luckyPatient.isAlive());
//	}
//
//	/* Add a new constructor to Doctor that makes use of the other using "this()" */
//	public void testDoctorConstructors() throws Exception {
//		Hospital aHospital = new Hospital();
//		Doctor doctor = new Doctor("1", aHospital);
//		assertEquals(aHospital, doctor.getHospital());
//	}
//
//	public void testZombieConstructor() throws Exception { 
//		Zombie zombie = new Zombie("June 1st");
//		assertEquals("June 1st", zombie.getTimeOfDeath());
//	}
//
//	/*
//	 * When a patient is killed they move from the Patient list to the Zombie list. 
//	 * This will give you the current date and time: new Date().toString()
//	 */
//	public void testDeadPatientsBecomeZombies() throws Exception {
//		Hospital walkingDeadHospital = new Hospital();
//		Doctor evilDoctor = new Doctor("666", walkingDeadHospital);
//		Doctor niceDoctor = new Doctor("777", walkingDeadHospital);
//		walkingDeadHospital.add(evilDoctor);
//		walkingDeadHospital.add(niceDoctor);
//		walkingDeadHospital.add(new Patient());
//		walkingDeadHospital.add(new Patient());
//		walkingDeadHospital.add(new Patient());
//		walkingDeadHospital.add(new Patient());
//		walkingDeadHospital.add(new Patient());
//		walkingDeadHospital.assignPatientsToDoctors();
//		walkingDeadHospital.makeDoctorsWork();
//
//		assertEquals(3, walkingDeadHospital.getZombies().size());
//		assertEquals(2, walkingDeadHospital.getPatients().size());
//	}


}
