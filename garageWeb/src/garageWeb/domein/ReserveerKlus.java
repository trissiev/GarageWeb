package garageWeb.domein;

import java.io.Serializable;
import java.time.LocalDate;

public class ReserveerKlus implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3052681706054365568L;
	private LocalDate datum;
	private String omschrijving;
	private Klus deKlus;
	
	public ReserveerKlus(LocalDate datum, String omschrijving){
		this.setDatum(datum);
		this.setOmschrijving(omschrijving);
	}

	public LocalDate getDatum() {
		return datum;
	}

	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public Klus getDeKlus() {
		return deKlus;
	}

	public void setDeKlus(Klus deKlus) {
		this.deKlus = deKlus;
	}
}
