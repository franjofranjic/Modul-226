package ch.gbssg.edu.franjic.franjo.Uebung2;

import java.util.ArrayList;

public class Hotel {
	Reception myReception;
	ArrayList<Zimmer> zimmerliste = new ArrayList<Zimmer>();
	ArrayList<Sitzungszimmer> sitzungszimmerliste = new ArrayList<Sitzungszimmer>();
	

	public Hotel() {
//		erstellt die Rezeption
		myReception = new Reception();
		
//		erstellt die Zimmer
		for(int i = 1; i<=10; i++) {
			zimmerliste.add(new Zimmer());
		}
		
//		erstellt Sitzungszimmer
		for(int i = 1; i<=3; i++) {
			sitzungszimmerliste.add(new Sitzungszimmer());
		}
		
	}
	
	public String getZimmnerliste() {
		String zimmerliste = "";
		for(Zimmer tmpZimmer:this.zimmerliste) {
			zimmerliste += tmpZimmer.getZimmername() + ": " + tmpZimmer.getZimmernumber() + "\n";
		}
		return zimmerliste;
	}

}
