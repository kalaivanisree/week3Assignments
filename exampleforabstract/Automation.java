package exampleforabstract;

public class Automation extends MultipleLangauge{

	public void Selenium()
	{
		System.out.println("Selenium Class");
	}
	
	public void Java()
	{
		System.out.println("Java Class");
	}
	
	@Override
	public  void ruby()
	{
		System.out.println("Ruby Class");
	}
	
	public static void main(String[] args) {
		Automation at=new Automation();
		at.Selenium();
		at.ruby();
		at.python();
		at.Java();
		
	}

}
