package zamann;

public class Timee2 {
	private int hour;
	private int second;
	private int minute;
	
	public Timee2()
	{
		
	}

	public Timee2(int saat) {
		this.hour=saat;
	}
	public Timee2(int saat,int dakika) {
		this.minute=dakika;
		this.hour=saat;
	}
	public Timee2(int saat,int dakika,int saniye)
	{
		this.hour = saat;
		this.second =saniye ;
		this.minute = dakika;
	
	}
	public void setSaatDakika(int saat,int dakika) {

		if(hour<0 || hour>23 || minute<0 || minute>59 ) 
	{	
			System.out.println("Yanlis saat degerlri girdiniz");
	}
		this.hour = saat;
		this.minute = dakika;
	}
	public void setSaatDakikaSaniye(int saat,int dakika,int saniye) 
	{
		if(hour<0 || hour>23 || minute<0 || minute>59 || second<0 || second>59) ;
	}
	{	
		System.out.println("Yanlis saat degerlri girdiniz");
	}
	
		public String saat()
		{
			return String.format("%02d:%02d:%02d",hour,minute,second);	
	
		
	}
}

	
		
		


