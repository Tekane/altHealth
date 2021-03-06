package com.bharath.flightreservation.controllers;


import com.bharath.flightreservation.entities.Appointment;
import com.bharath.flightreservation.services.AppointmentsService;
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
public class AppointmentUpdateController {


/*

	@Autowired
	AppointmentsService appointmentsService;


	@Autowired
	ReportUtil reportUtil;



	@Autowired
	ServletContext sc;

	@RequestMapping("admin/showCreateAppointment")
	public String showCreateAppointment() {

		return "createAppointment";
	}

	@RequestMapping("/admin/displayAllAppointmentData")
	public String displayAllAppointmentData() {

		return "redirect:/admin/displayAppointments";
	}


	@RequestMapping("/admin/saveAppointment")
	public String saveAppointment(@ModelAttribute("appointment") Appointment appointments, ModelMap modelMap) {
		Appointment appointment1 = appointmentsService.saveAppointment(appointments);
		String msg = "Appointmnet saved with id: " + appointment1.getId();
		modelMap.addAttribute("msg", msg);
		return "createAppointment";
	}

	@RequestMapping("/admin/displayAppointments")
	public String displayAppointments(ModelMap modelMap) {
		List<Appointment> appointments = appointmentsService.getAllAppointment();
		modelMap.addAttribute("appointments", appointments);
		return "appointmentsAll";
	}

	@RequestMapping("/admin/deleteAppointments")
	public String deleteAppointments(@RequestParam("id") long id, ModelMap modelMap) {
		Appointment appointment = new Appointment();
		appointment.setId(id);
		appointmentsService.deleteAppointment(appointment);
		List<Appointment> appointmentList = appointmentsService.getAllAppointment();
		modelMap.addAttribute("appointmentList", appointmentList);
		return "redirect:/admin/displayAppointments";
	}

	@RequestMapping("/admin/showAppointments")
	public String showAppointments(@RequestParam("id") int id, ModelMap modelMap) {
		Appointment appointment = appointmentsService.getAppointmentById(id);
		modelMap.addAttribute("appointment", appointment);
		return "updateAppointment";
	}

	@RequestMapping("admin/updateAppointments")
	public String updateAppointments(@ModelAttribute("appointment") Appointment appointment, ModelMap modelMap) {
		appointmentsService.updateAppointments(appointment);
*/
/*		List<Appointment> appointmentList = appointmentsService.getAllAppointment();
		modelMap.addAttribute("appointmentList", appointmentList);*//*

		return "redirect:/admin/displayAppointments";
	}

*/


}
