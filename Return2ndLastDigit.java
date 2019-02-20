package wipro.day3;

import java.util.Scanner;
/*import java.math.*;*/
public class Return2ndLastDigit {
public static void main(String[] args) {
	System.out.println("Enter a no.");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	//n=n>0?n:Math.abs(n);
	System.out.println(return2Last(n));
	
}
public static int return2Last(int n) {
	// TODO Auto-generated method stub
	if(n<0)
		return -1;
	else {
	for(int i=Math.abs(n),j=1;i>0;i=i/10,j++)
	{
		int d=i%10;
		if(j==2)
			return d;
	}
	}
return -1;
}
}
