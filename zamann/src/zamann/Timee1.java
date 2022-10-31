package zamann;

public class Timee1
    {

	public int hour ;
	private int minute;
	private int second;
	public static int count=0;
	public void setTime(int hour,int minute,int second)
	{
		
		if(hour<0 || hour>23 || minute<0 || minute>59 || second<0 || second>59) 
	{	
			System.out.println("Yanlis saat degerlri girdiniz");
		
	}
		this.hour=hour;
		this.minute=minute;
		this.second=second;
		
		
		
	}
	public String saat() 
	{
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
	public static String getCount() {
		
		return null;
	}
	
 }