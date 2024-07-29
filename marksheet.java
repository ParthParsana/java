class student
{
    int sid,sj,sa,sp,total,j,a,p;
    double per;
    String sname;

    void get_student_data(int id,String name)
    {
  		sid=id;
  		sname=name;
	}
	void put_student_data()
	{
		System.out.println("======================");
		System.out.println("Student ID : "+sid);
		System.out.println("Name : "+sname);
		System.out.println("======================");
	}
}

class marks extends student
{
    void get_student_marks(int j,int a,int p)
	{
		sj=j;
		sa=a;
		sp=p;
    }

	void put_student_marks()
	{
		System.out.println("STUDENT MARKS OF THREE SUBJECT :");
		System.out.println("JAVA="+sj);
		System.out.println("ASP.NET="+sa);
		System.out.println("PROJECT="+sp);
		System.out.println("======================");
		total=sj+sa+sp;
		System.out.println("Total Marks="+total);

		per=(total*100)/300;
		System.out.println("Percentage="+per);
	}

}

class result extends marks

{
    void student_grade()

    {
    	if (per>90 && per<100)
    	{
    		System.out.println("Parth got A grade");
    		System.out.println("Congratulation,You passed the Exam");
    		System.out.println("======================");
    	}

    	else if (per>80 && per<90)
    	{
    		System.out.println("Parth got B grade");
    		System.out.println("Congratulation,You passed the Exam");
    		System.out.println("======================");
    	}

    	else if (per>70 && per<80)
    	{
    		System.out.println("Parth got C grade");
    		System.out.println("Congratulation,You passed the Exam");
    		System.out.println("======================");
    	}

    	else if (per>60 && per<70)
    	{
    		System.out.println("Parth got D grade");
    		System.out.println("Congratulation,You passed the Exam");
    		System.out.println("======================");
    	}

    	else 
    	{
    		System.out.println("Parth got F grade");
    		System.out.println("YOU FAIL IN EXAM");
    		System.out.println("======================");
    	}
    }
	

}

class marksheet_main
{
   public static void main(String ary[])
   {
      result s1=new result();
      s1.get_student_data(206,"parth");
      s1.put_student_data();
   	  s1.get_student_marks(92,93,95);
   	  s1.put_student_marks();
   	    s1.student_grade();

   }
}