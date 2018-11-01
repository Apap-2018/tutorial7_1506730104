package com.apap.tutorial7.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import com.apap.tutorial7.model.FlightModel;
import com.apap.tutorial7.model.PilotModel;

/**
 * FlightService
 */
public interface FlightService {
    FlightModel addFlight(FlightModel flight);
    
    void deleteByFlightNumber(String flightNumber);

    Optional<FlightModel> getFlightDetailByFlightNumber(String flightNumber);
    
    Optional<FlightModel> getFlightDetailById(long id);
    
    void updateFlight(long id, String destination, String origin, Date time);
    
    List<FlightModel> getAllFlight();
}