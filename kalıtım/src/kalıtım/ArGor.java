package kalıtım;

public class ArGor extends AkademikPersonel
{
   protected String lab;

public ArGor(String adi, String soyadi, String tel, String unvan, String lab) 
{
	super(adi, soyadi, tel, unvan);
	this.lab = lab;
}

public String getLab() 
{
	return lab;
}

public void setLab(String lab) 
{
	this.lab = lab;
}
   
}
