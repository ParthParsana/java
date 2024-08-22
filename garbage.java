class a
{
	void finalized()
	{
		System.out.println("Delete");
	}
}

class garbage
{
		public static void main(String a[])
		{
			a s1=new a();
			s1.finalized();
			s1= null;
			System.gc();
			
		}
}
