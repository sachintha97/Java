package iit.rectangle;

import static iit.rectangle.Rectangle.getAreaDifference;

public class RectangleTest {
    public static void main(String[] args) {
        int num = 25;
        changeNum(num);

        System.out.println(num);

        Rectangle r = new Rectangle(25);
        //changeRectangle(r);
        System.out.println(r.getLength() + r.getWidth());
    }

        public static void changeNum(int num ){
            num =25;
        }






        //Rectangle obj1 = new Rectangle(7,6);
        //Rectangle obj2 = new Rectangle(6);

        //System.out.println("Rectangle area = " + obj1.getArea());
        //System.out.println(obj2.getArea());
        //System.out.println("Rectangle perimeter = " + obj2.getPerimeter());


        //System.out.println(getAreaDifference(obj1,obj2));
    }

