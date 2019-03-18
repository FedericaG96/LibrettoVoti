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
	
	//public void StampaVoti(int voto) {}   //stampa direttamente i voti
	
	//public String StampaVoti2(int voto) {}	//classe Libretto costruisce una stringa con i voti da stampare
											//ma non li stampa 
	
	//Conviene usare il terzo metodo: separo l'operazione di ricerca dalla formattazione del risultato
	
	public List<Voto> cercaVoti(int voto) {	//classe Libretto seleziona una lista che contiene solo i voti 
		List<Voto> result = new ArrayList<Voto>();	//che corrispondono al criterio di ricerca
	
		for(Voto v : this.voti) {
			if(v.getPunti() == voto) {
				result.add(v);	//aggiungo alla lista un oggetto gia' presente, non ne sto creando di nuovi
								// la lista contiene i riferimenti agli oggetti
			}
		}
		return result;   //restituisco la lista al chiamante
	}
	
}
