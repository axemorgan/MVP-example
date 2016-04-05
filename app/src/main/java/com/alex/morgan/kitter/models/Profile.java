package com.alex.morgan.kitter.models;

/**
 * A domain model object representing a kitten's profile
 */
public class Profile {
    private String name;
    private String breed;
    private int age;
    private String description;
    private String location;

    public Profile(String name, String breed, int age, String description, String location) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.description = description;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }
}
