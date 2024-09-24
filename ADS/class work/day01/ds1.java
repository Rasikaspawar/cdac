/*class Recursion1{
	
//	static void show()//it is staric because we not create object
//	{
//		System.out.println("Hi girls");
//		show();//recursion now becuase function call itself
//	}
	
//	public static void main(String []args)
//	{
//	show();
//	}
//recursive tree use karana in interview in screenshot madhe ahe te


class Recursion2{
	static int i=0;
	static void show(){
		//Static int i =0; //if we are declare static varible inside the static method always write static ,if not write static then it not to allow to access
		
			++i;
				if(i<=5)
				{
					System.out.println("hi girls!!1");
					show();
				}
		}
		
public static void main(String args[])
	{
		show();//call for method
	}
	
}*/

/*class Recursion3{
	static int fact(int n)
	{
		if(n<=1)
			return 1;
		else
			return n*fact(n-1);
	}
	public static void main(String args[]){
		System.out.println(fact(5));
	}
}*/
class Recursion4{
	static int show(int n)//recursion method
	{
		if(n==4)
			return n;
		else
			return 2*show(n+1);
	}
	public static void main(String args[])
	{
		System.out.println(show(2));
		
	}
}