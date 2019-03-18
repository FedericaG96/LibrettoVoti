package it.polito.tdp.libretto;

import java.time.LocalDate;

public class Voto {
	private int punti;
	private String corso;
	private LocalDate data;		//non usare String per le date
	public Voto(int voto, String corso, LocalDate data) {
		super();
		this.punti = voto;
		this.corso = corso;
		this.data = data;
	}
	
	public int getPunti() {
		return punti;
	}

	public String getCorso() {
		return corso;
	}

	public LocalDate getData() {
		return data;
	}

	public void setPunti(int voto) {
		this.punti = voto;
	}
	public void setCorso(String corso) {
		this.corso = corso;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}

	//tasto destro, source, Generate toString()
	@Override
	public String toString() {
		return String.format("Voto [punti=%s, corso=%s, data=%s]", punti, corso, data);
	}
	
	
}
