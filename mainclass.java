package inheritancesingle;

public class mainclass {

	public static void main(String[] args)
	{
		System.out.println("parent class properties");
		parentclass p = new parentclass();
		p.parent();
		
		
		
		System.out.println("child class properties");
		childclass c = new childclass();
		c.child();
		p.parent();
		

	}

}
