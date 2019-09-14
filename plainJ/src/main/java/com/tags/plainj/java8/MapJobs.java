package com.tags.plainj.java8;

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class MapJobs {

   public static void convert_map_to_list() {

      /*

      //basic filtering of key using key set
      Map<String, Integer> testMap = new HashMap<>();
      testMap.put("A", 1);
      testMap.put("B", 2);
      testMap.put("C", 1);
      testMap.put("D", 1);

      List testList = testMap.keySet().stream()
         .filter(string -> !string.equals("B"))
         .collect(Collectors.toList());

      System.out.println("===>" + testList);
      */

      Map<String, List<Integer>> testMap = new HashMap<>();
      testMap.put("A", Arrays.asList(1, 2, 3, 4, 5));
      testMap.put("B", Arrays.asList(8, 9, 10));
      testMap.put("C", Arrays.asList(1, 2, 4));
      testMap.put("D", Arrays.asList(2, 4, 5));

      List<Integer> testList = new ArrayList<>();
      testMap.forEach((k, v) -> {
         if (!k.equals("B")) {
            testList.addAll(v);
         }
      });

      //  System.out.println("====>" + testList);

      List<Integer> testList2 = new ArrayList<>();
      Set<Integer> sets = new HashSet<>();
      testMap.values().stream().forEach(listx -> testList2.addAll(listx));
      //testMap.values().stream().forEach(listx -> sets.addAll(listx));

      //List <Integer> testList3 = testMap.values().stream().map(list -> list).stream().collect(Collectors.toList());

      System.out.println("**********" + testList2);
   }

   public static void map_computeIfAbsent() {
      Map<String, List<Integer>> testMap = new HashMap<>();

      testMap.computeIfAbsent("a", intlist -> new ArrayList<>()).add(1);
      testMap.computeIfAbsent("a", intlist -> new ArrayList<>()).add(2);

      testMap.forEach((key, value) -> {
         System.out.println(key + "----" + value.stream().map(v -> Integer.toString(v)).collect(Collectors.joining()));
      });
   }

   public static void map_filterAndCollecByValue() {
      Map<String, List<Integer>> randMap = new HashMap<>();
      randMap.put("a", Arrays.asList(1, 2, 3, 4, 5));
      randMap.put("b", Arrays.asList(1, 2, 3, 4, 5));
      randMap.put("c", Arrays.asList(1, 2, 3));
      randMap.put("e", Arrays.asList(1, 2, 3));
      randMap.put("f", Arrays.asList(1, 2));

      Map<String, List<Integer>> filterMap = randMap.entrySet().stream()
         .filter(map -> map.getValue().size() > 3)
         .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

      System.out.println("====> Filtererd Map size ::::" + filterMap.size());
   }

   public static void groupList() {
      List<Integer> randNum = Arrays.asList(1, 5, 34, 7, 8, 3, 5, 8, 44, 55, 66, 34, 22);
      Map<Boolean, List<Integer>> test = randNum.stream().collect(groupingBy(it -> (Integer) it > 15));
      System.out.println("====>" + test.size());
      System.out.println("~~~~~~~" + test.get(true).size() + "----" + test.get(false).size());
   }

   public static void map_changeKeyNames() {
      Map<String, List<Integer>> randMap = new HashMap<>();
      randMap.put("a", Arrays.asList(1, 2, 3, 4, 5));
      randMap.put("b", Arrays.asList(1, 2, 3, 4, 5));
      randMap.put("c", Arrays.asList(1, 2, 3));
      randMap.put("e", Arrays.asList(1, 2, 3));
      randMap.put("f", Arrays.asList(1, 2));
   }

   public static void main(String[] args) {
      //MapJobs.map_computeIfAbsent(); //example map compute if absent
      //map_filterAndCollecByValue();
      //groupList();
      convert_map_to_list();
   }
}

