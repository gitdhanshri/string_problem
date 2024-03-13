class subseq{
	boolean isSubseq(String s1,String s2){
		int m=s1.length();
		int n=s2.length();
		int j=0;
		for(int i=0;i<m&&j<n;i++){
			if(s1.charAt(i)==s2.charAt(j)){
				j++;
			}
		}
		return (j==n);
	}
	public static void main(String args[]){
		String s1=new String("Dhanshri");
		String s2=new String("shri");
		subseq s= new subseq();
		System.out.println(s.isSubseq(s1,s2));	
	}
}
