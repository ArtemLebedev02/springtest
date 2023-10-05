package ru.artem.spring_app0;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloBean {
    private String message;

    public HelloBean(@Value("${hello.message}") String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
