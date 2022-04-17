package com.notification.service;


import com.notification.domain.NotificationEvent;

public interface NotificationService {

    void postNotification(NotificationEvent event);
}
