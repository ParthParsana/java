import java.util.*; 
class token 
{
	public static void main(String arg[])

	{
        System.out.println("=====================================");
        System.out.println("TOKENIZER                          ||");
        System.out.println("=====================================");


        StringTokenizer s1 = new StringTokenizer("My Name Is Parth");
        StringTokenizer s2 = new StringTokenizer("MyzNamezIszParth", "zzz");
        StringTokenizer s3 = new StringTokenizer("MyzNamezIszParth", "zzz",true);
        
        System.out.println("The Number Of Tokens Are : "+s1.countTokens());
        // System.out.println("The String Has More Tokens : "+s1.hasMoreTokens());

        // while(s1.hasMoreTokens())
        // {
        //     System.out.println("The Next Tokens : "+s1.nextToken());
        // }



        // System.out.println("The Next Tokens with multiple delimiter: "+s2.hasMoreTokens());
        // while (s2.hasMoreTokens())
        // {
        //     System.out.println("The Next Tokens : "+s2.nextToken());
        // }

        
        // System.out.println("The String Has More Tokens : "+s1.hasMoreElements());
        //  while(s1.hasMoreElements())
        // {
        //     System.out.println("The Next Elements : "+s1.nextToken());
        // }   

         System.out.println("The Next Tokens with Boolean Return Type: "+s3.hasMoreTokens());
        while (s3.hasMoreTokens())
        {
            System.out.println("The Next Tokens : "+s3.nextToken());
        }     

	}
}           