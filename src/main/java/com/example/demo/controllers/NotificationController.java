package com.example.demo.controllers;

import com.example.demo.models.Notification;
import com.example.demo.services.NotificationServices;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("api/notification")


public class NotificationController {
    @Autowired
    public NotificationServices notificationService;

    @PostMapping("/")
    public Notification addNotification(@RequestBody  Notification s){
        return notificationService.addNotification (s);
    }
    @GetMapping("/")
    public List<Notification> getAll(){
        return notificationService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Notification> getById(@PathVariable Long id){
        return notificationService.findById(id);

    }
    @PutMapping("/{id}")
    public Notification addNotification(@RequestBody Notification s, @PathVariable Long id ){
        s.setId(id);
        return notificationService.addNotification(s);

    }
    @DeleteMapping("/{id}")
    public  void deleteMe(@PathVariable Long id){
        notificationService.deleteById(id);
    }
}


