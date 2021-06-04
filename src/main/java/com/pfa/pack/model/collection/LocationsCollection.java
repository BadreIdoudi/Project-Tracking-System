package com.pfa.pack.model.collection;

import java.io.Serializable;
import java.util.List;

import com.pfa.pack.model.entity.Location;

public final class LocationsCollection implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<Location> locations;
	
	public LocationsCollection() {
		
	}
	
	public LocationsCollection(final List<Location> locations) {
		this.locations = locations;
	}
	
	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(final List<Location> locations) {
		this.locations = locations;
	}
	
	
	
}








