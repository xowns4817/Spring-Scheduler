package com.example.demo;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Schedule {
    @Async
    @Scheduled(cron = "*/1 * * * * *")
    public void cronJob( ) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        String strDate = sdf.format(now);
        System.out.println(Thread.currentThread());
        System.out.println("Java cron job expression:: " + strDate);
        for(int i=0; i<10; i++) { System.out.println("A");}
    }

    @Async
    @Scheduled(cron = "*/1 * * * * *")
    public void cronJob2( ) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        String strDate = sdf.format(now);
        System.out.println(Thread.currentThread());
        System.out.println("Java cron2 job expression:: " + strDate);
        for(int i=0; i<10; i++) { System.out.println("B");}
    }
}
