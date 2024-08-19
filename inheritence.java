

class a
{
	void disp()

	{
       System.out.println("hi....");
	}
}
class b extends a
{
	void disp1()

	{
       System.out.println("byy....");
	}
}
class c extends b
{
	void disp2()

	{
       System.out.println("goo....");
	}
}
 class c_main
{
	public static void main(String ar[])
   {
	c s=new c();
	s.disp2();
	s.disp1();
	s.disp();

   }
}
