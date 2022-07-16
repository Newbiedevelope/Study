package chapter6.thisEx;

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.age);
		System.out.println(noName.name);

		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}
}
