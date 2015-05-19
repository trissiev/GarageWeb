package garageWeb.domein;

import java.io.Serializable;

public class Bedrijfsleider implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4576079876855917504L;
	private String naam, gebruikersnaam, wachtwoord;
	
	public Bedrijfsleider(String naam, String gebruikersnaam, String wachtwoord){
		this.setNaam(naam);
		this.setGebruikersnaam(gebruikersnaam);
		this.setWachtwoord(wachtwoord);
	}

	public String getWachtwoord() {
		return wachtwoord;
	}

	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}

	public String getGebruikersnaam() {
		return gebruikersnaam;
	}

	public void setGebruikersnaam(String gebruikersnaam) {
		this.gebruikersnaam = gebruikersnaam;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

}
