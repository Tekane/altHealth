package com.bharath.flightreservation.controllers;

import com.bharath.flightreservation.entities.ClientInfo;
import com.bharath.flightreservation.services.ClientInfoService;
import com.bharath.flightreservation.util.ReportUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletContext;
import java.util.List;

@Controller
public class ClientInfoController {

	@Autowired
	ClientInfoService clientInfoService;


	@Autowired
	ReportUtil reportUtil;



	@Autowired
	ServletContext sc;

	@RequestMapping("/admin/showCreate")
	public String showCreate() {
		return "createClient";
	}

	@RequestMapping("/admin/displayAll")
	public String displayAllClients() {
		return "redirect:/admin/displayClients";
	}

	@RequestMapping("/admin/saveLoc")
	public String saveLocation(@ModelAttribute("clientData") ClientInfo clientInfo, ModelMap modelMap) {
		ClientInfo savedClient = clientInfoService.saveClientInfo(clientInfo);
		String msg = "Location saved with id: " + savedClient.getClientId();
		modelMap.addAttribute("msg", msg);
		return "createClient";
	}

/*	@RequestMapping("admin/AllClients")
	public String AllClients(ModelMap modelMap) {
		List<ClientInfo> clientInfo = clientInfoService.getAllClientsInfo();
		modelMap.addAttribute("clientInfo", clientInfo);
		return "displayAllClients";
	}*/

		@RequestMapping("admin/clientsInfomation")
	public String clientsInfomation(ModelMap modelMap) {
		List<ClientInfo> clientInfo = clientInfoService.getAllClientsInfo();
		modelMap.addAttribute("clientInfo", clientInfo);
		return "displayAllClients";
	}


	@RequestMapping("/admin/deleteClient")
	public String deleteClient(@RequestParam("id") long id, ModelMap modelMap) {
		// Location location = service.getLocationById(id);
		ClientInfo clientInfo = new ClientInfo();
		clientInfo.setClientId(id);
		clientInfoService.deleteClient(clientInfo);
		List<ClientInfo> clientInfoList = clientInfoService.getAllClientsInfo();
		modelMap.addAttribute("clientInfoList", clientInfoList);
		return "redirect:/admin/displayClients";
	}

	@RequestMapping("/admin/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
		ClientInfo clientInfo = clientInfoService.getClientInfoById(id);
		modelMap.addAttribute("clientInfo", clientInfo);
		return "updateClient";
	}

	@RequestMapping("/admin/updateLoc")
	public String updateLocation(@ModelAttribute("clientInfo") ClientInfo clientInfo, ModelMap modelMap) {
		clientInfoService.updateClient(clientInfo);
		List<ClientInfo> clientInfoList = clientInfoService.getAllClientsInfo();
		modelMap.addAttribute("clientInfoList", clientInfoList);
		return "redirect:/admin/displayClients";
	}



}
