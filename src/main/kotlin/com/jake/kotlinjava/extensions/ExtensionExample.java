package com.jake.kotlinjava.extensions;

public class ExtensionExample {

	public static void main(String[] args) {
//		"ABCD".first();
//		"ABCD".addFirst('Z');

		// 코틀린의 Extenstion을 자바에서 사용할 경우 static 메소드 형태로 접근해야 함
		// Extension 을 정의한 파일명+Kt 클래스를 통하여 접근
		char first = KotlinExtensionKt.first("ABCD");
		System.out.println(first);

		String addFirst = KotlinExtensionKt.addFirst("ABCD", 'Z');
		System.out.println(addFirst);


	}
}
