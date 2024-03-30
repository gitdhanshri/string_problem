class PalindromeString{
	char return_one_char(){
	for(long i=0;i<10000;i++){
		long num=(System.nanoTime()%126);
		num=155-num;
		if((num>64)&&(num<91)){
			return (char)num;
		}
		else{
			continue;
		}
		
	}
	return 'M';
	}
	String generateRandomOneString(){
		String str="";
		for(long i=0;i<5;i++){
			str+=return_one_char();
		}
		return str;
	} 
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
		int end=s1.length()-1;
		String s2=s1;
		String str=new String("");
		for(int i=0;i<s1.length();i++){
			str=str+s2.charAt(end);
			end--;
		}

		return (s1.equals(str));	
	}
	
	boolean approach3(String s1){
		String rev="";
		char[] c=s1.toCharArray();
		for(int i=s1.length()-1;i>=0;i--){
			 rev+=c[i];
		}
		if(s1.equals(rev)){
				return true;
		}
		
		return false;
	}
	String[] arryContainerThatStoreRandomGeneratedString(){
		long size=100000;
		String arr[]=new String[(int)size];
			for(int i=0;i<size;i++){
				arr[i]=generateRandomOneString();
			}
		return arr;
	}
	long count_palindromeAndNonPalString_By_M1(String[] str){
		int i=0;
		long totalPalString=0;
		long totalNonPalString=0;
		for(i=0;i<str.length;i++){
			if(approach1(str[i])){
				totalPalString++;
			}
			else{
				totalNonPalString++;
			}
		}
		return  totalPalString;
	}
	long count_palindromeAndNonPalString_By_M2(String[] str){
		int i=0;
		long totalPalString=0;
		long totalNonPalString=0;
		for(i=0;i<str.length;i++){
			if(approach2(str[i])){
				totalPalString++;
			}
			else{
				totalNonPalString++;
			}
		}
		return  totalPalString;
	}
	long count_palindromeAndNonPalString_By_M3(String[] str){
		int i=0;
		long totalPalString=0;
		long totalNonPalString=0;
		for(i=0;i<str.length;i++){
			if(approach3(str[i])){
				totalPalString++;
			}
			else{
				totalNonPalString++;
			}
		}
		return  totalPalString;
	}
	String[] storePalindromeStringInStringArray_M1(String[] str,long size){
		 int k=0;
		String []s=new String[(int)size];
		for(int i=0;i<str.length;i++){
			if(approach1(str[i])==true){
				s[k]=str[i];
				k++;
				if(k==size){
					return s;	
				}
			}
			else{
				continue;	
			}
		}
			
		return s;
	}
	String[] storePalindromeStringInStringArray_M2(String[] str,long size){
		 int k=0;
		String []s=new String[(int)size];
		for(int i=0;i<str.length;i++){
			if(approach2(str[i])==true){
				s[k]=str[i];
				k++;
				if(k==size){
					return s;	
				}
			}
			else{
				continue;	
			}
		}
			
		return s;
	}
	void PrintStringArray(String[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("\n");
	}
	long findAverageTimeOf(long[] str){
		long sum=0;
		for(int i=0;i<str.length;i++){
			sum+=str[i];
		}
		long avg=(sum/str.length);
		return avg;
	}
	
	public static void main(String args[]){
			PalindromeString s1=new PalindromeString();
			long startTime, endTime;
			long arr1[]=new long[100];
			long arr2[]=new long[100];
			long arr3[]=new long[100];
			String[] str=s1.arryContainerThatStoreRandomGeneratedString();
			long i = 0,numberofTimes=10;
		while(i<1){
				for(int k=0;k<numberofTimes;k++){
					startTime=System.nanoTime();
					s1.count_palindromeAndNonPalString_By_M1(str);
					endTime =System.nanoTime();
					arr1[k]=endTime-startTime;
				}
				for(int k=0;k<numberofTimes;k++){
					startTime=System.nanoTime();
					s1.count_palindromeAndNonPalString_By_M2(str);
					endTime =System.nanoTime();
					arr2[k]=endTime-startTime;
				}
				for(int k=0;k<numberofTimes;k++){
					startTime=System.nanoTime();
					s1.count_palindromeAndNonPalString_By_M3(str);
					endTime =System.nanoTime();
					arr3[k]=endTime-startTime;
				}
				i++;
			}
			long time1=s1.findAverageTimeOf(arr1);
			long time2=s1.findAverageTimeOf(arr2);
			long time3=s1.findAverageTimeOf(arr3);
			System.out.println("Time Taken for 1st Approach-->"+time1);
			System.out.println("Time Taken for 2nd Approach-->"+time2);
			System.out.println("Time Taken for 3rd Approach-->"+time3);
	}
}	

