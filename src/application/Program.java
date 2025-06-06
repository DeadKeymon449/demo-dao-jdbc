package application;

import java.util.Date;
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
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) { 
			System.out.println(obj);
		}
		
		System.out.println("\n===> TEST 3: Seller findAll <===");
		list = sellerDao.findAll();
		for (Seller obj : list) { 
			System.out.println(obj);
		}
		
//		System.out.println("\n===> TEST 4: Seller insert <===");
//		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0d, department);
//		sellerDao.insert(newSeller);
//		System.out.println("Inserted new ID = " + newSeller.getId());
		
		System.out.println("\n===> TEST 5: Seller update <===");
		seller = sellerDao.findById(1);
		seller.setName("DeadKeymon449");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("\n===> TEST 6: Seller deleteById <===");
		sellerDao.deleteById(18);
		System.out.println("Deleted! Check the table");
		
	}

}
