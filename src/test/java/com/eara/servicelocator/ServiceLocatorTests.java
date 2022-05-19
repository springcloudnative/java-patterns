package com.eara.servicelocator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceLocatorTests {

    @Test
    void testingServiceLocatorPattern() throws Exception {
        MessagingService service = ServiceLocator.getService("EmailService");
        String email = service.getMessageBody();
        System.out.println(email);

        MessagingService emailService
                = ServiceLocator.getService("EmailService");
        String newEmail = emailService.getMessageBody();
    }

}