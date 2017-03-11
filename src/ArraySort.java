public class ArraySort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        //PUT YOUR CODE HERE
        int temporary;
        boolean status;
        do{
            status = false;
            for (int i = 1; i < length; i++) {
                if(array[i-1]>array[i]){
                    temporary = array[i];
                    array[i]=array[i-1];
                    array[i-1]=temporary;
                    status = true;
                }
            }
        } while (status);
        //PUT YOUR CODE HERE

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
