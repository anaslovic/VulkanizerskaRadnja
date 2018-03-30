package gume;
/**
 * 
 * Klasa predstavlja automobilsku gumu sa osnovnim karakteristikama
 * @author Ana Slovic
 * @version 1.0.0
 * 
 */
public class AutoGuma {
	/**
	 * Marka i model gume
	 */
	private String markaModel = null;
	
	/**
	 * Precnik gume
	 */
	private int precnik = 0;
	
	/**
	 * Sirina gume
	 */
	private int sirina = 0;
	
	/**
	 * Visina gume
	 */
	private int visina = 0;
	
	/**
	 * Vraca vrednost atributa koji predstavlja marku i model gume
	 * @return markuModel kao jedan string
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Postavlja novu vrednost za atribut markaModel
	 * 
	 * @param markaModel nova vrednost za marku i model gume
	 * 
	 * @throws java.lang.RuntimeException ako je unet:
	 * <ul> 
	 * 
	 * <li>null String</li>
	 * 
	 * <li>string kraci od 3 znaka</li>
	 * 
	 * </ul>
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * Vraca vrednost atributa koji predstavlja precnik gume
	 * @return precnik kao ceo broj(int)
	 */
	public int getPrecnik() {
		return precnik;
	}
	
	/**
	 * Postavlja novu vrednost atributa precnik
	 * 
	 * @param precnik nova vrednost za precnik gume
	 * 
	 * @throws java.lang.RuntimeException ako je uneta vrednost za precnik :
	 * <ul> 
	 * 
	 * <li>manja od 13</li>
	 * 
	 * <li>veca od 22</li>
	 * 
	 * </ul>
	 * 
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}
	
	/**
	 * Vraca vrednost za atribut sirina
	 * @return sirina kao ceo broj(int)
	 */
	public int getSirina() {
		return sirina;
	}
	
	/**
	 * Postavlja novu vrednost atributa sirina
	 * 
	 * @param sirina nova vrednost za sirinu gume
	 * 
	 * @throws java.lang.RuntimeException ako je uneta:
	 * <ul> 
	 * 
	 * <li>sirina manja od 135</li>
	 * 
	 * <li>sirina veca od 355</li>
	 * 
	 * </ul>
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
	
	/**
	 * Vraca vrednost za atribut visina
	 * @return visina kao ceo broj(int)
	 */
	public int getVisina() {
		return visina;
	}
	
	/**
	 * Postavlja novu vrednost atributa visina
	 * 
	 * @param visina nova vrednost za visinu gume
	 * 
	 * @throws java.lang.RuntimeException ako je uneta:
	 * <ul> 
	 * 
	 * <li>visina manja od 25</li>
	 * 
	 * <li>visina veca od 95</li>
	 * 
	 * </ul>
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}
	
	/**
	 * Vraca sve podatke o gumi kao jedan string
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}
	
	/**
	 * Proverava za uneti objekat da li je jednak odredjenoj instanci klase guma
	 * @return true ako su 2 gume jednak
	 * @return false ako 2 gume nisu jednake
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}
