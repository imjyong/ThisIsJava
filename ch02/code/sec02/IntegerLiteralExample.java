package ch02.sec02;

/*
project: ThisIsJava
package: ch02.sec02
*/

// 2진수: 0b or 0B로 시작, 0 & 1
// 8진수 0으로 시작, 0~7
// 10진수: 0~9
// 16진수: 0x or 0X로 시작, 0~9 & A~F & a~f

public class IntegerLiteralExample {
	public static void main(String[] args) {
		int var1 = 0b1011;
		int var2 = 0206;
		int var3 = 365;
		int var4 = 0xB3;
		
		System.out.println("var 1: " + var1);
		System.out.println("var 2: " + var2);
		System.out.println("var 3: " + var3);
		System.out.println("var 4: " + var4);
	}
}
