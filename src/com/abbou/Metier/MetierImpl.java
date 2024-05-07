package com.abbou.Metier;

import com.abbou.Dao.IDao;

public class MetierImpl implements IMetier{
	private IDao dao;
	public double calcul() {
		double c= dao.getData();
		return c;
	}
	
	public void setDao(IDao i) {
		this.dao=i;
	}
}
