import java.io.*;

public class Computer implements  Serializable{
    public int code;
    public String name;
    public String made;
    public String cauHinh;
    public int price;
    public boolean status;
    public Computer[] computers;
    public int count;
    public Computer(){}
    public Computer(int code,String name,String made,String cauHinh,int price,boolean status){
        this.code=code;
        this.name=name;
        this.made=made;
        this.cauHinh=cauHinh;
        this.price=price;
        this.status=status;
        this.count=0;
        this.computers = new Computer[5];
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCauHinh(String cauHinh) {
        this.cauHinh = cauHinh;
    }

    public String getCauHinh() {
        return cauHinh;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public int getCode() {
        return code;
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

    public int getCount() {
        return count;
    }

    public String getMade() {
        return made;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public void addComputerToArray(Computer computer){
        this.computers[count]=computer;
        count++;
    }
    public void addComputerToFile(String pathname,Computer computer) throws IOException {
        FileOutputStream fos = new FileOutputStream(pathname);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(computer);
    }
    public Computer getDataFromFile(String pathname) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathname));
        return (Computer) ois.readObject();
    }
    public void addComputersToFile(String pathname,Computer[] computers) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathname));
        oos.writeObject(computers);
    }
    public Computer[] getAllComputerFromFile(String pathname) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathname));
        return (Computer[]) ois.readObject();
    }

    @Override
    public String toString(){
        return "Name: "
                +getName()
                +", code: "
                +getCode()
                +", status: "
                +isStatus()
                +" and price: "
                +getPrice();
    }
}
