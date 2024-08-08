class abc
{
	public static void main(String a[])

	{
		String s1 ="Java";
		String s2 ="abc";
		String s3 ="abc";
		String s4 ="techninfinity";
		StringBuffer s5 = new StringBuffer("abc");
		StringBuffer s6 = new StringBuffer("abc");
		StringBuffer s7 = new StringBuffer("abc");
		StringBuffer s8 = new StringBuffer("tech");
		StringBuffer s9 = new StringBuffer("abc");
		s9.replace(0,2,"java");
		s8.append("infinity");
		s5.reverse();
		s6.length();
		s7.insert(1,"java");
		System.out.println("length :"+s1.length());      //  string
		System.out.println("toupper case :"+s1.toUpperCase());
		System.out.println("to lower case :"+s1.toLowerCase());
		System.out.println("concat :"+s1.concat(s2));
		System.out.println("equals :"+s1.equals(s2));
		System.out.println("equalsignorecase :"+s1.equalsIgnoreCase(s2));
		System.out.println("Char at :"+s3.charAt(0));
		System.out.println("sub string at :"+s4.substring(0));
		System.out.println("sub string at :"+s4.substring(5,8));
		System.out.println("compare to  at :"+s2.compareTo(s3));
		System.out.println("compare to  at :"+s2==s3);
		System.out.println("reverse :"+s5);
		System.out.println("length :"+s6);
		System.out.println("Insert :"+s7);
		System.out.println("append :"+s8);
		System.out.println("replace :"+s9);

         //System.out.println(a[0]);//command line argument
         //System.out.println(a[1]);
         //System.out.println(a[2]);
    }
}