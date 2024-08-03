class pelendrom
{
    public static void main(String x[])

   {
       int temp,reminder,reverse=0,a=121;
	   temp=a;
		while(a!=0)
	   {
	      reminder=a%10;
		  reverse=reverse*10+reminder;
		  a=a/10;
	   }
	      System.out.println("REVERSE NUMBER = "+reverse);
   
		if (temp==reverse)
      {
	    System.out.println("IT IS PELENDROM");
	  }
		else
      {
	    System.out.println("IT IS NOT PELENDROM");
	  }  
   }
}