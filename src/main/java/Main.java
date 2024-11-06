import com.cylinder.Circle;
import com.cylinder.Cylinder;
import com.developers.HRManager;
import com.developers.JuniorDeveloper;
import com.developers.MidDeveloper;
import com.developers.SeniorDeveloper;
import com.pool.Cuboid;
import com.pool.Rectangle;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());


        SeniorDeveloper seniordeveloper = new SeniorDeveloper(1, "ahmet", 3333);
        SeniorDeveloper seniordeveloper1 = new SeniorDeveloper(1, "ahmet", 3333);
        SeniorDeveloper seniordeveloper2 = new SeniorDeveloper(1, "ahmet", 3333);
        SeniorDeveloper seniordeveloper3 = new SeniorDeveloper(1, "ahmet", 3333);
        SeniorDeveloper seniordeveloper4 = new SeniorDeveloper(1, "ahmet", 3333);
        SeniorDeveloper seniordeveloper5 = new SeniorDeveloper(1, "ahmet", 3333);
        SeniorDeveloper seniordeveloper6 = new SeniorDeveloper(1, "ahmet", 3333);
        HRManager hr= new HRManager(1,"ayse",1111);
        hr.addEmployee(seniordeveloper1);
        hr.addEmployee(seniordeveloper2);
        hr.addEmployee(seniordeveloper3);
        hr.addEmployee(seniordeveloper4);
        hr.addEmployee(seniordeveloper5);
        hr.addEmployee(seniordeveloper6);


















    }
}