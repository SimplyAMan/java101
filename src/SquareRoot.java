public class SquareRoot {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;

        //PUT YOUR CODE HERE
        double x1;
        double x2;
        if (a == 0) {
            if (b == 0) {
                System.out.println("x1=");
                System.out.println("x2=");
            }
            else if (c == 0){
                System.out.println("x1="+0.0);
                System.out.println("x2="+0.0);
            }
            else {
                x1 = x2 = -c / b;
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            }
        }
        else if (c == 0){
                System.out.println("x1 = 0");
                if (a == 0){
                    System.out.println("x2=");
                }
                else {
                    System.out.println("x2=" + -b/a);
                }
            }
        else if (b == 0){
            if (a == 0) {
                System.out.println("x1=");
                System.out.println("x2=");
            }
            else{
                if (-c/a <  0){
                    System.out.println("x1=");
                    System.out.println("x2=");
                }
                else{
                    System.out.println("x1=" + Math.sqrt(-c/a));
                    System.out.println("x2=" + Math.sqrt(-c/a));
                }
            }
        }
        else{
            double D = b*b - 4 * a * c;
            if (D > 0) {
                System.out.println("x1=" + (-b + Math.sqrt(D))/(2*a));
                System.out.println("x2=" + (-b - Math.sqrt(D))/(2*a));
            }
            else if (D == 0) {
                System.out.println("x1=" + -b/(2*a));
                System.out.println("x2=" + -b/(2*a));
            }
            else {
                System.out.println("x1=");
                System.out.println("x2=");
            };
        }
        //PUT YOUR CODE HERE
    }
}