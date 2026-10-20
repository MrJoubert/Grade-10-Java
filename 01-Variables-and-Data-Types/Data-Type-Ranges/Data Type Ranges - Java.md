```java
/*
 * Topic: Data Type Ranges
 * Displays the limits of Java's numeric data types.
 */

public class DataTypeRanges {

    public static void main(String[] args) {

        System.out.println("INTEGER DATA TYPE RANGES");
        System.out.println("========================");

        System.out.println("byte minimum: " + Byte.MIN_VALUE);
        System.out.println("byte maximum: " + Byte.MAX_VALUE);

        System.out.println("short minimum: " + Short.MIN_VALUE);
        System.out.println("short maximum: " + Short.MAX_VALUE);

        System.out.println("int minimum: " + Integer.MIN_VALUE);
        System.out.println("int maximum: " + Integer.MAX_VALUE);

        System.out.println("long minimum: " + Long.MIN_VALUE);
        System.out.println("long maximum: " + Long.MAX_VALUE);

        System.out.println();
        System.out.println("FLOATING-POINT DATA TYPES");
        System.out.println("=========================");

        System.out.println("float smallest positive value: "
                + Float.MIN_VALUE);
        System.out.println("float maximum: " + Float.MAX_VALUE);
        System.out.println("float most negative value: "
                + (-Float.MAX_VALUE));

        System.out.println("double smallest positive value: "
                + Double.MIN_VALUE);
        System.out.println("double maximum: " + Double.MAX_VALUE);
        System.out.println("double most negative value: "
                + (-Double.MAX_VALUE));

    }

}
```
