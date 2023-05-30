package com.sap.adt.abapcleaner.rules.declarations;

public enum EscapeCharMeasure {
   ALWAYS,
   KEEP_AS_IS,
   ONLY_FOR_ABAP_WORDS,
   ONLY_AVOID_ERRORS;

   public static final int SIZE = java.lang.Integer.SIZE;

   public int getValue() {
      return this.ordinal();
   }

   public static EscapeCharMeasure forValue(int value) {
      return values()[value];
   }

}
