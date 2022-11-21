package Arayüz;

public class Test {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.getArea();
		r.getSides();
		r.getPerimeter(5,6,5,6);
		Square s=new Square();
        s.getSides();
        s.getPerimeter(5,6,5,6);
        Triangle t=new Triangle(5,6,7);
        t.getArea();
        t.getPerimeter(5,6,7);
        t.getSides();
}

}
