package ru.job4j.pseudo;

public class Paint {
    public static void main(String[] args) {
        Paint painter = new Paint();
        Square square = new Square();
        Triangle triangle = new Triangle();

        painter.draw(square);
        painter.draw(triangle);
    }

    public void draw(Shape shape){
        System.out.println(shape.draw());
    }

}
