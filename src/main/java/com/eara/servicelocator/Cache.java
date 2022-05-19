package com.eara.servicelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    private List<MessagingService> services = new ArrayList<>();

    public Cache() {
        services = new ArrayList<MessagingService>();
    }

    public MessagingService getService(String serviceName) {
        for (MessagingService service: services) {
            if (service.getServiceName().equalsIgnoreCase(serviceName)) {
                System.out.println(String.format("Returning cached %s object", serviceName));
                return service;
            }
        }

        return null;
    }

    public void addService(MessagingService newService){
        boolean exists = false;

        for (MessagingService service : services) {
            if(service.getServiceName().equalsIgnoreCase(newService.getServiceName())){
                exists = true;
            }
        }
        if(!exists){
            services.add(newService);
        }
    }
}
