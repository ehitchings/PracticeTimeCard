package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by castro on 10/27/16.
 */

@Component
public class DateBaseSeeder implements CommandLineRunner {

private TimeCardRep timeCardRep;

    @Autowired
    public DateBaseSeeder(TimeCardRep rep){
        this.timeCardRep = rep;
    }


    @Override
    public void run(String... strings) throws Exception {

        List<TimeCard> timeCard= new ArrayList<>();

        timeCard.add(new TimeCard("Caonabo Castro","11","9:30","5:33"));
        timeCard.add(new TimeCard("Trump Winn","11","1:00","2:45"));
        timeCard.add(new TimeCard("Phil Bakes","11","8:30","4:33"));

        timeCardRep.save(timeCard);
    }
}
