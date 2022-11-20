package kalıtım;

public class AkademikPersonel extends ComunityMember
{
   protected String unvan;

public AkademikPersonel(String adi, String soyadi, String tel, String unvan) 
{
	super(adi, soyadi, tel);
	this.unvan = unvan;
}

public void giris()
{
	System.out.println(getUnvan()+" giris yapti...");
}
public String getUnvan() 
{
	return unvan;
}

public void setUnvan(String unvan) 
{
	this.unvan = unvan;
}
public String cikis()
{
	  return "Guney kapisindna cikis yapti";
}
}