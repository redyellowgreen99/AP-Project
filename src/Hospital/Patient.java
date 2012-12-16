package Hospital;

public class Patient {
	boolean feelsCaredFor = false;
	boolean hasFluShot = false;
	boolean hasBandage = false;
	boolean alive = true;

	public boolean feelsCaredFor() {
		return feelsCaredFor;
	}

	public void checkPulse() {
		feelsCaredFor = true;
	}

	public void fluShot() {
		feelsCaredFor = true;
		hasFluShot = true;
		hasBandage = true;
	}

	public boolean isAlive() {
		return alive;
	}

	public void kill() {
		alive = false;
	}
}
