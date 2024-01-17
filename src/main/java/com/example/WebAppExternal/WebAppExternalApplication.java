package com.example.WebAppExternal;

import com.example.WebAppExternal.modal.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class WebAppExternalApplication
        extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebAppExternalApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(WebAppExternalApplication.class, args);
    }


}
