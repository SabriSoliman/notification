package com.digitaltrack.notification;

import com.digitaltrack.amqp.RabbitMessageProducer;
import com.digitaltrack.notification.config.NotificationConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@ComponentScan( basePackages= {
        "com.digitaltrack.notification",
        "com.digitaltrack.amqp"
})
public class NotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }
//        @Bean
//        CommandLineRunner commandLineRunner(
//            RabbitMessageProducer producer,
//            NotificationConfig notificationConfig
//            ) {
//        return args -> {
//            producer.publish(
//                    new Person("Ali", 18),
//                    notificationConfig.getInternalExchange(),
//                    notificationConfig.getRoutingKey());
//        };
//    }
//
//    record Person(String name, int age){}
}
