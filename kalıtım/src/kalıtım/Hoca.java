package kalıtım;
public class Hoca extends AkademikPersonel
{
   protected String ders;

public Hoca(String adi, String soyadi, String tel, String unvan, String ders) 
{
	super(adi, soyadi, tel, unvan);
	this.ders = ders;
}

public String getDers() 
{
	return ders;
}

public void setDers(String ders) 
{
	this.ders = ders;
}
public String cikis()
{
	  return "Guney kapisindna cikis yapti";
}
}




	


