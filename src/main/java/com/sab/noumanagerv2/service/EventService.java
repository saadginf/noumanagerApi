package com.sab.noumanagerv2.service;

import java.util.List;

import com.sab.noumanagerv2.entities.Country;
import com.sab.noumanagerv2.entities.Event;

public interface EventService {
    public Event addEvent(Event e);

    public Event editEvent(Event e);

    public Event getById(Long id);

    public List<Event> getAllEvents();

    public List<Event> getEventsByTh(Country th);

    public void deleteEvent(Long id);

    public List<Event> getEvents(Long[] ids);
}