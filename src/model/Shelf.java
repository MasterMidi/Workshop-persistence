package model;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
	private Location location;
	private int level;
	private int number;
	private List<ShelfLine> shelfLines;
	
	public Shelf(Location location, int level, int number, List<ShelfLine> shelfLines) {
		super();
		this.location = location;
		this.number = number;
		this.level = level;
		this.shelfLines = shelfLines;
	}
	
	public Shelf(Location location, int level, int number) {
		this(location, number, number, new ArrayList<>());
	}

	public List<ShelfLine> getShelfLines() {
		return shelfLines;
	}
	

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setShelfLines(List<ShelfLine> shelfLines) {
		this.shelfLines = shelfLines;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	

}
