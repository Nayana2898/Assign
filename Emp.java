import java.util.Scanner;
class Employee
{   
	String name;
	int age;
	int salary;
	String job;
        Scanner sc =  new Scanner(System.in);
        	void read( )
                {
                	System.out.println("enter your name:");
                        name=sc.next();  
                        System.out.println("enter  your age:");
                        age=sc.nextInt();
                        System.out.println("enter your salary:");
                        salary=sc.nextInt();
                        System.out.println("enter your job:");
                        job=sc.next();
                }
                void display( )
                {
                        System.out.println("name:"+name+" \n age:"+age+ "\n salary:"+salary+"\n job:"+job);
                }
                void raise( )
                {
                        salary = salary+1000;
                        System.out.println("salary raised........");
                }
}
public class Emp
{
public static void main(String[] args)
{ 
	Scanner sc =  new Scanner(System.in);
        Employee e = new Employee();
	boolean b=false;
        int c;
        do
        {
        	System.out.println("\n1.Create");
                System.out.println("2.Display");
                System.out.println("3.Raise salary");
                System.out.println("4.Exit");
                System.out.println("Enter your choice");
                c=sc.nextInt();
                switch(c)
	        {
			case 1: e.read();
				b=true;
				break;
  			case 2: if(b)
				e.display();
				else System.out.println("No records...");
				break;
			case 3: if(b)
				e.raise();
				else System.out.println("No records...");
				break;
			case 4: System.out.println("Exiting...!!")
				
			default: System.out.println("Invalid Choice");
	        }
	}while(c>0 && c<4);
}
}

