package com.abbou.extension;
import com.abbou.Dao.*;
public class ExtDaoImp implements IDao {
	double data;
	@Override
	public double getData() {
		data=101; 
        System.out.println("extension de l'implementation Dao capter");
		return data;
	}

	
}
