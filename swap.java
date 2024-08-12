class a
{
	
	public static void main(String ar[])

	{
       float first=10,second=20;
       System.out.println("Before swap number");
       System.out.println("First number ="+first);
       System.out.println("Second number ="+second);

       float temporary = first;
       first = second;
       second=temporary;
       
        System.out.println("After swap number");
       System.out.println("First number ="+first);
       System.out.println("Second number ="+second);

	}
}