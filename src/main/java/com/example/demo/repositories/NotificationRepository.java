package com.example.demo.repositories;

import com.example.demo.models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface NotificationRepository  extends JpaRepository<Notification, Long> {
}
