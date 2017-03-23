class Dancer extends Performer {

	enum DanceStyles {
		HIPHOP, SALSA, TANGO, WALTZ;
	}
	
	/*% why have an enum of dance styles when its always set to hiphop? %*/
	DanceStyles danceStyles = DanceStyles.HIPHOP;

	void perform() {
		System.out.println(danceStyles + " - " + performerID + " - dancer");

	}
}
