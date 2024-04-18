package model;

import java.util.ArrayList;
import java.util.List;

public class ListeMateriel {
	
	private List<Materiel> lesMateriels;
	private static ListeMateriel instance;
	
	/**
	 *Constructeur (privé). 
	 */
	private ListeMateriel() {
		this.lesMateriels = new ArrayList<Materiel>();
	}

	public static ListeMateriel getInstance() 
	{
		if(instance == null) 
		{
			instance = new ListeMateriel();
		}
		return instance;
	}
	
	/**
	   * Retrouve si un Materiel appartient à lesMateriels à partir de son nomProduit, et renvoie l'indice dans lesMateriels auquel il se trouve.
	   * Si le materiel n'appartient pas à lesMateriels, renvoie -1. 
	   * 
	   * @param nomProduit 		Le nomProduit du Materiel à retrouver
	   * @return int
	   */
	public int findMateriel(String nomProduit) {
		for (int i = 0; i < lesMateriels.size(); i++)
		{
			if (lesMateriels.get(i).getNomProduit().equals(nomProduit))
			{
				return i;
			}
		}
		return -1;
	}
	
	public void addMateriel() {}
	public void deleteMateriel() {}
	public void updateMateriel() {}

}
