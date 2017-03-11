public class BinarySearch {

    public static void main(String[] args) {

        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;

        // PUT YOUR CODE HERE
        int start = 0;
        int finish = data.length - 1;
        int j, result = -1;

        while((finish - start) > 1){
            j = (finish + start)/2;
//            System.out.println(data[j] + " start - " + start + " finish - " + finish);
            if(data[j] > numberToFind) {
                finish = j;
            }
            else if (data[j] < numberToFind) {
                start = j;
            }
            else {
                result = j;
                break;
            }
        }
        System.out.println(result);
        // PUT YOUR CODE HERE
    }
}
  