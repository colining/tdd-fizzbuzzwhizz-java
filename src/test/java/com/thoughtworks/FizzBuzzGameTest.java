package com.thoughtworks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzGameTest {
    private FizzBuzzGame fizzBuzzGame;

    @Before
    public void setUp() {
        fizzBuzzGame = new FizzBuzzGame();
    }

    @Test
    public void should_return_Fizz_when_have_3() {
        int test = 13;
        Assert.assertEquals("Fizz", fizzBuzzGame.isHave3(test));
        test = 31;
        Assert.assertEquals("Fizz", fizzBuzzGame.isHave3(test));
        test = 25;
        Assert.assertEquals("Buzz", fizzBuzzGame.isHave3(test));
        test = 16;
        Assert.assertEquals("", fizzBuzzGame.isHave3(test));
    }

    @Test
    public void should_return_Fizz_when_is_multiple_3() {
        int test = 3;
        Assert.assertEquals("Fizz", fizzBuzzGame.isMultiple3(test));
        test = 5;
        Assert.assertEquals("", fizzBuzzGame.isMultiple3(test));
    }
    @Test
    public void should_return_Buzz_when_is_multiple_5() {
        int test = 5;
        Assert.assertEquals("Buzz", fizzBuzzGame.isMultiple5(test));
        test = 3;
        Assert.assertEquals("", fizzBuzzGame.isMultiple5(test));
    }
    @Test
    public void should_return_Whizz_when_is_multiple_7() {
        int test = 7;
        Assert.assertEquals("Whizz", fizzBuzzGame.isMultiple7(test));
        test = 3;
        Assert.assertEquals("", fizzBuzzGame.isMultiple7(test));
    }

    @Test
    public void should_return_Fizz_Buzz_Whizz() {
        int test = 210;
        Assert.assertEquals("FizzBuzzWhizz",fizzBuzzGame.reportNumber(test));
         test = 60;
        Assert.assertEquals("FizzBuzz",fizzBuzzGame.reportNumber(test));
        test = 140;
        Assert.assertEquals("BuzzWhizz",fizzBuzzGame.reportNumber(test));
        test = 21;
        Assert.assertEquals("FizzWhizz",fizzBuzzGame.reportNumber(test));
        test = 30;
        Assert.assertEquals("Fizz",fizzBuzzGame.reportNumber(test));
        test = 70;
        Assert.assertEquals("Whizz",fizzBuzzGame.reportNumber(test));
        test = 35;
        Assert.assertEquals("Fizz",fizzBuzzGame.reportNumber(test));
    }

    @Test
    public void should_return_100() {
        int count = 100;
        fizzBuzzGame.start(count);
        Assert.assertEquals(100, fizzBuzzGame.getResults().size());
    }
}
