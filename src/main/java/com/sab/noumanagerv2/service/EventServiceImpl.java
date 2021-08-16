package com.sab.noumanagerv2.service;

import java.util.List;

import com.sab.noumanagerv2.dao.EventRepo;
import com.sab.noumanagerv2.entities.Country;
import com.sab.noumanagerv2.entities.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    EventRepo eRepo;

    @Override
    public Event addEvent(Event e) {
        // TODO Auto-generated method stub
        return eRepo.save(e);
    }

    @Override
    public Event editEvent(Event e) {
        // TODO Auto-generated method stub
        return eRepo.save(e);
    }

    @Override
    public Event getById(Long id) {
        // TODO Auto-generated method stub
        return eRepo.findById(id).get();
    }

    @Override
    public List<Event> getEventsByTh(Country th) {
        // TODO Auto-generated method stub
        return eRepo.findByCountry(th);
    }

    @Override
    public void deleteEvent(Long id) {
        eRepo.deleteById(id);

    }

    @Override
    public List<Event> getEvents(Long[] ids) {
        // TODO Auto-generated method stub
        return eRepo.findAll();
    }

    @Override
    public List<Event> getAllEvents() {
        // TODO Auto-generated method stub
        return eRepo.findAll();
    }

}