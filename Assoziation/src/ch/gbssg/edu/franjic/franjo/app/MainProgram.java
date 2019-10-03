package ch.gbssg.edu.franjic.franjo.app;

import ch.gbssg.edu.franjic.franjo.*;
import ch.gbssg.edu.franjic.franjo.Uebung1.*;
import ch.gbssg.edu.franjic.franjo.Uebung2.Hotel;

public class MainProgram {

	public static void main(String[] args) {
		
//		Aufgabe 01
		Kind hans = new Kind();
		Vater peter = new Vater();
		
		peter.setMyKind(hans);
		hans.setMyVater(peter);
		
//		Aufgabe 02
		Buch harrypotter1 = new Buch();
		Buch harrypotter2 = new Buch();
		Buch harrypotter3 = new Buch();
		Buch harrypotter4 = new Buch();
		Kunde stefan = new Kunde();
		
//		harrypotter1.setMyKunde(stefan);
		stefan.addBook(harrypotter1);
		stefan.addBook(harrypotter2);
		stefan.addBook(harrypotter3);
		stefan.addBook(harrypotter4);
		
		stefan.getTitels();
		
		System.out.println("Anzahl Buecher: " + stefan.getBooks());
		
//		Aufgabe 03
		Notebook myNote = new Notebook();
		Festplatte myHD = new Festplatte();
		
		myNote.setFestplatte(myHD);
		
//		Aufgabe 04
		Mitarbeiter myMitarbeiter = new Mitarbeiter();
		Firma myFirma = new Firma();
		
		myFirma.setMitarbeiter(myMitarbeiter);
		System.out.println("Mitarbeiterliste: " + myFirma.getMitarbeiter());
		
//		Aufgabe 05
		Kunde myKunde = new Kunde();
		System.out.println("Kontonummer: " +myKunde.getKontonr());

//		Uebung 1
		Manschaft fcgbs = new Manschaft();
		Sportchef chef1 = new Sportchef();
		Trainer trainer1 = new Trainer();
		Goalie goalie1 = new Goalie();
		Feldspieler[] feldspielerliste = new Feldspieler[11];
		Ersatzbank[] ersatzbankliste = new Ersatzbank[4];
		
		trainer1.setChef(chef1);
		goalie1.setMyTrainer(trainer1);
		fcgbs.setTrainer(trainer1);
		fcgbs.setGoalie(goalie1);
		
		for(int i = 1; i<=10; i++) {
			feldspielerliste[i] = new Feldspieler("Spieler " + i);
			fcgbs.setFeldspieler(feldspielerliste[i]);
			feldspielerliste[i].setMyTrainer(trainer1);;
		}
		
		for(int i = 1; i<=3; i++) {
			ersatzbankliste[i] = new Ersatzbank("Eratzbank " + i);
			fcgbs.setErsatzbank(ersatzbankliste[i]);
			ersatzbankliste[i].setMyTrainer(trainer1);;
		}
		
		System.out.println(fcgbs.getPlayer());
		
//		Uebung 2
		Hotel myhotel = new Hotel();
		myhotel.getZimmnerliste();
		
	}

}
