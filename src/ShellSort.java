public class ShellSort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        //PUT YOUR CODE HERE
        int[] d = {5, 3, 1};
        int d_lenght = d.length;
        int j, x;
        for(int k = 0; k < d_lenght; k++){
            for(int i = 1; i < length; i=i+d[k]){
                x = array[i];
                j = i - d[k];
                while (j>=0 && array[j]>x){
                    array[j+d[k]] = array[j];
                    j = j - d[k];
                }
                array[j+d[k]] = x;
            }
        }
        //PUT YOUR CODE HERE

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}        
		
      