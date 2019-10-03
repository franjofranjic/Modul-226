package ch.gbssg.edu.franjic.franjo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test der Klasse Wasserfass")
public class WasserfassTest {

	@DisplayName("Test der Methode entnehmen / zu viel entnehmen")
	@Test
	void test_entnehmen_over() {
		Wasserfass myWasserfass = new Wasserfass();
		myWasserfass.entnehmen(10000);
		assertEquals(myWasserfass.getFuellstand(), myWasserfass.getFuellstand());
	}
	
	@DisplayName("Test der Methode entnehmen / negativ entnehmen")
	@Test
	void test_entnehmen_neg() {
		Wasserfass myWasserfass = new Wasserfass();
		myWasserfass.entnehmen(-10000);
		assertEquals(0, myWasserfass.getFuellstand());
	}
	
	@DisplayName("Test der Methode entnehmen / normal entnehmen")
	@Test
	void test_entnehmen_norm() {
		Wasserfass myWasserfass = new Wasserfass();
		myWasserfass.befuellen(300);
		myWasserfass.entnehmen(200);
		assertEquals(100, myWasserfass.getFuellstand());
	}
	
	@DisplayName("Test der Methode entnehmen / auf null")
	@Test
	void test_entnehmen_zero() {
		Wasserfass myWasserfass = new Wasserfass();
		myWasserfass.befuellen(200);
		myWasserfass.entnehmen(200);
		assertEquals(0, myWasserfass.getFuellstand());
	}
	
	
	@DisplayName("Test der Methode entleeren")
	@Test
	void test_entleeren() {
		Wasserfass myWasserfass = new Wasserfass();
		myWasserfass.entleeren();
		assertEquals(0, myWasserfass.getFuellstand());
	}
	
	@DisplayName("Test der Methode befuellen / Maximal einfüllen")
	@Test
	void test_befuellen_max() {
		Wasserfass myWasserfass = new Wasserfass();
		myWasserfass.befuellen(myWasserfass.getMaxfuellstand());
		assertEquals(myWasserfass.getMaxfuellstand(), myWasserfass.getFuellstand());
	}
	
	@DisplayName("Test der Methode befuellen/ zu viel befuellen")
	@Test
	void test_befuellen() {
		Wasserfass myWasserfass = new Wasserfass();
		myWasserfass.befuellen(10000);
		assertEquals(myWasserfass.getMaxfuellstand(), myWasserfass.getFuellstand());
	}
	
	@DisplayName("Test der Methode befuellen/ negativ befuellen")
	@Test
	void test_befuellen_neg() {
		Wasserfass myWasserfass = new Wasserfass();
		myWasserfass.befuellen(-100);
		assertEquals(0, myWasserfass.getFuellstand());
	}
	
	@DisplayName("Test der Methode befuellen/ normal befuellen")
	@Test
	void test_befuellen_norm() {
		Wasserfass myWasserfass = new Wasserfass();
		myWasserfass.befuellen(200);
		assertEquals(200, myWasserfass.getFuellstand());
	}
	
}
