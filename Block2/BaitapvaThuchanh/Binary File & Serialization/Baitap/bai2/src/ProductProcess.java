import java.io.*;

public class ProductProcess {
    private Product[] products;
    private int count;
    public ProductProcess(){
        this.products = new Product[5];
        count=0;
    }
    public boolean writeProduct(String filename,Product product) throws IOException {
        this.products[count++]=product;
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this.products);
        return true;
    }

    public Product[] readProduct(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Product[] listProduct = (Product[]) ois.readObject();
        return listProduct;
    }
}
