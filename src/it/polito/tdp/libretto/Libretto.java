package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libretto {

	private List <Voto> voti;   //mantenere le interfacce più generali possibili
								// dichiara le variabili usando il nome dell'interfaccia

	public Libretto() {
		this.voti = new ArrayList<Voto>();   //riferimento a un oggetto ArrayList
	}
	
	public void add(int voto, String corso, LocalDate data) {
		
	}
	
	/**
	 * Aggiunge un nuovo voto al libretto
	 * 
	 * @param v il {@link Voto} da aggiungere
	 */
	public void add(Voto v) {
		//qualunque sia la struttura della classe voto, questo metodo funziona
		// Per aggiungere un oggetto al libretto non c'e' bisogno di sapere come e' fatto il voto
		// --> bisogna cercare di avere il minore numero di dipendenze tra le classi
		// --> massimizzare il disaccoppiamento tra gli oggetti
	
		voti.add(v);  //DELEGO alla lista l'operazione di aggiunta
	}
}
