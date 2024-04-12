package model;

import java.util.ArrayList;
import java.util.List;

public class ListeMateriel {
	
	private List<Materiel> lesMateriels;
	private static ListeMateriel instance;
	
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
