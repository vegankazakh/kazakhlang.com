package com.kazakhlang.website.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    private static final Logger logger = LoggerFactory.getLogger(LoggingController.class);

    public String logExample() {
        logger.info("This is an info message");

        return "Check the logs for output!";
    }
}
