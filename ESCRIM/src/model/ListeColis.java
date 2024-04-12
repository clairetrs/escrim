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
	
	public void addColis() {}
	public void deleteColis(int idColis) {}
	public void updateColis() {}

}
