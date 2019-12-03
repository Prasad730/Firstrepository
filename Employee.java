package assignment_45;

import java.util.Scanner;

public class Employee implements Taxable{
int empId;
String name;
double salary;

public Employee()
{}
public void accept()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Employee id:");
	empId=s.nextInt();
	System.out.println("Enter name:");
	name=s.next();
	System.out.println("Enter Salary of employee:");
	salary=s.nextDouble();
	}
public void calcTax()
{
	double Incometax=salary*incomeTax;
	System.out.println("Income tax applicable on your salary is: "+Incometax);
	}
}
