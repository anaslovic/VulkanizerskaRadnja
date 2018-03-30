package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;

/**
 * 
 * Klasa predstavlja vulkanizersku radnju sa najosnovnijim funkcionalnostima
 * @author Ana Slovic
 * @version 1.0.0
 * 
 */
public class VulkanizerskaRadnja {
	
	/**
	 * Lista automobilskih guma koje se nalaze u asortimanu radnje
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Metoda dodaje novu automobilsku gumu u asortiman radnje
	 * @param a Nova vrsta gume koja se dodaje u ponudu
	 * @throws java.lang.NullPointerException ako je uneta guma null
	 *  @throws java.lang.RuntimeException ako uneta guma vec postoji u ponudi
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}
	
	/**
	 * Pretrazuje celokupnu ponudu po marki i modelu i 
	 * vraca listu svih guma cija se vrednost tog atributa poklapa
	 * 
	 * @param markaModel Marka i model trazene gume
	 * 
	 * @return lista guma koje su trazene marke i modela ako takvih ima
	 * @return null ako je markaModel null ili ako u listi
	 * ne postoji guma sa trazenom markom i modelom
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));
		if (novaLista.isEmpty())
			return null;
		return novaLista;
	}
	
	/**
	 * Vraca listu svih guma koje se nalaze u aranzmanu
	 * @return listu guma
	 */
	public LinkedList<AutoGuma> getGume() {
		return gume;
	}
}
