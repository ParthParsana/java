class all

{
   void hii()    
    {
	   System.out.println("hii....");
	}
	
	void add()
	{
	   int a=10,b=20,c;
		c=a+b;
        System.out.println("C :"+c);
    }
	
	void posneg()
   
   {
      int a=-10;
	  
	  if (a==-10)
	    {
	      System.out.println("a is Negative");
	    }
	 else
	    {
	      System.out.println("a is Positive");
	    }
   }
   
    void even()
   {
      int a=10;
	  
	  if (a%2==0)
	    {
	      System.out.println("a is even");
	    }
	 else
	    {
	      System.out.println("a is odd");
	    }
   }
   
   
      void elseif()
   
   {
		   int time = 5;
		   
		   if (time < 10 )
		   {
			   System.out.println("Good Morning");
		   }
		   else if(time < 15)
		   {
			   System.out.println("Good Afternoon");
		   }
		   else if(time <20 )
		   {
			   System.out.println("Good Evening");
		   }
		   else 
		   {
			   System.out.println("Good Night");
		   }
	}
		
	void forloop()	
		
	{
	   for (int i = 0;i <= 10;i = i+2)
	    
		{
		   System.out.println(i);
		
		}
	}
	
	void whileloop()
	{
	   int i=0;
	     while(i<5)
		{
		   System.out.println(i);
		   i++;
		}
	}
	
	
	void doloop()
	{
	   int i=0;
	    
		do {
		   System.out.println(i);
		   i++;
		   }
		 while(i<5);
	}
	

     void swicase()
{
    int day = 4;
    switch (day) 
	{
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }
  }
  
  
  void interest()
  
  {
       float si,p=1,r=1,n=1;
	   
	   si = (p*r*n) / 100;
	   
	   System.out.println("Simple Interest : " + si);
   
   }
   
   void torial()
   
   {
    int i,fact=1;
      int number=5;
    for(i=1;i<=number;i++)
	  {
	     fact = fact*i;
	  }
	  System.out.println("factorial = "+fact);
   }
   
	void fibo()
	{
   int n1=0,n2=1,n3,i,count=10;
		System.out.println(n1+" "+n2);
		
		for(i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.println(""+n3);
			
			n1=n2;
			n2=n3;
		}
	}
	
	void revers()
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
	
	void pelendrom()
	
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

class xyz_main
{
    public static void main(String g[])
    {
     all s1 = new all();
	 s1.hii();
	 s1.add();
	 s1.posneg();
	 s1.even();
	 s1.elseif();
	 s1.forloop();
	 s1.whileloop();
	 s1.doloop();
	 s1.swicase();
	 s1.interest();
	 s1.torial();
	 s1.fibo();
	 s1.revers();
	 s1.pelendrom();
	}
}