package com.tags.plainj.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Conversions {
   public String convertArrayToString(String[] arr) {
      return Arrays.stream(arr).collect(Collectors.joining("-"));
   }
}
