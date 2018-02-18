class Life {

	private static String emotion;

	public Life(String emotion) {
		this.emotion = emotion;
	}

	private static boolean canSomethingBeDone() {
		return this.emotion.isEmpty() ? false : true;
	}

	private static int relax() {
		int faith = 0;
		if(this.emotion.equals("fear")) {
			faith = 10;
		} else if(this.emotion.equals("worry")) {
			faith = 10;
		} else if(this.emotion.equals("happiness")) {
			faith++;
		} else if(this.emotion.equals("love")) {
			faith++;
		} else {
			faith++;
		}
		return faith;
	}

	public void myReaction(String problem) {
		if(problem.length > 0) {
			if (canSomethingBeDone()) {
				System.out.println("Life made you " + relax() + " times smarter through this situation");
			} else {
				System.out.println("Dont worry, you will be " + relax() + " stronger after this battle");
			}
		} else {
			System.out.println("Today you are " + relax() + " time more grateful");
		}
	}
}