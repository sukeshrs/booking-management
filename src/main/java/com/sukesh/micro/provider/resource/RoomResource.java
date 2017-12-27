package com.sukesh.micro.provider.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sukesh.micro.provider.model.Room;

@Path("/rooms")
public class RoomResource {

	@GET
	@Path("test")
	public String sayHello() {
		return "Hello Test..Test...Implementation in progress";
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Room> getAllRooms(){
		
		List<Room> allRooms = new ArrayList<Room>();
		allRooms.add(new Room(101,1));
		allRooms.add(new Room(102,1));
		allRooms.add(new Room(103,1));
		allRooms.add(new Room(201,2));
		
		return allRooms;
		
	}
	
}
