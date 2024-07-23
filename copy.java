class copy
{
	int t,q;
	//int temp;
	copy(int x,int y)   
  {
  	t=x;
  	q=y;
	 System.out.println("x... ="+x);
	 System.out.println("y... ="+y);
  }
  copy(copy s3)
  {
	 System.out.println("x... ="+s3.t);
	 System.out.println("y... ="+s3.q);

  }
}

class xyz_main
{
   public static void main(String ar[])
   {
   	 copy s1=new copy(10,20);
   	 copy s2 = new copy(s1);
   }
}