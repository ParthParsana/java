class strings
{
	public static void main(String arg[])

	{
		System.out.println("========================================");
		System.out.println("String Methods                        ||");
        System.out.println("========================================");


        char[] s0={'h','e','l','l','o'};
		String s1="Parth";
		String s2="Parsana";
		String s3="";
		String s4="Parth";


		System.out.println("1. Char At : "+s1.charAt(3));
		System.out.println("2. ConCat : "+s1.concat(s2));
		System.out.println("3. Copy Value Of : "+s3.copyValueOf(s0,0,2));
		System.out.println("4. Ends With : "+s1.endsWith("rth"));
		System.out.println("5. Start With : "+s1.startsWith("Par"));
		System.out.println("6. Equals : "+s1.equals(s4));
		System.out.println("7. Equals Ignore Case : "+s1.equalsIgnoreCase(s4));
		System.out.println("8. toLowerCase : "+s1.toLowerCase());
		System.out.println("9. toUpperCase : "+s2.toUpperCase());
		System.out.println("10. Replace : "+s1.replace('P','E'));
		System.out.println("11. Substring : "+s1.substring(2));
		System.out.println("12. Index Of : "+s1.indexOf("Parth"));
		System.out.println("13. Last Index Of : "+s1.lastIndexOf("Parth"));
		System.out.println("14. Replace First : "+s1.replaceFirst("Pa","Ea"));
		System.out.println("15. Compare to : "+s1.compareTo(s2));

		byte[] s5=s1.getBytes();
		for(int i=0;i<s5.length;i++)
		{
           System.out.println("16. Get Bytes : "+s5[i]);
		}


		String[] s7 = s1.split("t",2);
		for(String a : s7)
			System.out.println("17. Split : "+a);

		char[] s6 = new char[] { ' ', ' ', ' ', ' ',
                                  ' ', ' ', ' ', ' ' };
			s1.getChars(0, 3, s6, 1);
			System.out.println();
			        // Display the contents of the byte array.
			System.out.println("The char array equals \"" +s6 + "\"");
			System.out.println();

	}
}
