package com.frankmoley.lil.learningspring.web;

import com.frankmoley.lil.learningspring.business.ReservationService;
import com.frankmoley.lil.learningspring.data.Guest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/guests")
public class GuestController {
    private final ReservationService guestService;

    public GuestController(ReservationService guestService) {
        this.guestService = guestService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getHotelGuest(Model model){
        List<Guest> guestList = this.guestService.getHotelGuests();
        model.addAttribute("guestsList", guestList);
        return "hotel-guests";
    }
}
