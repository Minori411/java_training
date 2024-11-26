package operator;

import java.io.*;

class sample9
{
	public static void main(String[] args)throws IOException	
	{
		System.out.println("値を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
//		int s = Integer.parseInt(str);
		
		System.out.println(str);
	}
}