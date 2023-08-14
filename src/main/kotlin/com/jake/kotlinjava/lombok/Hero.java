package com.jake.kotlinjava.lombok;

import lombok.*;

@EqualsAndHashCode
@ToString
public class Hero {

	private String name;

	private int age;

	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.setName("아이언맨");
		hero.setAge(53);
		hero.setAddress("스타크타워");
	}
}
