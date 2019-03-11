package it.polito.tdp.libretto;

import java.time.LocalDate;

public class Voto {
	private int voto;
	private String corso;
	private LocalDate data;		//non usare String per le date
	public Voto(int voto, String corso, LocalDate data) {
		super();
		this.voto = voto;
		this.corso = corso;
		this.data = data;
	}
	
	public int getVoto() {
		return voto;
	}

	public String getCorso() {
		return corso;
	}

	public LocalDate getData() {
		return data;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}
	public void setCorso(String corso) {
		this.corso = corso;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}

}
