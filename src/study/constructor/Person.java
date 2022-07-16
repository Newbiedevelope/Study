package study.constructor;

public class Person {
	String name;
	float height;
	int weight;

	public Person() {
	}

	public Person(String pname) {
		this.name = pname;
	}

	public Person(float pheight) {
		this.height = pheight;
	}

	public Person(int pweight) {
		this.weight = pweight;
	}
}
