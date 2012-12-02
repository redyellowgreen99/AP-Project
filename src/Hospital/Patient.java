package Hospital;

public class Patient {
	boolean checkPulse = false;
	public boolean feelsCaredFor() {
		return true;
	}

	public boolean checkPulse() {
		boolean feelsCaredFor = checkPulse;
		if (feelsCaredFor() == false) {
			return false;
		} else {
			return true;
		}
	}
}
