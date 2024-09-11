package com.demo.vehicle;

public class Car {

	private String type;
	private int speed;

	public Car() {

	}

	public Car(String carType) {
		type = carType;
	}

	public Car(String type, int speed) {
		this.type = type;
		this.speed = speed;

	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
