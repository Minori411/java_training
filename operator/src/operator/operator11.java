package operator;

import java.io.*;

class sample14
{
	public static void main(String[] args)throws IOException	
	{
		System.out.println("文字を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		System.out.println(str1 + str2);
		
	}
}