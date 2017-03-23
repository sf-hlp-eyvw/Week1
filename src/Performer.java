import java.util.Random;

class Performer {
	Random rand = new Random();

	int performerID = 0;

	// this constructor will generate a new performerID for each instance that
	// is created so you have new IDs
	Performer() {
		/*% ids should be unique - this could cause some performers to have the same id %*/
		performerID = rand.nextInt(5000);
	}

	// no arguments means it'll just print the ID and that this is a performer
	void perform() {
		System.out.println(performerID + " - performer");
	}

	// getters and setters incase needed later on
	void setPerformorID(int newID) {
		performerID = newID;
	}

	int getPerformorID() {
		return performerID;
	}

}
