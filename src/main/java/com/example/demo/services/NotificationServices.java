package com.example.demo.services;

import com.example.demo.models.Notification;
import com.example.demo.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationServices {
    @Autowired
    public NotificationRepository notificationRepo;

    public Notification addNotification(Notification s) {
        return  notificationRepo.save(s);
    }

    public List<Notification> getAll() {
        return  notificationRepo.findAll();
    }

    public Optional<Notification> findById(Long id) {
        return notificationRepo.findById(id);
    }

    public void deleteById(Long id) {
        notificationRepo.deleteById(id);
    }
}
