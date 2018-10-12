package edu.uwex.apc390.lesson2.actors;

public class Actor {
	private String name;
	private int age;
	
	public Actor( String name, int age){
		setName( name );
		setAge( age );
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null)
			this.name = name;
		else
			if (this.name == null)
				this.name = "";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0)
			this.age = age;
	}

	@Override
	public String toString() {
		return "Actor [name: " + name + ", age: " + age + "]";
	}
}
