//Write your Shape class here
public class Shape

{

   public static final double PI = 3.14;

   private int radius;

   

   public Shape(int aRadius)

   {

      radius = aRadius;

   }


   public double circleArea()

   {

      double area = PI * radius * radius;

      return area;

   }

}

//Tests
new Shape(8).circleArea()
new Shape(1).circleArea()
new Shape(0).circleArea()
new Shape(26).circleArea()