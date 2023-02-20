package com.applitools.hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;

public class CleanDatabase {
    @Before
    public static void beforeHook() {
        System.out.println("Before Hook");
    }

    @Before("tags")
    public static void beforeHookTags() {
        System.out.println("Before Hook");
    }
    @After
    public static void afterHook() {
        System.out.println("After Hook");
    }
}
