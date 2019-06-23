package com.docker.example.image;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Alex Tarasov on 2/8/2018.
 */
@Service
public class ServiceTask {

    @Scheduled(fixedDelay = 20)
    public void task() {
        int randomNum = ThreadLocalRandom.current().nextInt(10, 100 + 1);
        System.out.println("Hello, I'm scheduled task, which print random message every 5 sec. " + " >> " +
                Thread.currentThread().getName() + " " + LocalDateTime.now().toString() + "\n\n\t" +
                randomText(randomNum));
    }

    public static String randomText(int targetStringLength) {
        if (targetStringLength == 0) targetStringLength = 10;

        return RandomStringUtils.randomAlphabetic(targetStringLength);
    }
}
