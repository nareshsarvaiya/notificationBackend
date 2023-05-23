package com.notification.notification.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notification.notification.entity.Notification;
import com.notification.notification.service.NotificationService;


@CrossOrigin(origins = "http://localhost:4200/") 
@RequestMapping("api")
@RestController
public class NotificationController {

	@Autowired
	private NotificationService notificationService;

	@PostMapping("/submit")
	public List<Notification> saveNotification(@RequestBody List<Notification> notifications) {
		return notificationService.saveNotification(notifications);
	}

	@GetMapping("/get")
	public List<Notification> getNotification() {
		return notificationService.getNotifications();
	}

}
