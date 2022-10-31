package zamann;

import zamann.Timee2;

public class Timetestt {

	public static void main(String[] args) {
		/*
	}
		Time1 saat = new Time1();
		saat.setTime(12,45,50);
    
	  System.out.println(saat.saat());
      saat.setTime(30, 60, 100);
      System.out.println("Set sayısı : " + Time1.getCount());
      System.out.println(Time1.count);
      System.out.println(saat.hour);
      */
		Timee2 saat2= new Timee2();
		saat2.setSaatDakika(9, 30);
		System.out.println(saat2.saat());
		Timee2 saat3=new Timee2(3,45,55);
		System.out.println(saat3.saat());
		
	}

}
