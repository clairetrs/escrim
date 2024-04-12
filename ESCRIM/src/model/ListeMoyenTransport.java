package model;

import java.util.ArrayList;
import java.util.List;

public class ListeMoyenTransport {
	
	private List<MoyenTransport> lesTransports;
	private static ListeMoyenTransport instance;
	
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
	
	public MoyenTransport addMoyenTransport(String nom, float chargeMax, float volumeUtilisable, int longueurPiste,  int porteeCharge, int rayonAction, int vitesseDeCroisiere, float consommationCarburant, String positionPalettes) {
		if (findMoyenTransport(nom) == -1)
		{
			MoyenTransport moyenTransport = new MoyenTransport(nom, chargeMax, volumeUtilisable, longueurPiste, porteeCharge, rayonAction, vitesseDeCroisiere, consommationCarburant, positionPalettes);
			this.lesTransports.add(moyenTransport);
			return moyenTransport;
		}
		return null;
	}
	
	public MoyenTransport addMoyenTransport(String nom, float chargeMax, float volumeUtilisable, int longueurPiste,  int porteeCharge, int rayonAction, int vitesseDeCroisiere, float consommationCarburant) {
		if (findMoyenTransport(nom) == -1)
		{
			MoyenTransport moyenTransport = new MoyenTransport(nom, chargeMax, volumeUtilisable, longueurPiste, porteeCharge, rayonAction, vitesseDeCroisiere, consommationCarburant);
			this.lesTransports.add(moyenTransport);
			return moyenTransport;
		}
		return null;
	}
	
	public void deleteMoyenTransport(String nom) {
		int indice = findMoyenTransport(nom);
		if (indice != -1) {
			lesTransports.remove(indice);
			}
	}
	
	public void updateMoyenTransport() {}
	
}
