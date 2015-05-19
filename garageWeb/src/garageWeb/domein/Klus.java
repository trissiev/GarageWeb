package garageWeb.domein;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Klus implements Serializable {
	/**
	 * 
	 */
	public static final long serialVersionUID = 8444331648165013908L;
	private String naam;
	private String omschrijving;
	private int geschatte;
	private int uren;
	private boolean betaald;
	private LocalDate datum;
	private boolean running;
	
	private ArrayList<KlusRegel> artikelen = new ArrayList<KlusRegel>();
	private ArrayList<Monteur> monteuren = new ArrayList<Monteur>();
	
	public Klus(String naam, String omschrijving, int geschatte, LocalDate datum) {
		this.naam = naam;
		this.uren = 0;
		this.geschatte = geschatte;
		this.omschrijving = omschrijving;
		this.datum = datum;
	}
	

	// Setters
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public void setUren(int uren) {
		this.uren = uren;
	}
	
	public void setArtikel(Artikel artikel, int aantal) {
		artikelen.add(new KlusRegel(aantal, artikel));
	}
	
	public void setMonteur(Monteur monteur) {
		monteuren.add(monteur);
	}

	public void setBetaald(boolean betaald) {
		this.betaald = betaald;
	}
	public void setRunning(boolean b){
		running = b;
	}
	
	// Getters
	public String getNaam() {
		return naam;
	}
	
	public int getUren() {
		return uren;
	}
	
	public ArrayList<KlusRegel> getArtikelen() {
		return artikelen;
	}
	
	public ArrayList<Monteur> getMonteuren() {
		return monteuren;
	}

	public boolean getBetaald() {
		return betaald;
	}
	
	public LocalDate getDatum() {
		return datum;
	}
	
	public String getOmschrijving() {
		return omschrijving;
	}
	public boolean getRunning(){
		return running;
	}
}