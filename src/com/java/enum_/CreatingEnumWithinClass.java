package com.java.enum_;

public class CreatingEnumWithinClass {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
        
        // looping the enum values
        for (Level enumValues : Level.values()) {
            System.out.println(enumValues);
        }
    }
}
