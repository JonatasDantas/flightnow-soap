package com.flightnow.ws;

import javax.xml.ws.Endpoint;

public class RunWebService {

	public static void main(String[] args) {
		FlightWS service = new FlightWS();
		String url = "http://localhost:8080/flightws";
		
		Endpoint.publish(url, service);

	}

}
