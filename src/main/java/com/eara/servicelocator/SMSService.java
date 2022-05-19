package com.eara.servicelocator;

public class SMSService implements MessagingService {
    @Override
    public String getMessageBody() {
        return "SMS message";
    }

    @Override
    public String getServiceName() {
        return "SMSService";
    }
}
