package com.notification;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public abstract class NotificationEvent {

    private NotificationType type;
}
