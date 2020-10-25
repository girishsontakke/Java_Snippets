package general;

public class JavaMath {
    public static void main(String[] args) {
        float x = 1.2F;
        System.out.println(Math.floor(x));
        System.out.println(Math.ceil(x));
        System.out.println(Math.round(x));

        int result = (int)(Math.random()*100);
        System.out.println(result);
    }
}
