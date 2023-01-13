package com.digitaltrack.notification.service;

import com.digitaltrack.clients.notification.NotificationRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class NotificationConsumer {
    private final NotificationService notificationService;

    @RabbitListener(queues = "${rabbitmq.queues.notification}")
    public void consumeNotification(NotificationRequest notificationRequest) {
        log.info("consumed {} ", notificationRequest);
        notificationService.send(notificationRequest);
    }
}
