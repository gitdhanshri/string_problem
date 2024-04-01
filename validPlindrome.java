class Solution {
    public boolean isPalindrome(String s) {
        String upperCase=s.toUpperCase();
        System.out.println(upperCase);
        return true;
    }
    boolean checkPalindrom(String str){
 	int length=str.length();
 	//System.out.println(length);
 	String res=" ";
 	for(int i=0;i<str.length();i++){
 		//if(str.charAt(i)
 		//System.out.print(" "+(int)str.charAt(i));
 		if((65<(int)str.charAt(i)&&((int)str.charAt(i)<91))||
 		(96<((int)str.charAt(i))&&126<((int)str.charAt(i)))||
 		(0<=(str.charAt(i))&&(str.charAt(i))<10)){
 			 System.out.print(" "+str.charAt(i));
 		}
 		else{
 			continue;
 		}
 	}
 	return true;
 	}
    public static void main(String args[]){
    	Solution s1=new Solution();
    	String name="Dhanshri, @ Vitthalrao _:Baswade";
    	//s1.isPalindrome(name);
    	s1.checkPalindrom(name);
    	System.out.println("\n");
    }
}javac 
