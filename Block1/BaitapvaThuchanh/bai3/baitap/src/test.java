import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ma tran 2 chieu: ");
        int[][] array = {
                {0,0,0,0},
                {0,0,0,0}
        };
        for (int i=0 ; i<array.length;i++){
            for (int j=0 ; j<array[i].length;j++){
                array[i][j]=scanner.nextInt();
            }
        }
        System.out.println("nhap cot muon tinh(bat dau tu 0): ");
        int number = scanner.nextInt();
        int sum=0;
        for (int i=0 ; i<array.length;i++){
            for (int j=0 ; j<array[i].length;j++){
                if (number==j){
                    sum+=array[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
