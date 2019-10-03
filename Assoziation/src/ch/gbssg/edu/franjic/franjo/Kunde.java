package ch.gbssg.edu.franjic.franjo;

import java.util.ArrayList;

public class Kunde {
	private ArrayList<Buch> myBooks = new ArrayList<>();
	private ArrayList<Konto> myKontolist = new ArrayList<>();
	private Konto myKonto;
	
	
	public Kunde() {
		myKontolist.add(new Konto());
	}
	
	public void addBook(Buch book) {
		myBooks.add(book);
	}
	
	public int getBooks() {
		return myBooks.size();
	}
	
	public void getTitels() {
		for(Buch books:myBooks) {
			System.out.println(books.getTitel());
		}
	}
	
	public Konto getKonto() {
		return myKonto;
	}
	
	public String getKontonr() {
		String list = "";
		for(Konto tmpMyKonto:myKontolist) {
			list += tmpMyKonto.getKontonr() + "\n";
		}
		
		return list;
	}
}
