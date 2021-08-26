package com;

public class Reverse {
	
	private static String reverse(String input) {
		return new StringBuilder(input).reverse().toString();	
	}

	public static void main(String[] args) {
		
		String input = "Sabindra";
		int len = input.length();	
		StringBuilder stringBuilder = new StringBuilder();
		for( int x = len-1; x >= 0 ; x--) {
			
			char ch = input.charAt(x);
			//System.out.print(""+ ch);	
			stringBuilder.append(ch);
		}
		
		System.out.println(stringBuilder.toString());

		String result = reverse(input);
		System.out.println("\n"+result);
	}
}
