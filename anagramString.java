class anagram{
	boolean isAnagram(String s1,String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		boolean res=false;
		for(int i=0;i<s1.length();i++){
			for(int j=0;j<s2.length();j++){
				if(s1.charAt(i)==s2.charAt(j)){
					res=true;
					break;
				}
				else{
					res=false;
				}
			}
		}
		return (res==true);
	}
	public static void main(String args[]){
		anagram a1=new anagram();
		String s1="listen";
		String s2="silentd";
		boolean res=a1.isAnagram(s1,s2);
		System.out.println(res);
	}
}
