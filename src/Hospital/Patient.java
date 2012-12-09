package Hospital;

public class Patient {
	boolean feelsCaredFor = false;
	public boolean feelsCaredFor() {
		return feelsCaredFor;
	}

	public void checkPulse() {
		feelsCaredFor = true;
	}
}
