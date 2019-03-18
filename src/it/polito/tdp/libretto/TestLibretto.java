package it.polito.tdp.libretto;

import java.time.LocalDate;

public class TestLibretto {
	
	//Da questa classe richiamo i metodi della classe Libretto per testare se funziona
	//Avrei potuto mettere l'intero main nella classe Libretto
	// ma cosi' si rischia di dover chiamare una variabile privata o un metodo privato
	//--> meglio tenere separate le due classi
	//Inoltre questo e' un programma di prova e io potrei avere tanti programmi di prova 
	// in base a cio' che sto testando
	//Quindi non sarebbe comodo bloccare il main nella classe libretto
	
	public static void main(String[] args) {
		
		Libretto libr = new Libretto();
		libr.add( new Voto(30, "Analisi I", LocalDate.of(2017, 1, 15) ));	
		libr.add( new Voto(21, "Analisi II", LocalDate.of(2018, 2, 10) ));	
		libr.add( new Voto(25, "Fisica I", LocalDate.of(2017, 7, 15) ));	
		libr.add( new Voto(28, "Fisica II", LocalDate.of(2018, 1, 16) ));	
		libr.add( new Voto(18, "Economia", LocalDate.of(2018, 6, 13) ));	
		libr.add( new Voto(19, "Ricerca Operativa", LocalDate.of(2018, 9, 12) ));	
		libr.add( new Voto(26, "Logistica", LocalDate.of(2019, 9, 18) ));	
		libr.add( new Voto(24, "Geometria", LocalDate.of(2017, 6, 15) ));	
		libr.add( new Voto(29, "Programmazione a Oggetti", LocalDate.of(2019, 1, 15) ));
		libr.add( new Voto(30, "PGP", LocalDate.of(2019, 1, 31) ));	
	}

}
