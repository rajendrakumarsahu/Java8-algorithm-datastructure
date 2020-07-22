package com.oops;

public class Test {

	public static void main(String[] args) {
		Sayable s = () -> {
			return "I have nothing to say.";
		};
		System.out.println(s.say());
		// Lambda expression with single parameter.
		Sayable1 s1 = (name) -> {
			return "Hello, " + name;
		};
		System.out.println(s1.say("Sonoo"));

		// You can omit function parentheses
		Sayable1 s2 = name -> {
			return "Hello, " + name;
		};
		System.out.println(s2.say("Sonoo"));
	}

}

interface Sayable {
	public String say();

}

interface Sayable1 {
	public String say(String name);
}