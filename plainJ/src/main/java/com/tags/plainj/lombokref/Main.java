package com.tags.plainj.lombokref;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
   public static void main(String[] args) {
      LombokTest obj1 = LombokTest.builder().name("T1").age(23).build();

      System.out.println(obj1.name);

      LombokTest tst1 = obj1.toBuilder().name("T2").build();

      System.out.println(obj1.equals(tst1));
      System.out.println(obj1.hashCode() + "...." + tst1.hashCode());

     // log.

      //LombokTest obj2 = new LombokTest().name("T3").age(24);
   }
}