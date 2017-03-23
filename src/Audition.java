class Audition {
	public static void main(String[] args) {
		// instantiating my objects to perform for later, each time the program
		// is a run a new performance is given by a different group
		Performer performer1 = new Performer();
		Performer performer2 = new Performer();
		Performer performer3 = new Performer();
		Performer performer4 = new Performer();
		/*% Use encapsulation to hide types, all of your dancers and vocalists are performers
		  would make it easier and shorter to call perform on everyone %*/
		Dancer dancer1 = new Dancer();
		Dancer dancer2 = new Dancer();

		Vocalist vocalist = new Vocalist();
		// 4 performers
		performer1.perform();
		performer2.perform();
		performer3.perform();
		performer4.perform();
		// 2 dancers
		dancer1.perform();
		dancer2.perform();
		// 1 vocalist(same vocalist ID) that is told to Sing , and then told to
		// sing at a specific
		// volume again
		vocalist.perform();
		vocalist.perform(5);
	}

}
