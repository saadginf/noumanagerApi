package com.sab.noumanagerv2.api;

/*import java.util.List;

import com.sab.noumanagerv2.entities.Country;
import com.sab.noumanagerv2.entities.Event;
import com.sab.noumanagerv2.service.CountryService;
import com.sab.noumanagerv2.service.EventService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin
@RestController
@RequestMapping("api")
public class EventController {
    @Autowired
    EventService eService;
    @Autowired
    CountryService cService;

    @GetMapping("/events")
    public List<Event> getAllProjects() {
        return eService.getAllEvents();

    }

    @PostMapping(value = "/events")
    public Event saveEvent(@RequestBody Event e) {
        // TODO: process POST request

        return eService.addEvent(e);
    }

    @GetMapping("eventsbycount/{thId}")
    public ResponseEntity<?> getEventByTh(@PathVariable Long thId) {

        Country th = cService.getById(thId);

        List<Event> p = eService.getEventsByTh(th);
        return new ResponseEntity<List<Event>>(p, HttpStatus.OK);
    }

    @GetMapping("events/{id}")
    public Event getEventId(@PathVariable Long id) {
        return eService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Long id) {
        eService.deleteEvent(id);

    }

    @PostMapping("/countries")
    public ResponseEntity<?> addTheme(@RequestBody Country li) {

        Country lieux = cService.addLieux(li);
        return new ResponseEntity<Country>(lieux, HttpStatus.OK);

    }

    @GetMapping("/countries")
    public ResponseEntity<?> getAllCountries() {

        return new ResponseEntity<List<Country>>(cService.getAllCountries(), HttpStatus.OK);

    }

}
*/