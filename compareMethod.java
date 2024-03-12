class compare{
	public static void main(String args[]){
		String name="Dhanshri";
		String name2="Baswade";
		/*System.out.println(name.equals(name2));
		System.out.println(name.compareTo(name2));
		System.out.println(name.indexOf(name2));*/
		/*String s1="Dhanshri";
		String s2=s1;
		System.out.print("Befor concatination-->");
		System.out.println(s1==s2);
		s1=s1+"Baswade";
		System.out.println(s1);
		System.out.print("After concatiantion-->");
		System.out.println(s1==s2);*/
		StringBuilder str=new StringBuilder("sggs");
		StringBuilder rev =new StringBuilder(str);
		//System.out.println(rev);
		rev.reverse();
		//System.out.println(rev);
		/*if(str==rev){
			System.out.println("String is palindrome");
		}
		else{
			System.out.println("String is not palindrime");	
		}*/
		/*Regardless of the object content, does .equals return true only if both 				 the object references point to the same object ?*/
		//System.out.println("1->Are string palindrome-->"+str.equals(rev));
		//System.out.println("2->Are string palindrome-->"+str.compareTo(rev));
		
		 StringBuilder s1 = new StringBuilder("Test");
		 StringBuilder s2 = new StringBuilder("Test");
		 System.out.println(s1); // output: Test
		 System.out.println(s2); // Test
		 System.out.println(s1==s2); // false
		 System.out.println(s1.equals(s2)); //Line 1 output: false
		 System.out.println("Address of s1 object -->"+s1.toString());
		 System.out.println("Address of s2 object -->"+s2.toString()); //Line 2 output: false		  //Line 2 output: false		 
		 System.out.println(s1.toString()==s2.toString()); //Line 2 output: false
    }
}
