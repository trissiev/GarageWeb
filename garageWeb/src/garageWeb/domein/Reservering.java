package garageWeb.domein;
import java.io.Serializable;
import java.time.LocalDate;

public class Reservering implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4749848595640810629L;
	private LocalDate datum;
	private Klant klant;
	
	public Reservering(LocalDate datum, Klant klant) {
		this.setDatum(datum);
		this.setKlant(klant);
	}

	public LocalDate getDatum() {
		return datum;
	}

	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}

	public Klant getKlant() {
		return klant;
	}

	public void setKlant(Klant klant) {
		this.klant = klant;
	}
}
