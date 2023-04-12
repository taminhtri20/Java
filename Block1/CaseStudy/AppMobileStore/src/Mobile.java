public class Mobile {
    private int codePhone,length,width,thickNess,battery;
    private String madeBY,color;
    public Mobile(){
        this.madeBY="Nokia";
        this.color="blue";
        this.width=30;
        this.length=60;
        this.thickNess=1;
        this.battery=10;
    }
    public Mobile(String madeBY){
        this();
        this.madeBY=madeBY;
    }
    public Mobile(String color,int length ,int width,int thickNess,int battery){
        this();
        this.color=color;
        this.length=length;
        this.width=width;
        this.thickNess=thickNess;
        this.battery=battery;
    }
    public Mobile(int codePhone){
        this();
        this.codePhone=codePhone;
    }
    public Mobile(String madeBY,String color){
        this();
        this.madeBY=madeBY;
        this.color=color;
    }
    public Mobile(String madeBY,String color,int codePhone,int length,int width,int thickNess,int battery){
        this();
        this.madeBY=madeBY;
        this.color=color;
        this.codePhone=codePhone;
        this.length=length;
        this.width=width;
        this.thickNess=thickNess;
        this.battery=battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        if (battery>0&&battery<101){
            this.battery = battery;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getCodePhone() {
        return codePhone;
    }

    public void setCodePhone(int codePhone) {
        this.codePhone = codePhone;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getThickNess() {
        return thickNess;
    }

    public void setThickNess(int thickNess) {
        this.thickNess = thickNess;
    }

    public String getMadeBY() {
        return madeBY;
    }

    public void setMadeBY(String madeBY) {
        this.madeBY = madeBY;
    }
    public void display(){
        System.out.println("Hãng sản xuất: "+getMadeBY()+" Màu: "+getColor()+" Pin: "+getBattery()+" Chieu dai: "+getLength()+" Chieu rong: "+getWidth()+" Độ dày: "+getThickNess()+" Mã điện thoại: "+getCodePhone());
    }
}

