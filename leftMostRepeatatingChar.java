class leftmostrepeat{
	int indexOfleftMostrepeatating(String s1){
		for(int i=0;i<s1.length()-1;i++){
			for(int j=i+1;j<s1.length();j++){
				if(s1.charAt(i)==s1.charAt(j)){
					return i;
				}
			}
		}
		return -1;
	}
	public static void main(String args[]){
		leftmostrepeat l1=new leftmostrepeat();
		System.out.println(l1.indexOfleftMostrepeatating("wrxyz"));
	}
}
