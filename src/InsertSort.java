public class InsertSort {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        //PUT YOUR CODE HERE
        int x;
        int j;
        for (int i=1; i<length; i++){
            x = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > x){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = x;
        }

        //PUT YOUR CODE HERE

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
