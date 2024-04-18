package model;

import java.util.ArrayList;
import java.util.List;

public class ListeMoyenTransport {
	
	private List<MoyenTransport> lesTransports;
	private static ListeMoyenTransport instance;
	
	/**
	 *Constructeur (privé). 
	 */
	private ListeMoyenTransport() {
		this.lesTransports = new ArrayList<MoyenTransport>();
	}

	public static ListeMoyenTransport getInstance() 
	{
		if(instance == null) 
		{
			instance = new ListeMoyenTransport();
		}
		return instance;
	}
	
	/**
	   * Retrouve si un MoyenTransport appartient à lesTransports à partir de son nom, et renvoie l'indice dans lesTransports auquel il se trouve.
	   * Si le MoyenTransport n'appartient pas à lesTransports, renvoie -1. 
	   * 
	   * @param nom 		Le nom du MoyenTransport à retrouver
	   * @return int
	   */
	public int findMoyenTransport(String nom) {
		for (int i = 0; i < lesTransports.size(); i++)
		{
			if (lesTransports.get(i).getNom().equals(nom))
			{
				return i;
			}
		}
		return -1;
	}
	
	/**
	   * Ajoute un MoyenTransport à lesTransports si son nom n'apparaît pas déjà dedans. 
	   * 
	   * @param nom 						Le nom du MoyenTransport à ajouter
	   * @param chargeMax 					La chargeMax du MoyenTransport à ajouter
	   * @param volumeUtilisable 			Le volumeUtilisable du MoyenTransport à ajouter
	   * @param longueurPiste 				La longueurPiste du MoyenTransport à ajouter
	   * @param porteeCharge 				La porteeCharge du MoyenTransport à ajouter
	   * @param rayonAction 				Le rayonAction du MoyenTransport à ajouter
	   * @param vitesseDeCroisiere 			La vitesseDeCroisiere du MoyenTransport à ajouter
	   * @param consommationCarburant 		La consommationCarburant du MoyenTransport à ajouter
	   * @param positionPalettes 			La positionPalettes du MoyenTransport à ajouter
	   * @return void
	   */
	public void addMoyenTransport(String nom, float chargeMax, float volumeUtilisable, int longueurPiste,  int porteeCharge, int rayonAction, int vitesseDeCroisiere, float consommationCarburant, String positionPalettes) {
		if (findMoyenTransport(nom) == -1)
		{
			MoyenTransport moyenTransport = new MoyenTransport(nom, chargeMax, volumeUtilisable, longueurPiste, porteeCharge, rayonAction, vitesseDeCroisiere, consommationCarburant, positionPalettes);
			this.lesTransports.add(moyenTransport);
		}
	}
	
	/**
	   * Ajoute un MoyenTransport à lesTransports si son nom n'apparaît pas déjà dedans. La positionPalettes est initialisée à null.
	   * 
	   * @param nom 						Le nom du MoyenTransport à ajouter
	   * @param chargeMax 					La chargeMax du MoyenTransport à ajouter
	   * @param volumeUtilisable 			Le volumeUtilisable du MoyenTransport à ajouter
	   * @param longueurPiste 				La longueurPiste du MoyenTransport à ajouter
	   * @param porteeCharge 				La porteeCharge du MoyenTransport à ajouter
	   * @param rayonAction 				Le rayonAction du MoyenTransport à ajouter
	   * @param vitesseDeCroisiere 			La vitesseDeCroisiere du MoyenTransport à ajouter
	   * @param consommationCarburant 		La consommationCarburant du MoyenTransport à ajouter
	   * @return void
	   */
	public void addMoyenTransport(String nom, float chargeMax, float volumeUtilisable, int longueurPiste,  int porteeCharge, int rayonAction, int vitesseDeCroisiere, float consommationCarburant) {
		if (findMoyenTransport(nom) == -1)
		{
			MoyenTransport moyenTransport = new MoyenTransport(nom, chargeMax, volumeUtilisable, longueurPiste, porteeCharge, rayonAction, vitesseDeCroisiere, consommationCarburant);
			this.lesTransports.add(moyenTransport);
		}
	}
	
	/**
	   * Supprime un MoyenTransport de lesTransports si son nom apparaît dedans. 
	   * 
	   * @param nom 						Le nom du MoyenTransport à supprimer
	   * @return void
	   */
	public void deleteMoyenTransport(String nom) {
		int indice = findMoyenTransport(nom);
		if (indice != -1) {
			lesTransports.remove(indice);
			}
	}
	
	public void updateMoyenTransport() {}
	
}
