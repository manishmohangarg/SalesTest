package co.demo.salestools;

public class Main 
{
public static void main(String[] args) {
	SalesData data=new SalesData();
	displayGreeting();
	data.display();
	}
	private static void displayGreeting()
	{
		System.out.println("Hello! Happy sales People.");
		System.out.println("This will display sales data");

}
}
