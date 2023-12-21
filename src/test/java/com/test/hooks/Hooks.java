package com.test.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;


public class Hooks {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("This is executed before first scenario");
    }
    @Before
    public void before() {
        System.out.println( "This is executed before every scenario");
    }

    @After
    public void after(){
        System.out.println("This is executed after every scenario");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("This is executed after last scenario");
    }
}
