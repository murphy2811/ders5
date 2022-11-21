package Arayüz;

public interface Poligon {
	void getArea();
	
	default void getSides() {
		System.out.println("Poligonun Kenar Sayisi");
	}
	default void getPerimeter(int...sides) {
		int perimeter=0;
		for(int side:sides) {
			perimeter +=side;
		}
		System.out.println("Cevresi:"+ perimeter);
	}

}
