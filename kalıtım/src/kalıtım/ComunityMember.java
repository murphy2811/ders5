package kalıtım;

public class ComunityMember {

	protected String Adi,Soyadi;
	String tel;
	public ComunityMember(String Adi, String Soyadi, String tel) {
		
		this.Adi = Adi;
		this.Soyadi = Soyadi;
		this.tel = tel;
	}
	public void giris() {
		
		System.out.println("giris yapti...");
	}
	
	public String getAdi() {
		return Adi;
	}
	public void setAdi(String Adi) {
		Adi = Adi;
	}
	public String getSoyadi() {
		return Soyadi;
	}
	public void setSoyadi(String Soyadi) {
		Soyadi = Soyadi;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
