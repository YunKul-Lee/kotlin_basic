package com.jake.kotlinjava.jvmstatic;

public class JvmStaticExample {

	public static void main(String[] args) {
		String hello = HelloClass.Companion.hello();
		String hi = HiObject.INSTANCE.hi();

		// Kotlin 에서 @JvmStatic 으로 선언시 Companiion / INSTANCE 생략가능
		// 자바와 코틀린을 혼용하여 사용할 경우 유용함
		HelloClass.hello();
		HiObject.hi();
	}
}
