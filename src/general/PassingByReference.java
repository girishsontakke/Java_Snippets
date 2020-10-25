package general;

import java.awt.*;

public class PassingByReference {
    public static void main(String[] args) {
        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x = 3;
        System.out.println(point2);
    }

}
