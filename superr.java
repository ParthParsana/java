 class a
{
	int a=10;
	 void disp()
	 {
	  System.out.println("hello");
	}
	
}
class b extends a
{
    void disp()
	{
	  System.out.println("A= "+super.a);
	  super.disp();
	}
}
class superr
{
	public static void main(String ar[])
	{
	  b s1=new b();
	  s1.disp();
  
	}
}