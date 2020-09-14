package com.vynga.insurance.mymedicare.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SubscriberNotFoundException extends RuntimeException {

    public SubscriberNotFoundException(String exception) {
        super(exception);
    }

}