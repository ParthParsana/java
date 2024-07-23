class exceptions
{
	public static void main(String ar[])
	{
	   int a=10,b=0,c;
       int j[]={10,20,30};
	try
		{
     		 c=a/b;
	  		 System.out.println("c :"+c);

	  		 System.out.println(j[4]);
		}
	catch(Exception x)
		{
     	  System.out.println("Divide by zero not possible in Maths........");
		
     	  
		}
		catch(ArrayIndexOutOfBoundsException s)
		{
		   System.out.println("value not valid");
		}
	}
}
