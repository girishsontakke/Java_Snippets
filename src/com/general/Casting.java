package general;

public class Casting {
    public static void main(String[] args) {
        //Implicit Casting
        // byte > short > int > long > float > double

        short a= 2;
        int b = a+1;
        System.out.println(b);

        // Explicit casting
        double x = 1.1 ;
        int y = (int) x + 2;
        System.out.println(y);

        String p = "1.1";
        int q = (int)Float.parseFloat(p)+2;
        System.out.println("q = " + q);
    }
}
