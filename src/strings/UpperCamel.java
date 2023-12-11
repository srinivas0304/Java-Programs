package strings;

public class UpperCamel 
{
	static String convertString(String str) {
		int ctr = 0;
		int n=str.length();
		//convert the string expression to character array
		char ch[] = str.toCharArray();
		int c=0;
		for(int i=0;i<n;i++){
			if(i==0) {
				ch[i]=Character.toUpperCase(ch[i]);
			}
			if(ch[i]==' ') {
				ctr++;
				ch[i+1]=Character.toUpperCase(ch[i+1]);
				continue;
			}
			else {
				ch[c++]=ch[i];
			}
	}
		return String.valueOf(ch,0,n-ctr);
	}
	
	public static void main(String[] args) {
		String string = "class test";
		System.out.println(convertString(string));
	}
}
