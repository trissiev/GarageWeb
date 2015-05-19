package garageWeb.domein;

import java.io.Serializable;

public class KlusRegel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2211040341240273503L;
	private int aantal;
	private Artikel artikel;
	
	public KlusRegel(int aantal, Artikel artikel) {
		this.aantal = aantal;
		this.artikel = artikel;
	}
	
	// Setters
	public void setAantal(int aantal) { 
		this.aantal = aantal;
	}
	
	public void setArtikel(Artikel artikel) {
		this.artikel = artikel;
	}
	
	// Getters
	public int getAantal() {
		return aantal;
	}
	
	public Artikel getArtikel() {
		return artikel;
	}
}
