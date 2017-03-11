public class MatrixPrint {
    public static void main(String args[]){
        //PUT YOUR CODE HERE
        String[][] matrix = {
                        {" *"," 2"," 3"," 4"," *"},
                        {" 6"," *"," 8"," *","10"},
                        {"11","12"," *","14","15"},
                        {"16"," *","18"," *","20"},
                        {" *","22","23","24"," *"}};
        for(int i = 0;i<5;i=i+1){
            System.out.println(
                    matrix[i][0] + " " + matrix[i][1] + " " + matrix[i][2] + " " + matrix[i][3] + " " + matrix[i][4] + " "
            );
        }
        //PUT YOUR CODE HERE
    }
}
      
      