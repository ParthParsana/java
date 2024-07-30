class a
{
   void disp()   
  {
     System.out.println("hi...");
  }
  
  void disp(int x )   
  {
	  
     System.out.println("x... ="+x);
  }

}

 class xyz
{
   public static void main(String ar[])
   
   {
      a s1=new a();
      s1.disp();
      s1.disp(9);
   }
}