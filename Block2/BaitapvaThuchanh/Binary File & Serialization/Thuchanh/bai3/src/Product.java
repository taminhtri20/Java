import java.io.Serializable;

public class Product implements Serializable {
    public int proId;
    public String proName;
    public double price;
    public Product(){}
    public Product(int proId,String proName,double price){
        this.proId = proId;
        this.proName = proName;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getProId() {
        return proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }
    @Override
    public String toString(){
        return "ID: "
                +getProId()
                +", Name: "
                +getProName()
                +" and price: "
                +getPrice();
    }

}
