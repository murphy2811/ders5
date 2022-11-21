package Polimorfizm;

public class Main {

	public static void main(String[] args) {
		Employee Ahmet=new Employee("Ahmet","Mehmet");
		Employee Hasan=new Employee("Hasan","Hüseyin",6500);
		Employee Leyla=new Engineer("Leyla","Mecnun");
		Employee Ali=new Engineer("Ali","Mecnun");
		Employee Yasar=new Engineer("Yasar","Yasamaz");
		Ahmet.info();
		Hasan.info();
		Leyla.info();
		Yasar.info();

	}

}
