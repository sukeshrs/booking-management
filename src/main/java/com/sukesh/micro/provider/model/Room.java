package com.sukesh.micro.provider.model;

public class Room {
	
	public Room(Integer roomNumber, Integer floor) {
		super();
		this.roomNumber = roomNumber;
		this.floor = floor;
	}
	private Integer roomNumber;
	private Integer floor;
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Integer getFloor() {
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}

}
