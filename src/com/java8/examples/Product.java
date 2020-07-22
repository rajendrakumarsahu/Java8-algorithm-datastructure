package com.java8.examples;

public class Product implements Comparable<Product>{
	int id;
	String name;
	float price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Product o) {
		if(this.price > o.getPrice()) {
			return -1;
		}else {
			return 1;
		}
		
	}
}
