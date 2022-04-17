package com.notification;

import lombok.Builder;

public class SmsNotificationEvent extends NotificationEvent {

    private final String phoneNumber;

    @Builder
    public SmsNotificationEvent(NotificationType type, String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
