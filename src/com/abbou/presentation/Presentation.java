package com.abbou.presentation;
import com.abbou.Dao.DaoImpl;
import com.abbou.Metier.MetierImpl;

public class Presentation {

	public static void main(String[] args) {
		DaoImpl dao= new DaoImpl(); 			//***************   Instance of Dao class 
        MetierImpl metier=new MetierImpl();		//****************	Instance of Metier class
        										// Injection des dependances par instanciation statique
        metier.setDao(dao); 
        System.out.println(metier.calcul());
		
	}

}
