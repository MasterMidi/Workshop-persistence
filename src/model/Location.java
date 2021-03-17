package model;

import java.util.ArrayList;
import java.util.List;

public class Location {
	private String name;
	private String address;
	private int zipcode;
	private List<Shelf> shelfs;
	
	public Location(String name, String address, int zipcode, List<Shelf> shelfs) {
		super();
		this.name = name;
		this.address = address;
		this.zipcode = zipcode;
		this.shelfs = shelfs;
	}
	public Location(String name, String address, int zipcode) {
		this(address, address, zipcode, new ArrayList<>());
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Shelf> getShelfs() {
		return shelfs;
	}
	public void setShelfs(List<Shelf> shelfs) {
		this.shelfs = shelfs;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	

}
