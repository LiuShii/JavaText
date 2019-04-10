package 常用类;

public class 练习1 {
	public static void main(String[] args) {
		String str="this is a test of java";
		char[] a=str.toCharArray();
		int t=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]=='s')
				t++;
		}
		System.out.println("s有"+t+"个");
	}
}

