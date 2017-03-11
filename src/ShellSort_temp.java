public class ShellSort_temp {
    private static int[] array = {241, 609, 100, 441, 511, 863, 243, 112, 823, 316};
    private static int length = array.length;
    public static void main(String[] args) {
        //PUT YOUR CODE HERE
        display();
        int[] d = {5, 3, 1};
        int d_lenght = d.length;
        int j, x;
        for(int k = 0; k < d_lenght; k++){
            System.out.println("d[k] - " + d[k]);
            display();
            for(int i = d[k]; i < length; i=i+d[k]){
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

    static private void display(){
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}        
		
      