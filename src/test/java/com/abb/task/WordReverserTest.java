package com.abb.task;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordReverserTest {

    @Test
    public void shouldReverseWord(){
        //given
        String sentence = "Ala ma kota";

        //when
        String result = WordReverser.reverse(sentence);

        //then
        assertEquals("alaMaKota", result);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldFailOnNullArg(){
        //given
        String sentence=null;

        //when
        WordOrderReverser.reverse(sentence);
    }
}
