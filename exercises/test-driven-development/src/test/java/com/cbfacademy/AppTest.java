package com.cbfacademy;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName(value = "Basic Test Suite")
public class AppTest {

    @Test
    @DisplayName("creates the app")
    public void createsAnApp() {
        final App app = new App();

        assertThat(app, is(notNullValue()));
    }
    @Test

void FizzBuzztest(){
    FizzBuzz fizzbuzz = new FizzBuzz();
    assertEquals("FizzBuzz", fizzbuzz.get(15));
}
@Test
void Fizztest(){
    FizzBuzz fizzbuzz = new FizzBuzz();
    assertEquals("Fizz", fizzbuzz.get(3));
    assertEquals("Fizz", fizzbuzz.get(6));
    assertEquals("Fizz", fizzbuzz.get(9));
    assertEquals("Fizz", fizzbuzz.get(12));



}
@Test
void Buzztest(){
    FizzBuzz fizzbuzz = new FizzBuzz();
    assertEquals("Buzz", fizzbuzz.get(5));
    assertEquals("Buzz", fizzbuzz.get(10));
   
}

@Test
void Numtest(){
    FizzBuzz fizzbuzz = new FizzBuzz();
    assertEquals("1", fizzbuzz.get(1));
    assertEquals("2", fizzbuzz.get(2));
    assertEquals("4", fizzbuzz.get(4));
    assertEquals("7", fizzbuzz.get(7));
    

}

@Test
//years divisible by 400 are leap years
void divisibleby400(){
    
}
}