class RecursionPalindrome{
	boolean ispalindrome(int first,int last,String s){
		if(first>last){
			return false;
		}
		while(first<=last){
			if(s.charAt(first)==s.charAt(last)){
				first++;
			}
			else{
				return false;
			}

			last--;
			ispalindrome(first+1,last-1,s);
		}
	   return true;
	}
	public static void main(String args[]){
		RecursionPalindrome R1=new RecursionPalindrome();
		String s1="swgmgs";
		int length=s1.length()-1;
		System.out.print("Is Given String is Palindrome-->"+R1.ispalindrome(0,length,s1));
		System.out.println("\n");
	}
}

