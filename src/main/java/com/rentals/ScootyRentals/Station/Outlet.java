package com.rentals.ScootyRentals.Station;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Outlet {

	public static Map<String, Location> stations = new HashMap<String, Location>();

	static {
		stations.put("Station:(1)", new Location(1, 2));
		stations.put("Station:(2)", new Location(2, 2));
		stations.put("Station:(3)", new Location(3, 2));
		stations.put("Station:(4)", new Location(4, 6));
		stations.put("Station:(5)", new Location(5, 2));
		stations.put("Station:(6)", new Location(6, 4));
		stations.put("Station:(7)", new Location(7, 2));
		stations.put("Station:(8)", new Location(8, 3));
	}

	public Map<String, Location> getAvailableStations() {
		return stations;

	}

	public String getNearByAvailableStation(String x, String y) {
		int x1 = Integer.parseInt(x);
		int y1 = Integer.parseInt(y);
		String station = null;
		double resultdistance = 99999999;
		for (Map.Entry<String, Location> e : stations.entrySet()) {
			double distance = 0;
			distance = Math.sqrt((e.getValue().getY() - y1) * (e.getValue().getY() - y1)
					+ (e.getValue().getX() - x1) * (e.getValue().getX() - x1));
			if (distance < resultdistance) {
				resultdistance = distance;
				station = e.getKey();
			}

		}

		return station;

	}

}
