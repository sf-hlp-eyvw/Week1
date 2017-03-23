class Vocalist extends Performer {

	enum SongKey {
		G, A, B, C, D, E, F;
	}
	
	/*% why have an enum of vocal keys when its always set to G? %*/
	SongKey key = SongKey.G;

	// vocalist performs with no arguments
	void perform() {
		System.out.println("I sing in the key of - " + key + " - "
				+ performerID);
	}

	// vocalist performs with arguments (specified volume)
	void perform(int volume) {
		System.out.println("I sing in the key of - " + key + " - "
				+ "at the volume " + volume + " - " + performerID);
	}
}
