package com.study.s1;

//primitive type (원시 타입, 기본타입)
public class Study9 {
	
	public static void main(String[] args) {
		//변수 선언
		//메모리(ram)에 저장공간 확보
		//데이터타입명 변수명;
		//숫자 - 정수형 -byte(1), short(2), int(4), long(8) --> 4가지
		
		//512
		//변수 선언
		int num = 512;
		
		//변수 사용
		//사용시에는 데이터타입명은 쓰지 않는다.
		System.out.println(num*2);
		
		long num2=2000L;
		num2 = 1000l;
		
		
		System.out.println(num2);
		
		//초기화
		//변수 선언 후 변수에 최초로 값을 대입
		//★모든 변수는 초기화 하지 않으면 사용할 수 없음★
		int num3;
		num3 = 20;
		System.out.println(num3);
		
		//같은 타입의 변수를 여러개 선언
		int n1;
		int n2;
		int n3;
		int m1, m2, m3;
		
		//실수형
		//소수점이 있는 숫자
		//float(4), double(8) --> 2가지
		float f1 = 1.24F;
		double d1 = 3.14127;
		
		//문자형
		//문자 한글자
		//리터럴 앞뒤로 ''로 감싸야 함 --> 1가지
		char ch = 'a';
		ch = '한';
		ch = '2';
		ch = '한';
		char ch2 = '글';
		
		//논리형 --> 1가지
		boolean check = true;
		check = false;
		
		//변수에는 같은 데이터타입만 대입 가능
		int p1 = 100;
		long p2 = 1L;
		
		//같은 데이터타입이 아니다
//		p1 = p2;
//		ch = p1;
//		check = 1;
		
		
	}
}
