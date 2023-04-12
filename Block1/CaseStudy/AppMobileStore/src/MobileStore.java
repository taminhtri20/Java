import java.util.ArrayList;
public class MobileStore {
    private Mobile[] mobiles;
    private int countMobile;
    public MobileStore(){
        this.mobiles = new Mobile[100];
        this.countMobile=0;
    }
    public MobileStore(int countMobile){
        this();
        this.mobiles = new Mobile[countMobile];
    }
    public boolean addMobile(Mobile mobile){
        if (countMobile>100){
            System.out.println("them that bai");
            return false;
        }
        this.mobiles[countMobile] = mobile;
        countMobile++;
        System.out.println("them thanh cong");

        return true;
    }
    public boolean sellMobile(int codePhone){
        if (countMobile<0){
            System.out.println("ban that bai");
            return false;
        }

        boolean check = false;

        for (int i=0, j=0;i<this.countMobile;i++,j++){
            if (this.mobiles[i].getCodePhone()==codePhone){
                j++;
                check = true;
            }
            if (j <= this.countMobile)
                this.mobiles[i] = this.mobiles[j];
        }

        if(check){
            countMobile--;
            this.mobiles[this.mobiles.length-1]=null;
            System.out.println("Xoa thanh cong");
        }
        return check;
    }
    public boolean updateMobile(int codePhone,Mobile mobile){
        for (int i=0;i<this.countMobile;i++){
            if (this.mobiles[i].getCodePhone()==codePhone){
                this.mobiles[i]=mobile;
                System.out.println("cap nhat thanh cong");
                return true;
            }
        }
        System.out.println("cap nhat that bai");
        return false;

    }
    public boolean searchMobile(String madeBy){
        for (int i=0;i<this.countMobile;i++){
                if (this.mobiles[i].getMadeBY().toLowerCase().contains(madeBy)){
                    this.mobiles[i].display();
                } else if (this.mobiles[i].getMadeBY().toUpperCase().contains(madeBy)) {
                    this.mobiles[i].display();
                }
        }
        return false;
    }
    public void displayStore(){
        for (int i=0;i<this.countMobile;i++){
            this.mobiles[i].display();
        }
    }

    public Mobile[] getMobiles() {
        return mobiles;
    }

    public void setMobiles(Mobile[] mobiles) {
        this.mobiles = mobiles;
    }

    public int getCountMobile() {
        return countMobile;
    }

    public void setCountMobile(int countMobile) {
        this.countMobile = countMobile;
    }
}
