import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Product objProduct1 = new Product();
        objProduct1.setProId(1);
        objProduct1.setProName("Product 1");
        objProduct1.setPrice(10.0);

        Product objProduct2 = new Product(2, "Product 2", 20.0);

        ProductProcess objProductProcess = new ProductProcess();
        boolean success = objProductProcess.writeObjectData(objProduct1, "object.dat");
        success &= objProductProcess.writeObjectData(objProduct2, "object.dat");
        if (success) {
            Product[] listProduct = objProductProcess.readObjectData("object.dat");
            if (listProduct != null) {
                System.out.println(Arrays.toString(listProduct));
            } else {
                System.out.println("Error reading file.");
            }
        } else {
            System.out.println("Error writing to file.");
        }
    }
}