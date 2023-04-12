public class FindMaxScore {
    public static void main(String[] args) {
        int array[] = {5,6,7,8,9,10};
        System.out.println(findMaxScore(array));
    }
    public static int findMaxScore(int[] array){
        int max=0;
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
}
