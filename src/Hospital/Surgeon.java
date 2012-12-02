package Hospital;

public class Surgeon extends Doctor {
	public boolean performsSurgery() {
		return true;
	}

	public boolean makesHouseCalls() {
		return false;
	}
}
