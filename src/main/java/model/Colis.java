package model;

import java.util.Objects;

public class Colis {
	
	private String nature;
	private int idColis;
	private float volume;
	private float cotes;
	private String designation;
	private String precisions;
	
	public Colis(String nature, int idColis, float volume, float cotes, String designation, String precisions) {
		this.nature = nature;
		this.idColis = idColis;
		this.volume = volume;
		this.cotes = cotes;
		this.designation = designation;
		this.precisions = precisions;
	}
	
	public Colis(String nature, int idColis, float volume, float cotes, String designation) {
		this.nature = nature;
		this.idColis = idColis;
		this.volume = volume;
		this.cotes = cotes;
		this.designation = designation;
		this.precisions = null;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Colis other = (Colis) obj;
		return Float.floatToIntBits(cotes) == Float.floatToIntBits(other.cotes)
				&& Objects.equals(designation, other.designation) && idColis == other.idColis
				&& Objects.equals(nature, other.nature) && Objects.equals(precisions, other.precisions)
				&& Float.floatToIntBits(volume) == Float.floatToIntBits(other.volume);
	}

	public String getNature() {
		return nature;
	}
	
	public int getIdColis() {
		return idColis;
	}
	
	public float getVolume() {
		return volume;
	}
	
	public float getCotes() {
		return cotes;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public String getPrecisions() {
		return precisions;
	}

}
