package com.baloise.demo;

public class HelloDto {

    private String greeting;

    public HelloDto(String greeting) {
        this.greeting = greeting;
    }

    public HelloDto() {
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
