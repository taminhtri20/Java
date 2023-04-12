import java.util.Scanner;

public class AppMobileStore {
    public static void main(String[] args) {
        MobileStore objMobileStore = new MobileStore();
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Add Mobile");
            System.out.println("2. Sell Mobile");
            System.out.println("3. Display Mobile");
            System.out.println("4. Search Mobile");
            System.out.println("5. Update Mobile");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    input.nextLine();
                    int n;
                    System.out.println("Nhap so dien thoai can them: ");
                    n = input.nextInt();
                    for (int i=0;i<n;i++){
                        System.out.println("Nhap codephone cua dien thoai "+(i+1)+" :");
                        int codePhone = input.nextInt();
                        Mobile objMobile = new Mobile(codePhone);
                        objMobileStore.addMobile(objMobile);
                    }
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("Nhap code phone dien thoai can xoa: ");
                    int codePhone = input.nextInt();
                    objMobileStore.sellMobile(codePhone);
                    break;
                case 3:
                    objMobileStore.displayStore();
                    break;
                case 4:
                    input.nextLine();
                    System.out.println("nhap hang dien thoai can tim: ");
                    String madeBy = input.nextLine();
                    objMobileStore.searchMobile(madeBy);
                    break;
                case  5:
                    input.nextLine();
                    System.out.println("Nhap code dien thoa update: ");
                    codePhone=input.nextInt();
                    System.out.println("ban muon nang cap: ");
                    input.nextLine();
                    System.out.println("mau sac: ");
                    String color = input.nextLine();
                    System.out.println("chieu dai: ");
                    int length = input.nextInt();
                    System.out.println("chieu rong: ");
                    int width = input.nextInt();
                    System.out.println("do day: ");
                    int thickNess = input.nextInt();
                    System.out.println("pin: ");
                    int battery = input.nextInt();
                    Mobile mobile = new Mobile(color,length,width,thickNess,battery);
                    objMobileStore.updateMobile(codePhone,mobile);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
