package model;

import java.util.Date;
import java.util.Objects;

public class MaterielMedical extends Materiel{
	
	private String nomProduit;
	private int idColis; 
	private int quantite;
	private String unite;
	private float volume;
	private Date dlu;
	private int numeroLot;
	
	public MaterielMedical(String nomProduit, int idColis, int quantite, String unite, float volume, Date dlu, int numeroLot) {
		this.nomProduit = nomProduit;
		this.idColis = idColis;
		this.quantite = quantite;
		this.unite = unite;
		this.volume = volume;
		this.dlu = dlu;
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
		MaterielMedical other = (MaterielMedical) obj;
		return Objects.equals(dlu, other.dlu) && idColis == other.idColis
				&& Objects.equals(nomProduit, other.nomProduit) && numeroLot == other.numeroLot
				&& quantite == other.quantite && Objects.equals(unite, other.unite)
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
	
	public int getNumeroLot() {
		return numeroLot;
	}

}
