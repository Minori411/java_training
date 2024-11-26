package operator;

import java.io.*;

class sample12
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
		
		int average = (x + y) /2;
		
		System.out.println("平均点は" + average + "です。");
		
	}
}