package Polimorfizm;

public class Employee {

	protected String ayrac ="-------------------------------";
	protected String name,surname,job;
	protected int salary,annualPermit;
	
	protected Employee(String name, String surname) {
		
		this.name = name;
		this.surname = surname;
		this.job="Calisan";
		this.salary=5500;
		this.annualPermit=10;
		
	}
	protected Employee(String name, String surname, int salary) {
		
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.annualPermit=10;
		if(salary>6000)
		{
			this.job="Kidemli Calisan";
			annualPermit+=3;
		}
		else if(salary>0 && salary<=6000)
		{
			this.job="Çalışan";
		}
		else 
		{
			this.job="Stajer";
			annualPermit=0;
		}
	}
	protected Employee() {
		
	}
	public int makeRaise(int howmuch) {
		salary+=howmuch;
		return salary;
	}
	public int makeRaise(double howmuch) {
		double money=(double)salary*howmuch;
		makeRaise((int)money);
		return salary;
		
		
	}
	public void setJob(String job) {
		this.job=job;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
    public void SetAnnualPermit(int annualpermit) {
	    this.annualPermit=annualpermit;
    }
    public String getJob() {
    	return job;
    }
    public int getSalary() {
    	return salary;
    }
    public int getAnnualPermit() {
    	return annualPermit;
    }
    public void info() 
    {
    	System.out.println(getJob()+ " Bilgileri \n"+ayrac+"Calisan ismi: "+ name+ "\nCalisan Soyismi :"+surname+ " \n Görevi:"+getJob()
    +"\n Maasi:"+ getSalary()+"\n İzin günü: "+getAnnualPermit()+"İş günü \n"+ayrac);
    }
    public void raiseinfo() {
    	System.out.println(getJob()+"Zam Uygulaması \n"+ayrac+"\n Yeni Verilecek Maaş: "+getSalary()+"\n"+ayrac);
    }
}
