package com.hadeslee;

/**
 * Created by hadeslee on 2016-11-29.
 */
public class Player {
    private String name;
    private int age; //나이
    private int experienceUear; //경력

    public Player(String name, int age, int experienceUear) {
        this.name = name;
        this.age = age;
        this.experienceUear = experienceUear;
    }

    public String getName() {
        return name;
    }

    public int getAbilityPoint() {
        return (30 - this.age) + experienceUear;
    }
}
