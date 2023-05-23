package com.notification.notification.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notification.notification.entity.Notification;
import com.notification.notification.repository.NotificationRepository;

@Service
public class NotificationService {

	@Autowired
	NotificationRepository notificationRepository;

	public List<Notification> getNotifications() {
		return notificationRepository.findAll();
	}

	public List<Notification> saveNotification(List<Notification> notifications) {
		return notificationRepository.saveAll(notifications);
	}

}
