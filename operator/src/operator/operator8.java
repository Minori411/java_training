package operator;

import java.io.*;

class sample11
{
	public static void main(String[] args)throws IOException	
	{
		System.out.println("値を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int x = Integer.parseInt(str1);
		int y = Integer.parseInt(str2);
		
		System.out.println("x + y =" + (x + y));
		System.out.println("x - y =" + (x - y));
		System.out.println("x * y =" + (x * y));
		System.out.println("x % y =" + (x % y));
	}
}