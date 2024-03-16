class PalindromeString{
	static int totalPalString=0;
	static int totalNonPalString=0;
	static int one_digit(){
		long num=((System.nanoTime()%10)*10)+System.nanoTime()%10;
		return (int)num;
	}
	static char return_one_char(int number){
		if((number>64&&number<90)){
			 char num=(char)number;
			return num;
		}
		else{
			return 'M';
		}
	}
	static String generateRandomOneString(){
		String str="";
		for(int i=0;i<5;i++){
			str+=return_one_char(one_digit());
		}
		return str;
	} 
	//check whether string is palimdrom or not 
	boolean approach1(String s1){
		int start=0;
		int end=s1.length()-1;
		while(start<=end){
			if(s1.charAt(start)==s1.charAt(end)){
				start++;
				end--;
			}
			else{
				return false;
			}
		}
		return true;	
	}
	boolean approach2(String s1){
		
		StringBuilder rev=new StringBuilder(s1).reverse();
		if(s1.equals(rev)){
			return true;
		}
		return false;
	}
	String[] arryContainer(){
		String arr[]=new String[100];
			for(int i=0;i<100;i++){
				arr[i]=generateRandomOneString();
				//System.out.print("yes");
				//System.out.println("In fun"+arr[i]);
			}
		return arr;
	}
	void count_palindromeAndNonPalString_By_M1(String[] str){
		int i=0;
		for(i=0;i<str.length;i++){
			if(approach1(str[i])){
				totalPalString++;
			}
			else{
				totalNonPalString++;
			}
		}
	}
	void count_palindromeAndNonPalString_By_M2(String[] str){
		int i=0;
		for(i=0;i<str.length;i++){
			if(approach2(str[i])){
				totalPalString++;
			}
			else{
				totalNonPalString++;
			}
		}
	}
	public static void main(String args[]){
			PalindromeString s1=new PalindromeString();
			String[] str=s1.arryContainer();
			long startTime, endTime;
			long i = 0,j=0;
			while(i<8){
			//for approach 1
				startTime=System.nanoTime();
				s1.count_palindromeAndNonPalString_By_M1(str);
				endTime =System.nanoTime();
				System.out.println("Approach 1->"+(endTime-startTime));
			//for approach 1
				startTime=System.nanoTime();
				s1.count_palindromeAndNonPalString_By_M2(str);
				endTime =System.nanoTime();
				System.out.println("Approach 2->"+(endTime-startTime)/10);					
				i++;
			}
	}
}	

