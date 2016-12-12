package com.egencia.webapp.casper.calendar;

import org.quartz.*;

import java.io.IOException;

/**
 * Created by pkapoor on 12/12/16.
 */
public class CalendarJob implements Job {

    public void execute(JobExecutionContext context)
            throws JobExecutionException {
        System.out.println("Starting quartz scheduler");

        SchedulerContext schedulerContext = null;
        try {
            schedulerContext = context.getScheduler().getContext();
        } catch (SchedulerException e1) {
            e1.printStackTrace();
        }
        CalendarAuth calendarAuth =
                (CalendarAuth) schedulerContext.get("calendarAuth");
        try {
            calendarAuth.publishEvents();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
