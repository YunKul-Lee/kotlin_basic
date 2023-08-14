package com.jake.kotlinjava.jvmstatic;

public class JvmFieldExample {
	public static void main(String[] args) {
		// object 에서 @JvmField 미선언 시
//		JvmFieldClass.Companion.getId();
//		JvmFieldObject.INSTANCE.getName();

		// object 에서 @JvmField 선언 시
		int id = JvmFieldClass.id;
		String name = JvmFieldObject.name;

		// 코틀린에서 상수로 선언시 직접 접근 가능
		int code = JvmFieldClass.CODE;
		String familyName = JvmFieldObject.FAMILY_NAME;
	}
}
