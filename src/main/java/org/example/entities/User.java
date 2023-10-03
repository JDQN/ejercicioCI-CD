package org.example.entities;

public class User {

	public String name;

	public User(String name) {
		this.name = name;
	}

	public String getName()
		return name;


	public void setName(String newName)
		this.name = newName;


	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				'}';
	}
}
