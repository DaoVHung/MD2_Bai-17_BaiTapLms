import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manage manage = new Manage();
        List<Product> products = new ArrayList<>();
        try {
            products.add(new Product(1, "Zambon", "Gent", 20000, ""));
            products.add(new Product(2, "Sting", "King", 20000, ""));
            products.add(new Product(3, "RedBull", "Redbull", 32000, ""));
            products.add(new Product(4, "Pencil", "GentMaker", 12000, ""));
            manage.addProductByList("manage.txt", products);
            List<Product> dataFromFile = manage.showProduct("manage.txt");
            for (Product product :
                    dataFromFile) {
                System.out.println(product);
            }
            manage.findInformation(dataFromFile, 2);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }
}