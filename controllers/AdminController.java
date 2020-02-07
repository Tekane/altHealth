package com.bharath.flightreservation.controllers;



import com.bharath.flightreservation.entities.ClientData;
import com.bharath.flightreservation.repos.ClientDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class AdminController {




/*
    @Autowired
    private final ClientDataRepository clientDataRepository = null;


    private static final Logger LOGGER = LoggerFactory.getLogger(AdminController.class);


    @RequestMapping("/admin/admin/showAdmin")
    public String showAddFlight(ModelMap modelMap) {
        List<ClientData> clientData = clientDataRepository.findAll();
        modelMap.addAttribute("clientData",clientData);
        return "displayAllClients";
    }
*/

}
