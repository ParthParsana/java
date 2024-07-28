import java.util.Scanner;

 class large

{  

    public static void main(String[]args)   

        {
  
            double a, b, c, largest, temp, maximum;  
 
            Scanner sc = new Scanner(System.in);  
 
                System.out.println("Enter the first number:");  
                a = sc.nextDouble();  

                System.out.println("Enter the second number:");  
                b = sc.nextDouble();  

                System.out.println("Enter the third number:");  
                c = sc.nextDouble();  
                
                temp=a>b?a:b;  

                largest=c>temp?c:temp; 
 
                if(a==b && b==c && a==c)
                    {
                      System.out.println("All A,B and C are equal and  number is:"+a);         
                    }
                
                 else if(a==b)
                    {
                      System.out.println("a and b are equal");
                    
                     maximum = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
                     System.out.println("The largest number is: "+maximum);
                    }

                 else if(b==c)
                    {
                      System.out.println(" B and C are equal");

                    maximum = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
                      System.out.println("The largest number is: "+maximum);
                    }

                  else if(c==a)
                    {
                      System.out.println("C and A are equal");

                    maximum = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
                    System.out.println("The largest number is: "+maximum);
                    }
                 
                 else
                    {
                     System.out.println("The largest number is: "+largest);  
                    }
            
        }  

}