package ch.gbssg.edu.franjic.franjo.Uebung1;

public class Ersatzbank {
	private Trainer myTrainer;
	private String name;
	
	public Ersatzbank() {
		name = "NAME";
	}
	
	public Ersatzbank(String name) {
		this.name = name;
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
