import java.util.*;
/*class AnagramString{
	String  sortString(String s){
		//char[] ch=new char[s.length];
		String res=new String("");
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<s.length();j++){
				if((s.charAt(j))>(s.charAt(i))){
					char temp1=s.charAt(i);
					char temp2=s.charAt(j);
					char temp3=s.charAt(j);
					temp2=temp1;
					temp1=temp3;
					res=res+temp1;
					break;
				}

			}
		}
		return res;
	}
	public static void main(String args[]){
		AnagramString A1=new AnagramString();
		String s="sggscollege";
		//System.out.println(A1.sortString("sggsclg"));java
		//System.out.println(A1.sortString(s));
		//s.charAt(1)=s.charAt(2);
		System.out.println(s);
		System.out.println(A1.sortString(s));
	}
}*/
class AnagramString{
	 String sortStringMethod_1(String s){
	 	char[] c1=s.toCharArray();
	 	    for (int i = 0; i < c1.length; i++) {     
      			  for (int j = i+1; j < c1.length; j++) {     
				   if(c1[i] > c1[j]) {    
				      char temp = c1[i];    
				       c1[i] = c1[j];    
				       c1[j] = temp;    
				   }     
       			 }     
   		 }    
	 	return String.valueOf(c1);	
	 }
	 String  sortStringMethod_2(String s){
	 	char[] ch=s.toCharArray();
		Arrays.sort(ch);
	 	//Arrays.sort(s);
	 	return String.valueOf(ch);
	 }
	 boolean checkAnagram_M1(String s1,String s2){
	 	String str1=sortStringMethod_1(s1);
	 	String str2=sortStringMethod_1(s2);
	 		if(str1.equals(str2)){
	 			return true;
	 		}
	 		else{
	 			return false;
	 		}
 	 }
 	 boolean checkAnagram_M2(String s1,String s2){
	 	String str1=sortStringMethod_2(s1);
	 	String str2=sortStringMethod_2(s2);
	 		if(str1.equals(str2)){
	 			return true;
	 		}
	 		else{
	 			return false;
	 		}
 	 }
 	 long averageTime(long[] arr){
 	 	long sum=0;
 	 	for(int i=0;i<arr.length;i++){
 	 		sum+=arr[i];
 	 	}
 	  	 long avg=sum/arr.length;
 	  	 return avg;
 	 }
	 public static void main(String args[]){
	 	AnagramString A1= new AnagramString();
	 	//System.out.println(A1.checkAnagram("listen","silent"));
	 	long sizeOfArray=100;
	 	long arr1[]=new long[100];
		long arr2[]=new long[100];
		long startTime,endTime;
		int i=0;
		int sizeOfLoop=100;
		while(i<1){
			for(int k=0;k<sizeOfLoop;k++){
				startTime=System.nanoTime();
				A1.checkAnagram_M1("listen","silent");
				endTime=System.nanoTime();
				arr1[k]=endTime-startTime;
			}
			for(int k=0;k<sizeOfLoop;k++){
				startTime=System.nanoTime();
				A1.checkAnagram_M2("listen","silent");
				endTime=System.nanoTime();
				arr2[k]=endTime-startTime;
			}
			i++;
			long time1=A1.averageTime(arr1);
			long time2=A1.averageTime(arr2);
			System.out.println("Time taken by approach 1-->"+time1);
			System.out.println("Time taken by approach 2-->"+time2);
		}
		
	 }
}
