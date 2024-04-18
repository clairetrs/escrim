package model;

import java.util.Date;
import java.util.Objects;

public class Medicament extends Materiel{
	
	private String nomProduit;
	private int idColis; 
	private int quantite;
	private String unite;
	private float volume;
	private Date dlu;
	private String formeDosage;
	private String classeTherapeutique;
	private String dci;
	private int numeroLot;
	
	public Medicament(String nomProduit, int idColis, int quantite, String unite, float volume, Date dlu, String formeDosage, String classeTherapeutique, String dci, int numeroLot) {
		this.nomProduit = nomProduit;
		this.idColis = idColis;
		this.quantite = quantite;
		this.unite = unite;
		this.volume = volume;
		this.dlu = dlu;
		this.formeDosage = formeDosage;
		this.classeTherapeutique = classeTherapeutique;
		this.dci = dci;
		this.numeroLot = numeroLot;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medicament other = (Medicament) obj;
		return Objects.equals(classeTherapeutique, other.classeTherapeutique) && Objects.equals(dci, other.dci)
				&& Objects.equals(dlu, other.dlu) && Objects.equals(formeDosage, other.formeDosage)
				&& idColis == other.idColis && Objects.equals(nomProduit, other.nomProduit)
				&& numeroLot == other.numeroLot && quantite == other.quantite && Objects.equals(unite, other.unite)
				&& Float.floatToIntBits(volume) == Float.floatToIntBits(other.volume);
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public int getIdColis() {
		return idColis;
	}

	public int getQuantite() {
		return quantite;
	}

	public String getUnite() {
		return unite;
	}

	public float getVolume() {
		return volume;
	}

	public Date getDlu() {
		return dlu;
	}

	public String getFormeDosage() {
		return formeDosage;
	}

	public String getClasseTherapeutique() {
		return classeTherapeutique;
	}

	public String getDci() {
		return dci;
	}

	public int getNumeroLot() {
		return numeroLot;
	}
	

}
