package model;

import java.util.ArrayList;
import java.util.List;

public class ListeColis {
	
	private List<Colis> lesColis;
	private static ListeColis instance;

	/**
	 *Constructeur (privé). 
	 */
	private ListeColis() {
		this.lesColis = new ArrayList<Colis>();
	}

	public static ListeColis getInstance() 
	{
		if(instance == null) 
		{
			instance = new ListeColis();
		}
		return instance;
	}
	
	/**
	   * Retrouve si un Colis appartient à lesColis à partir de son idColis, et renvoie l'indice dans lesColis auquel il se trouve.
	   * Si le Colis n'appartient pas à lesColis, renvoie -1. 
	   * 
	   * @param idColis		Le idColis du Colis à retrouver
	   * @return int
	   */
	public int findColis(int idColis) {
		for (int i = 0; i < lesColis.size(); i++)
		{
			if (lesColis.get(i).getIdColis() == idColis)
			{
				return i;
			}
		}
		return -1;
	}
	
	/**
	   * Ajoute un Colis à lesColis si son idColis n'apparaît pas déjà dedans. 
	   * 
	   * @param nature 				La nature du Colis à ajouter
	   * @param idColis 			Le idColis du Colis à ajouter
	   * @param volume 				Le volume du Colis à ajouter
	   * @param cotes 				Les cotes  du Colis à ajouter
	   * @param designation 		La designation du Colis à ajouter
	   * @param precisions 			Les precisions du Colis à ajouter
	   * @return void
	   */
	public void addColis(String nature, int idColis, float volume, float cotes, String designation, String precisions) {
		
		if (findColis(idColis) == -1)
		{
			Colis colis = new Colis(nature, idColis, volume, cotes, designation, precisions);
			this.lesColis.add(colis);
		}
	}
	
	/**
	   * Supprime un Colis de lesColis si son idColis apparaît dedans. 
	   * 
	   * @param idColis 			Le idColis du Colis à supprimer
	   * @return void
	   */
	public void deleteColis(int idColis) {
		int indice = findColis(idColis);
		if (indice != -1) {
			lesColis.remove(indice);
			}
	}
	
	/**
	   * Met à jour un Colis de lesColis si son idColis apparaît dedans. 
	   * 
	   * @param idColis 		Le idColis du Colis à mettre à jour
	   * @param precisions		Les precisions du Colis à modifier
	   * @return void
	   */
	public void updateColis(int idColis, String precisions) {
		int indice = findColis(idColis);
		if (indice != -1)
		{
			lesColis.remove(indice);
		}
		
	}

}
