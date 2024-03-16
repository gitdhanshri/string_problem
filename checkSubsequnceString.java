class subseq{
	boolean isSubseq(String s1,String s2){
	//S1=DhanshriBaswade-->i-->11
	//s2=Shri-->j-->4
	int j=0,i=0;
	for(i=0;i<s1.length()&&j<s2.length();i++){
		if(s1.charAt(i)==s2.charAt(j)){
			j++;
		}	
		else{
			i++;
		}
		
	}
	return  (j==s2.length());
	}
	public static void main(String args[]){
		subseq s1=new subseq();
		System.out.println(s1.isSubseq("sggsclg","ctlg"));
		
	}
}
