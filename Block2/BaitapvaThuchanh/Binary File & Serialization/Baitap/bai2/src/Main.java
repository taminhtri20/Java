import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Product product = new Product(1,"a",500,"aa");
        Product product1 = new Product(2,"b",1500,"aa");
        Product product2 = new Product(3,"c",2500,"aa");
        Product product3 = new Product(4,"d",3500,"aa");
        Product product4 = new Product(5,"e",4500,"aa");

        ProductProcess productProcess = new ProductProcess();

        productProcess.writeProduct("Product",product);
        productProcess.writeProduct("Product",product1);
        productProcess.writeProduct("Product",product2);
        productProcess.writeProduct("Product",product3);
        productProcess.writeProduct("Product",product4);

        Product[] listProduct = productProcess.readProduct("Product");
        System.out.println(Arrays.toString(listProduct));
    }
}