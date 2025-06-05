package application;

import java.util.List;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDAO sellerDao = DAOFactory.createSellerDao();
		
		System.out.println("===> TEST 1: Seller findById <===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n===> TEST 2: Seller findByDepartment <===");
		List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
		for (Seller obj : list) { 
			System.out.println(obj);
		}
		
		System.out.println("\n===> TEST 3: Seller findAll <===");
		list = sellerDao.findAll();
		for (Seller obj : list) { 
			System.out.println(obj);
		}
	}

}
