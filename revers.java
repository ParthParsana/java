class revers 
{
    public static void main(String x[])

   {
       int reminder,reverse=0,a=123;
	   
	   while(a!=0)
	   {
	      reminder=a%10;
		  reverse=reverse*10+reminder;
		  a=a/10;
	   }
	      System.out.println("REVERSE NUMBER = "+reverse);
   }

}