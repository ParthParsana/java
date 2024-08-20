class constructor
{
	int a;
   constructor()   //default constructor
  {
     System.out.println("hiii...");
  }
  
  constructor(int x )   //paramitrised constructor
  {
	  
     System.out.println("x... ="+x);
  }

}

 class xyz_main
{
   public static void main(String args[])
   
   {
      constructor s1 = new constructor();
	  constructor s2 = new constructor(100);
   }
}
