package academy.devdojo.maratonajava.javacore.Cmethodoverload.exercises.test;

import academy.devdojo.maratonajava.javacore.Cmethodoverload.exercises.domain.GeometricShapes;

public class GeometricShapesTest {
    public static void main(String[] args) {
        GeometricShapes shape1 = new GeometricShapes();
        shape1.setName("Circle");
        System.out.println(shape1.getName());
        shape1.calculateArea(shape1.getName(), 10.0, 10.0);

        GeometricShapes shape2 = new GeometricShapes();
        shape2.setName("Rectangle");
        System.out.println(shape2.getName());
        shape2.calculateArea(shape1.getName(), 10, 10);

        GeometricShapes shape3 = new GeometricShapes();
        shape3.setName("Triangle");
        System.out.println(shape3.getName());
        shape3.calculateArea(shape3.getName(), 10.5, 20);

    }
}
