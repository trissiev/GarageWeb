package garageWeb.domein;
import java.io.Serializable;
import java.util.ArrayList;

public class Garage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2617835520506351613L;
	private String naam;
	private String adres;
	
	private Bedrijfsleider deBedrijfsleider;
	private ArrayList<ParkeerBeheer> beheerders = new ArrayList<ParkeerBeheer>();
	private ArrayList<Klant> klanten = new ArrayList<Klant>();
	private ArrayList<Artikel> artikelen = new ArrayList<Artikel>();
	private ArrayList<Monteur> monteuren = new ArrayList<Monteur>();
	private Parkeerplaats deParkeerplaats;
	
	public Garage(String naam, String adres) {
		this.setNaam(naam);
		this.adres = adres;
	}

	// Setters
	public void setArtikel(Artikel artikel) {
		artikelen.add(artikel);
	}

	public void setKlant(Klant klant) {
		klanten.add(klant);
	}
	
	public void setMonteur(Monteur monteur) {
		monteuren.add(monteur);
	}
	
	// Getters
	public ArrayList<Artikel> getArtikelen() {
		return artikelen;
	}
	
	public ArrayList<Klant> getKlanten() {
		return klanten;
	}
	
	public ArrayList<Monteur> getMonteuren() {
		return monteuren;
	}
	
	// Custom
	public void removeMonteur(Monteur monteur) {
		monteuren.remove(monteur);
	}
	
	public void removeArtikel(Artikel artikel) {
		artikelen.remove(artikel);
	}

	public Bedrijfsleider getDeBedrijfsleider() {
		return deBedrijfsleider;
	}

	public void setDeBedrijfsleider(Bedrijfsleider deBedrijfsleider) {
		this.deBedrijfsleider = deBedrijfsleider;
	}

	public ArrayList<ParkeerBeheer> getBeheerders() {
		return beheerders;
	}

	public void setBeheerders(ArrayList<ParkeerBeheer> beheerders) {
		this.beheerders = beheerders;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public Parkeerplaats getDeParkeerplaats() {
		return deParkeerplaats;
	}

	public void setDeParkeerplaats(Parkeerplaats deParkeerplaats) {
		this.deParkeerplaats = deParkeerplaats;
	}
}