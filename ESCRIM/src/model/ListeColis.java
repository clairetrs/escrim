package model;

import java.util.ArrayList;
import java.util.List;

public class ListeColis {
	
	private List<Colis> lesColis;
	private static ListeColis instance;
	
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
	
	public Colis addColis(String nature, int idColis, float volume, float cotes, String designation, String precisions) {
		
		if (findColis(idColis) == -1)
		{
			Colis colis = new Colis(nature, idColis, volume, cotes, designation, precisions);
			this.lesColis.add(colis);
			return colis;
		}
		return null;
	}
	
	public void deleteColis(int idColis) {
		int indice = findColis(idColis);
		if (indice != -1) {
			lesColis.remove(indice);
			}
	}
	
	public void updateColis(int idColis, String precisions) {}

}
