package assignment_45;

public class Taxes {
	public static void main(String[] args)
	{
Employee e=new Employee();
e.accept();
e.calcTax();

Product p=new Product();
p.accept();
p.calcTax();
}
}