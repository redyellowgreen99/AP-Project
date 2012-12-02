package Hospital;

public class GeneralPractitioner extends Doctor {
	public boolean performsSurgery() {
		return false;
	}
	public boolean makesHouseCalls() {
		return true;
	}
}
