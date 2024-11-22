package operator;

import java.io.*;

class sample7
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("科目１～５の点数を入力してください。");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		String str4 = br.readLine();
		String str5 = br.readLine();
		
		int subject1 = Integer.parseInt(str1);
		int subject2 = Integer.parseInt(str2);
		int subject3 = Integer.parseInt(str3);
		int subject4 = Integer.parseInt(str4);
		int subject5 = Integer.parseInt(str5);
		
		int sum = subject1+subject2+subject3+subject4+subject5;
		
		System.out.println("5科目の合計点は" + sum + "点です。" );
		System.out.println("5科目の平均点は" + sum/(double)5 + "です。");
	}
}
