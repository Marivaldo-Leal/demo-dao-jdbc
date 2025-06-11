package program;

import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {

        Department d = new Department(1, "Electronics");
        Seller seller = new Seller(
                1,
                "mario",
                "mario@gmail.com",
                LocalDate.parse("01/01/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                2500.00,
                d
        );

        System.out.println(seller);
    }
}
