package com.codedifferently.walkthrough.vendingmachine.inventory;

import org.junit.Assert;
import org.junit.Test;

public class GumTest {

    @Test
    public void constructorTest(){
        // Given
        String name = "Big Red";
        Double price = 0.25;
        Gum gumRef = new Gum(name, price);

        // When
        String expected = "Big Red 0.25";
        String actual = gumRef.toString();
        // Then
        Assert.assertEquals("Constructor test",expected, actual);
    }

    @Test
    public void messageTest(){
        //Given
        Gum gumRef = new Gum();

        // When
        String expected = "Chew Chew, Yum!";
        String actual = gumRef.message();

        // Then

        Assert.assertEquals(expected, actual);
    }
}
