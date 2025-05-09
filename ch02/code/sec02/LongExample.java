package ch02.sec02;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 20L;
		// long var2 = 1000000000000; // 컴파일러가 오른쪽 숫자 리터럴을 먼저 해석할 때 int 값으로 해석하여 (= 허용 범위 초과) 왼쪽 변수 타입과 관계없이 오류 발생
		long var3 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var3);
	}
}
