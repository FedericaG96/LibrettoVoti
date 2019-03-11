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
	public void add(Voto v) {
		//qualunque sia la struttura della classe voto, questo metodo funziona
		// --> minore numero di dipendeze tra le classi
	}
}
