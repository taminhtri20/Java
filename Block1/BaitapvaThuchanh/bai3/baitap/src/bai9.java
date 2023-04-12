public class bai9 {
    public static void main(String[] args) {
        int[] array = {7,5,2,4,8,3,2312,141,23,45,234,5,63,53,74,64,56,35,67,233,443,555,666,777,888,847,345345,34534,34534,3453453,345,232,123,213,111,231,4214,122,123,124,553,565,765,867,987,678};
        System.out.println("mang ban dau la: ");
        print(array);
        System.out.println("mang sau khi sap xep la:" );
//        bubleSort(array);
        selectionSort(array);
        print(array);
    }
    public static void print(int array[]){
        for (int i=0 ; i<array.length;i++){
            System.out.print(array[i]+ " ");
        }System.out.println();
    }
    public static void bubleSort(int array[]){
        for (int i=0 ; i< array.length-1;i++){
            for (int j=0 ; j< array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    int swap = array[j];
                    array[j]=array[j+1];
                    array[j+1]=swap;
                }
            }
        }
    }
    public static void selectionSort(int array[]){
        for (int i=0 ; i< array.length-1;i++){
            int min = i ;
            for (int j = i+1;j< array.length;j++){
                if (array[j]<array[min]){
                    int swap = array[j];
                    array[j]=array[min];
                    array[min]=swap;
                }
            }
        }
    }
}
