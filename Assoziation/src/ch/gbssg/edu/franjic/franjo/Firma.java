package ch.gbssg.edu.franjic.franjo;

import java.util.ArrayList;

public class Firma {
	Mitarbeiter myMitarbeiter;
	ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<>();
	
	public void setMitarbeiter(Mitarbeiter mitarbeiter) {
		mitarbeiterListe.add(mitarbeiter);
	}
	
	public String getMitarbeiter() {
		String list = "";
		for(Mitarbeiter tmpMitarbeiter:mitarbeiterListe) {
			list += tmpMitarbeiter.getName() + "\n";
		}
		
		return list;
	}

}
