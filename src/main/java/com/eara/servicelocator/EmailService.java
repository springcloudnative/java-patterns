package com.eara.servicelocator;

public class EmailService implements MessagingService {
    @Override
    public String getMessageBody() {
        return "email message";
    }

    @Override
    public String getServiceName() {
        return "EmailService";
    }
}
