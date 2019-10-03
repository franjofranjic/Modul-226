package ch.gbssg.edu.franjic.franjo.Uebung1;

public class Trainer {
	private Sportchef chef;
	private String name;
	
	public Trainer() {
		name = "TRAINER";
	}

	public Sportchef getChef() {
		return chef;
	}

	public void setChef(Sportchef chef) {
		this.chef = chef;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
