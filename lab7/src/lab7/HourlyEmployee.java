package lab7;

import lab7.Employee;

public class HourlyEmployee extends Employee
{
  private int saatlikUcret;
  private int saat;
  public int getSaatlikUcret() {
	return saatlikUcret;
}
public void setSaatlikUcret(int saatlikUcret) {
	this.saatlikUcret = saatlikUcret;
}
public int getSaat() {
	return saat;
}
public void setSaat(int saat) {
	this.saat = saat;
}
public HourlyEmployee(String adi, String soyadi, String tc, int saatlikUcret, int saat) {
	super(adi, soyadi, tc);
	this.saatlikUcret = saatlikUcret;
	this.saat = saat;
}
double hesapla()
{
	double maas = (saatlikUcret)*(saat);
	return maas;
}

void write()
{	
	super.write();
	System.out.println(getAdi()+"'nin maasi:"+hesapla());
}

}