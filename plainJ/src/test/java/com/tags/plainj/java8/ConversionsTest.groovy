package com.tags.plainj.java8

import spock.lang.Specification
import spock.lang.Subject

class ConversionsTest extends Specification {
   @Subject conversion = new Conversions()

   def "convert array of strings to string"() {
      given:
      def stringArray = ["TIM", "JIM", "SIM"] as String[]

      when:
      def actual = conversion.convertArrayToString(stringArray)

      then:
      actual == "TIM-JIM-SIM"
   }
}
