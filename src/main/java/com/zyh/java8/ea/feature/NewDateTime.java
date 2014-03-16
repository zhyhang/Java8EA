/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zyh.java8.ea.feature;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author zhyhang
 */
public class NewDateTime {
    
    public static void main(String... argv){
        localeDate();
    }
    
    private static void localeDate() {
        // the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        // 2014-02-10
        LocalDate tenthFeb2014 = LocalDate.of(2014, Month.FEBRUARY, 10);
        System.out.println(tenthFeb2014);
        // months values start at 1 (2014-08-01)
        LocalDate firstAug2014 = LocalDate.of(2014, 8, 1);
        System.out.println(firstAug2014);
        // the 65th day of 2010 (2010-03-06)
        LocalDate sixtyFifthDayOf2010 = LocalDate.ofYearDay(2010, 65);
        System.out.println(sixtyFifthDayOf2010);
    }
    
    private static void timestamp(){
        // current time
        Instant now = Instant.now();

        // from unix timestamp, 2010-01-01 12:00:00
        Instant fromUnixTimestamp = Instant.ofEpochSecond(1262347200);

        // same time in millis
        Instant fromEpochMilli = Instant.ofEpochMilli(1262347200000l);

        // parsing from ISO 8601
        Instant fromIso8601 = Instant.parse("2010-01-01T12:00:00Z");

        // toString() returns ISO 8601 format, e.g. 2014-02-15T01:02:03Z
        String toIso8601 = now.toString();

        // as unix timestamp
        long toUnixTimestamp = now.getEpochSecond();

        // in millis
        long toEpochMillis = now.toEpochMilli();

        // plus/minus methods are available too
        Instant nowPlusTenSeconds = now.plusSeconds(10);
        Instant.
        
    }
    
}
