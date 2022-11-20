package lab7;

public class Employee 
{
  private String adi;
  private String soyadi;
  private String tc;
public Employee(String adi, String soyadi, String tc) 
{
	super();
	this.adi = adi;
	this.soyadi = soyadi;
	this.tc = tc;
}
public String getAdi() {
	return adi;
}
public void setAdi(String adi) {
	this.adi = adi;
}
public String getSoyadi() {
	return soyadi;
}
public void setSoyadi(String soyadi) {
	this.soyadi = soyadi;
}
public String getTc() {
	return tc;
}
public void setTc(String tc) {
	this.tc = tc;
}
 void write()
 {
	 System.out.println(this.adi+" "+this.soyadi+" "+this.tc);
 }}