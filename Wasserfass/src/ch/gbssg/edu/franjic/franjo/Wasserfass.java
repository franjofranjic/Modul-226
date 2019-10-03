package ch.gbssg.edu.franjic.franjo;

public class Wasserfass {
	private int fuellstand;
	private int maxfuellstand;

	
	public Wasserfass() {
		setFuellstand(0);
		setMaxfuellstand(1000);
	}
	
	public Wasserfass(int startFuellstand, int startMaxFuellstand) {
		setFuellstand(startFuellstand);
		setMaxfuellstand(startMaxFuellstand);
	}

	public void entnehmen(int menge) {
		if(menge >= 0) {
			if(fuellstand-menge > 0) {
				this.fuellstand -= menge;
			}
			else {
				setFuellstand(0);
			}
		}
		else {
			System.out.println("Sie können keine negative Menge entnehmen!");
		}
	}

	public void befuellen(int menge) {
		if(menge >= 0) {
			if(fuellstand+menge <= maxfuellstand) {
				this.fuellstand += menge;
			}
			else {
				setFuellstand(maxfuellstand);
			}
		}
		else {
			System.out.println("Sie können keine negative Menge einfüllen!");
		}
	}

	public void entleeren() {
		setFuellstand(0);
	}

	public int getFuellstand() {
		return fuellstand;
	}

	private void setFuellstand(int fuellstand) {
		this.fuellstand = fuellstand;
	}

	public int getMaxfuellstand() {
		return maxfuellstand;
	}

	public void setMaxfuellstand(int maxfuellstand) {
		this.maxfuellstand = maxfuellstand;
	}
	
	

}
