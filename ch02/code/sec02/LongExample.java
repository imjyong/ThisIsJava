package ch02.sec02;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 20L;
		// long var2 = 1000000000000; // 컴파일러가 int로 간주하여 오류 발
		long var3 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var3);
	}
}
