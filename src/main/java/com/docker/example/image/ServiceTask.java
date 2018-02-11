package com.docker.example.image;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Created by Alex Tarasov on 2/8/2018.
 */
@Service
public class ServiceTask {

    @Scheduled(fixedDelay = 5000)
    public void task() {
        System.out.println("Hello, I'm scheduled task, which print message every 5 sec. " + " >> " +
                Thread.currentThread().getName() + " " + LocalDateTime.now().toString());
    }
}
