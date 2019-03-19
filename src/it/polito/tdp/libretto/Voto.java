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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((corso == null) ? 0 : corso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		if (corso == null) {
			if (other.corso != null)
				return false;
		} else if (!corso.equals(other.corso))   //delego il confronto al metodo equals della classe String
			return false;						//non si tratta di ricorsione
		return true;
	}
	
	
}
