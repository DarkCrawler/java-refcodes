package com.tags.plainj;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class JodaFun {

   static String DATE = "yyyy-MM-dd";
   static String HOUR = "'T'HH";
   static String MINUTE = ":mm";
   static String SECOND = ":ss";
   static String MILLIS = ".SSS";
   static String TIMEZONE = "Z";
   static DateTimeFormatter LOCALDATETIME_FORMATTER = DateTimeFormat.forPattern(DATE).withZoneUTC();
   static DateTimeFormatter LOCALDATETIME_HOURS_MINUTES_FORMATTER = DateTimeFormat.forPattern(DATE + HOUR + MINUTE).withZoneUTC();

   public static void main(String[] args) {
      DateTime curr = DateTime.now();
      //"(eventTimeStamp=le='2018-10-30T08:50';eventTimeStamp=gt='2018-10-29T08:50')

      /*activeRecommendations = activeRecommendations.replace(DEPARTURE_DATE_PLACE_HOLDER,
         today.withTimeAtStartOfDay().minusDays(2).toString(DateTimeFormatters.LOCALDATETIME_FORMATTER));*/
      System.out.println("====>" + curr.toString(LOCALDATETIME_FORMATTER));
      System.out.println(curr.toString(LOCALDATETIME_HOURS_MINUTES_FORMATTER));
   }
}
