package model.dao;

import model.dao.impl.SellerDAOJDBC;

public class DAOFactory {
	
	public static SellerDAO createSellerDao() { 
		return new SellerDAOJDBC();
	}
}
