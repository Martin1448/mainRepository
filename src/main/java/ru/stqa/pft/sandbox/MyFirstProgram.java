package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("World");
        hello("User");
        hello("Vladislav");

        Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(4, 6);
		System.out.println("Площадь треугольника со сторонами " + r.a +" и " + r.b + " = " + r.area());


		Point dist = new Point(-1.25, 2.35);
		System.out.println("Дистанция от точки " + dist.p1 + " до точки " + dist.p2 +  " = "  + dist.distance());


    }

    public static void hello(String somebody) {

        System.out.println("Hello," + somebody + "!");

    }

}

