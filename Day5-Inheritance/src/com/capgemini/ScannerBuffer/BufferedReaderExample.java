package com.capgemini.ScannerBuffer;

import java.io.BufferedReader;

public class BufferedReaderExample {

	public static void main(String[] args)  {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

		String str = b.readLine();
		System.out.print(str);
	}

}
