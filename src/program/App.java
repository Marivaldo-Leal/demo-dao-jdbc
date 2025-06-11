package program;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.util.List;

public class App {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("\n=== TEST 1: findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> sellersByDept = sellerDao.findByDepartment(department);
        for (Seller s : sellersByDept) {
            System.out.println(s);
        }

        System.out.println("\n=== TEST 3: findAll ===");
        List<Seller> allSellers = sellerDao.findAll();
        for (Seller s : allSellers) {
            System.out.println(s);
        }

        System.out.println("\n=== TEST 4: insert ===");
        // Usar um novo Seller real aqui, este só serve de exemplo
        Seller newSeller = new Seller(null, "João Teste", "joao@test.com", LocalDate.now(), 3000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n=== TEST 5: update ===");
        Seller sellerToUpdate = sellerDao.findById(1);
        sellerToUpdate.setName("Nome Atualizado");
        sellerDao.update(sellerToUpdate);
        System.out.println("Update completed");
    }
}
