package Javaprograms;
class Runtime{
	void login()
	{
		System.out.println("Login with Mobile Number");
	}
}

public class RunTimePoly_55 extends Runtime {
	void login()
	{
		System.out.println("Login with mail id");
		//super.login();
	}

	public static void main(String[] args) {
		RunTimePoly_55 p1=new RunTimePoly_55();
		p1.login();
		new Runtime().login();
		
	}

}