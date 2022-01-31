package com.flightapp.user.ui;

import java.time.LocalDate;

import com.flightapp.user.model.mealpreference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Booking {
	
	private Integer PNR;

	private Integer flightId;

	private mealpreference mealPreference;

	private Double price;

	private Integer passengerCount;

	private String passengerdetails;

	private String userEmail;
	
	private String seatNumbers;
	
    private Boolean isCancelled;
    
    private String flightName;
	
	private String fromLocation;
	
	private String destination;
	
	private LocalDate departureDate;
	
	private String airlineName;

}
