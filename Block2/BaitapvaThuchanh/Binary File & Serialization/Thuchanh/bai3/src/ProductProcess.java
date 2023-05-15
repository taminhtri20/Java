import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductProcess {
    private Product[] products;
    private int count;
    public ProductProcess(){
        products = new Product[2];
        count = 0;
    }
    public boolean writeObjectData(Product objProduct, String fileName) {
        this.products[count++] = objProduct;

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {

            out.writeObject(this.products);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Product[] readObjectData(String fileName) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            Product[] products = (Product[]) in.readObject();
            return products;
        } catch (EOFException e) {
            // Reached end of file, do nothing
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
