package chapter6.thisEx;

public class Person {
	String name;
	int age;

	Person() {
		this("�̸� ����", 1);
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Person returnItSelf() {
		return this;
	}

}