package ch.gbssg.edu.franjic.franjo.Uebung1;

public class Goalie {
	private Trainer myTrainer;
	private String name;
	
	public Goalie() {
		name = "GOALIE";
	}

	public Trainer getMyTrainer() {
		return myTrainer;
	}

	public void setMyTrainer(Trainer myTrainer) {
		this.myTrainer = myTrainer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
