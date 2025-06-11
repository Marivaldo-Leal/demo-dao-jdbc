package program;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("\n==== findById ====\n");
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);


        System.out.println("\n==== findByDepartment ====\n");
        Department d = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(d);
        for (Seller s : list) {
            System.out.println(s);
        }

        System.out.println("\n==== findAll ====\n");
        list = sellerDao.findAll();
        for (Seller s : list) {
            System.out.println(s);
        }

        System.out.println("\n==== Insert ====\n");
        sellerDao.insert(seller);
        System.out.println(seller);

    }
}
