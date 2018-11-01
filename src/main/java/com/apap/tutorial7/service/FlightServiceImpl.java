package com.apap.tutorial7.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import com.apap.tutorial7.model.FlightModel;
import com.apap.tutorial7.repository.FlightDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * FlightServiceImpl
 */
@Service
@Transactional
public class FlightServiceImpl implements FlightService {
    @Autowired
    private FlightDb flightDb;
    
    @Override
    public FlightModel addFlight(FlightModel flight) {
        return flightDb.save(flight);
    }

    @Override
    public void deleteByFlightNumber(String flightNumber) {
        flightDb.deleteByFlightNumber(flightNumber);
    }

    @Override
    public Optional<FlightModel> getFlightDetailByFlightNumber(String flightNumber) {
        return flightDb.findByFlightNumber(flightNumber);
    }

	@Override
	public Optional<FlightModel> getFlightDetailById(long id) {
		return flightDb.findById(id);
	}

	@Override
	public void updateFlight(long id, String destination, String origin, Date time) {
		// TODO Auto-generated method stub
		flightDb.findById(id).get().setDestination(destination);
		flightDb.findById(id).get().setOrigin(origin);
		flightDb.findById(id).get().setTime(time);
	}

	@Override
	public List<FlightModel> getAllFlight() {
		return flightDb.findAll();
	}
}