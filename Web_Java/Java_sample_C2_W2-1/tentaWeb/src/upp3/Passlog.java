package upp3;

class Passlog {

	private static final String REP_PASS = "password";

	public static String getRepPass() {
		return REP_PASS;
	}

	static boolean checkPass(String toCheck) {

		return REP_PASS.equals(toCheck);

	}
}
