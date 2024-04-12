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
	
	public void addMoyenTransport() {}
	public void deleteMoyenTransport() {}
	public void updateMoyenTransport() {}

}
