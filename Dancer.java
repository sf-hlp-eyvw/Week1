class Dancer extends Performer {

	enum DanceStyles {
		HIPHOP, SALSA, TANGO, WALTZ;
	}

	DanceStyles danceStyles = DanceStyles.HIPHOP;

	void perform() {
		System.out.println(danceStyles + " - " + performerID + " - dancer");

	}
}
