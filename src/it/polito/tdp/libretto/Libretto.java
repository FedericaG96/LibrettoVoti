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
		
	/**
	 * Aggiunge un nuovo voto al libretto
	 * 
	 * @param v il {@link Voto} da aggiungere
	 * @return 	   {@code true} nel caso normale, {@code false }
	 */
	public void add(Voto v) {
		if(!this.esisteGiaVoto(v) && !this.votoConflitto(v)) {
			voti.add(v);
		}
		else {
			
		}
			
	}
	
	//public void StampaVoti(int voto) {}   //stampa direttamente i voti
	
	//public String StampaVoti2(int voto) {}	//classe Libretto costruisce una stringa con i voti da stampare
											//ma non li stampa 
	
	//Conviene usare il terzo metodo: separo l'operazione di ricerca dalla formattazione del risultato
	
	/**
	 * Seleziona il sottoinsieme di voti che hanno il punteggio specificato
	 * 
	 * @param punti punteggio da ricerca
	 * @return lista di {@link Voto} aventi quel punteggio (eventualmente vuota)
	 */
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
	
	/**
	 * Ricerca un {@link Voto} relativo al corso di cui è specificato il nome
	 *
	 * @param nomeEsame nome del corso da ricercare
	 * @return il {@link Voto} corrispondente, oppure {@code null} se non esistente
	 */
	public Voto cercaEsame(String nomeEsame) {
		//for(Voto v : this.voti) {
		// if(v.getCorso().equals(nomeEsame)) {
		//   return v;
		//	}
		//}
		
		Voto voto = new Voto(0,nomeEsame,null);
		this.voti.indexOf(voto);//passo a indexof un oggetto parzialmente costruito, che serve solo come criterio di ricerca
		int pos = this.voti.indexOf(voto);
		if(pos == -1)
			return null;
		else 
			return this.voti.get(pos);
	}
	
	
	/**
	 * Dato un {@link Voto}, determina se esite già un voto
	 * con uguale corso ed uguale punteggio
	 * 
	 * @param v
	 * @return {@code true}, se ha trovato un corso e punteggio uguali, 
	 * {@code false} se non ha trovato il corso, 
	 * oppure l'ha trovato con un voto diverso
	 */
	public boolean esisteGiaVoto(Voto v) {
		
		int pos = this.voti.indexOf(v);
		if(pos == -1)
			return false;
		else {
			if(v.getPunti() ==this.voti.get(pos).getPunti())
				return true;
			else
				return (v.getPunti() == this.voti.get(pos).getPunti());
		}
		
		
	//	Voto trovato = this.cercaEsame(v.getCorso());
	//	if(trovato==null) 
	//		return false;
	//	if(trovato.getPunti()==v.getPunti())
	//		return true;
	//	else 
	//		return false;
	}
	
	/**
	 * Mi dice se il {@link Voto} {@code v} è in conflitto con uno dei voti
	 * esistenti. Se il voto non esiste, non c'è conflitto. Se esiste eh ha
	 * un puntegio diverso, c'è conflitto.
	 * 
	 * @param v 
	 * @return {@code true} se il voto esiste già ed è in conflitto
	 * 		   {@code false} se il voto
	 * 	       {@code }
	 */
	public boolean votoConflitto(Voto v) {
		int pos = this.voti.indexOf(v);
		if(pos == -1)
			return false;
		else {
			if(v.getPunti() == this.voti.get(pos).getPunti())
				return true;
			else
				return (v.getPunti() == this.voti.get(pos).getPunti());
		}
	}
	
	public String toString() {
		return this.voti.toString();
	}
}
