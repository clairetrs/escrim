package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

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
	
	/**
	   * Ajoute un Materiel à lesMateriels si son nomProduit n'apparaît pas déjà dedans, et qu'il s'agit d'un AutreMateriel. 
	   * 
	   * @param nomProduit 			Le nomProduit du Materiel à ajouter
	   * @param idColis 			Le idColis du Materiel à ajouter
	   * @param quantite 			La quantite du Materiel à ajouter
	   * @param unite 				La unite du Materiel à ajouter
	   * @param volume 				Le volume du Materiel à ajouter
	   * @return 
	   */
	public void addMateriel(String nomProduit, int idColis, int quantite, String unite, float volume) {
		if (findMateriel(nomProduit) == -1)
		{
			Materiel materiel = new AutreMateriel(nomProduit, idColis, quantite, unite, volume);
			this.lesColis.add(colis);
		}
	}
	
	/**
	   * Ajoute un Materiel à lesMateriels si son nomProduit n'apparaît pas déjà dedans, et qu'il s'agit d'un MaterielMedical. 
	   * 
	   * @param nomProduit 			Le nomProduit du Materiel à ajouter
	   * @param idColis 			Le idColis du Materiel à ajouter
	   * @param quantite 			La quantite du Materiel à ajouter
	   * @param unite 				La unite du Materiel à ajouter
	   * @param volume 				Le volume du Materiel à ajouter
	   * @param dlu 				La dlu du Materiel à ajouter
	   * @param numeroLot 			Le numeroLot du Materiel à ajouter
	   * @return 
	   */
	public void addMateriel(String nomProduit, int idColis, int quantite, String unite, float volume, Date dlu, int numeroLot) {
		if (findMateriel(nomProduit) == -1)
		{
			Materiel materiel = new MaterielMedical(nomProduit, idColis, quantite, unite, volume, dlu, numeroLot);
			this.lesColis.add(colis);
		}
	}
	
	/**
	   * Ajoute un Materiel à lesMateriels si son nomProduit n'apparaît pas déjà dedans, et qu'il s'agit d'un Medicament. 
	   * 
	   * @param nomProduit 				Le nomProduit du Materiel à ajouter
	   * @param idColis 				Le idColis du Materiel à ajouter
	   * @param quantite 				La quantite du Materiel à ajouter
	   * @param unite 					La unite du Materiel à ajouter
	   * @param volume 					Le volume du Materiel à ajouter
	   * @param dlu 					La dlu du Materiel à ajouter
	   * @param numeroLot 				Le numeroLot du Materiel à ajouter
	   * @param formeDosage 			La formeDosage du Materiel à ajouter
	   * @param classeTherapeutique 	La classeTherapeutique du Materiel à ajouter
	   * @param dci 					Le dci du Materiel à ajouter
	   * @return 
	   */
	public void addMateriel(String nomProduit, int idColis, int quantite, String unite, float volume, Date dlu, int numeroLot, String dci, String classeTherapeutique, String formeDosage) {
		if (findMateriel(nomProduit) == -1)
		{
			Materiel materiel = new Medicament(nomProduit, idColis, quantite, unite, volume, dlu, formeDosage, classeTherapeutique, dci, numeroLot);
			this.lesColis.add(colis);
		}
	}
	
	/**
	   * Supprime un Materiel de lesMateriels si son nomProduit apparaît dedans. 
	   * 
	   * @param nomProduit 			Le nomProduit du Colis à supprimer
	   * @return void
	   */
	public void deleteMateriel(String nomProduit) {
		int indice = findMateriel(nomProduit);
		if (indice != -1) {
			lesMateriels.remove(indice);
			}
	}
	
	public void updateMateriel() {}

}
