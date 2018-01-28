package com.example.wordcounter;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTester {

    @Test
    public void reader_test_1() {
        int words = App.wordcount("The dog barked.");
        assertEquals("for The Dog Barked words", 3, words);
    }
    
    @Test
    public void reader_test_2() {
        int words = App.wordcount("The dog did not bark.");
        assertEquals("if The dog did not bark, words", 5, words);
    }
    
    @Test
    public void reader_test_3() {
        int words = App.wordcount(" ");
        assertEquals("if empty words", 0, words);
    }

    @Test
    public void reader_test_4() {
        int words = App.wordcount("The dog did not bark.But it did poop");
        assertEquals("Testing dot", 9, words);
    }

    @Test
    public void reader_test_5() {
        int words = App.wordcount("The dog did not bark,But it did poop");
        assertEquals("Testing comma", 9, words);
    }

    @Test
    public void reader_test_6() {
        int words = App.wordcount("The dog did not bark. $&*");
        assertEquals("Testing special characters, it should not be word", 5, words);
    }

    @Test
    public void reader_test_7() {
        int words = App.wordcount("The dog did not bark$#^&*(){}[]But it did poop");
        assertEquals("Dividing real words with special character", 9, words);
    }


}

