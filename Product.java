package assignment_45;

import java.util.Scanner;

public class Product implements Taxable{
	int pId;
	double price;
	int quantity;

	public Product()
	{}
	public void accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter product id:");
		pId=s.nextInt();
		System.out.println("Enter price:");
		price=s.nextDouble();
		System.out.println("Enter product quantity :");
		quantity=s.nextInt();
		}
	public void calcTax()
	{
		double amount=price*quantity;
		double tax=amount*salesTax;
		System.out.println("Total payable tax: "+tax);
		}
}
