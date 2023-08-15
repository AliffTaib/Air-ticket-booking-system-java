import java.io.Serializable;

public class Flight implements Serializable{
	
	
	    private String flightNumber;
	    private String airline;
	    private String source;
	    private String destination;
	    private int departureTime;
	    private int arrivalTime;
	    private double price;
	    private int availableSeats;

public Flight( String flightNumber, String airline, String source, String destination, int departureTime, int arrivalTime, double price,int availableSeats) {  //constructor with attributes 
	
	this.flightNumber = flightNumber;
	this.airline = airline;
	this.source = source;
	this.destination = destination;
	this.departureTime = departureTime;
	this.arrivalTime = arrivalTime;
	this.price = price;
	this.availableSeats = availableSeats;
}

public String getFlightNumber() {
	return flightNumber;
}

public void setFlightNumber(String flightNumber) {
	this.flightNumber = flightNumber;
}

public String getAirline() {
	return airline;
}

public void setAirline(String airline) {
	this.airline = airline;
}

public String getSource() {
	return source;
}

public void setSource(String source) {
	this.source = source;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public int getDepartureTime() {
	return departureTime;
}

public void setDepartureTime(int departureTime) {
	this.departureTime = departureTime;
}

public int getArrivalTime() {
	return arrivalTime;
}

public void setArrivalTime(int arrivalTime) {
	this.arrivalTime = arrivalTime;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getAvailableSeats() {
	return availableSeats;
}

public void setAvailableSeats(int availableSeats) {
	this.availableSeats = availableSeats;
}

/*
 * private String flightNumber;
	    private String airline;
	    private String source;
	    private String destination;
	    private double departureTime;
	    private double arrivalTime;
	    private double price;
	    private int availableSeats;
 */
public String toString() {
	return "  " + flightNumber  + "              " +airline +"      "+ source +"         "+destination +"                 "+departureTime+"              "+ arrivalTime +"            $$"+price+"         "+ availableSeats;	
}
		
}

