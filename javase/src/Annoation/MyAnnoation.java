package Annoation;

public @interface MyAnnoation {
    String name();

    String color() default "red";

    String[] str();
}
