import java.io.Serializable;

public class Product implements Serializable {
    public int code;
    public String name;
    public int price;
    public String madeBy;
    public Product(){}
    public Product(int code,String name,int price,String madeBy){
        this.code=code;
        this.name=name;
        this.price=price;
        this.madeBy=madeBy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getMadeBy() {
        return madeBy;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }
    @Override
    public String toString(){
        return "Ten san pham: "
                +getName()
                +", hang san xuat: "
                +getMadeBy()
                +", gia tien: "
                +getPrice()
                +" and ma: "
                +getCode();
    }
}
