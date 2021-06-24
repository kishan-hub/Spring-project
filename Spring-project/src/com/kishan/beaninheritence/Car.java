package com.kishan.beaninheritence;

public class Car {
	
	private int Id;
	
	private String model;
	private String manufacturer;
	private String color;
	
	private String fuelType;
	
	private float price;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [Id=" + Id + ", model=" + model + ", manufacturer=" + manufacturer + ", color=" + color
				+ ", fuelType=" + fuelType + ", price=" + price + "]";
	}

}
