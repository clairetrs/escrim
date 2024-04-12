package model;

import java.util.Objects;

public class AutreMateriel extends Materiel{
	
	private String nomProduit;
	private int idColis; 
	private int quantite;
	private String unite;
	private float volume;
	
	public AutreMateriel(String nomProduit, int idColis, int quantite, String unite, float volume) {
		this.nomProduit = nomProduit;
		this.idColis = idColis;
		this.quantite = quantite;
		this.unite = unite;
		this.volume = volume;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutreMateriel other = (AutreMateriel) obj;
		return idColis == other.idColis && Objects.equals(nomProduit, other.nomProduit) && quantite == other.quantite
				&& Objects.equals(unite, other.unite)
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

}
