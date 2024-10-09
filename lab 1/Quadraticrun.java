import java.lang.Math;
import java.util.Scanner;
class Quadratic
{
	int a,b,c;
	double r1,r2,d;
        
	void geteq()
	{
                System.out.println("Akul J S USN:1BM23CS023");
		System.out.println("Enter the value of a, b and c \n");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	}
	
	void calculate()
	{
		if(a==0)
		{
			System.out.println("Not a quadratic equation \n");
		}
		else{
			d=(b*b)-(4*a*c);
		}
		if(d>0)
		{
			System.out.println("Roots are real and distinct \n");
			r1=((-b) + (Math.sqrt(d)))/(double)(2*a);
			r2=((-b) - (Math.sqrt(d)))/(double)(2*a);
			System.out.println("R1= \t" + r1 +"\n");
			System.out.println("R2= \t" + r2 +"\n");
		}
		if(d==0)
		{
			System.out.println("Roots are real and equal \n");
			r1=((-b)/(double)(2*a));
			r2=r1;
			System.out.println("R1= \t" + r1 +"\n");
			System.out.println("R2= \t" + r2 +"\n");
		}
		if(d>0)
		{
			System.out.println("Roots are distinct and imaginary \n");
			r1=((-b) + (Math.sqrt(-d)))/(double)(2*a);
			r2=((-b) - (Math.sqrt(-d)))/(double)(2*a);
			System.out.println("R1= \t" + r1 +"\n");
			System.out.println("R2= \t" + r2 +"\n");
		}
	
	}

}

class Quadraticrun{
	public static void main(String a[])
	{
		Quadratic Q= new Quadratic();
		Q.geteq();
		Q.calculate();
	}
}


