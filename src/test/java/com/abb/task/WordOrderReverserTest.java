package com.abb.task;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordOrderReverserTest {

    @Test
    public void shouldReverseSentence(){
        //given
        String sentence = "Ala ma kota";

        //when
        String result = WordOrderReverser.reverse(sentence);

        //then
        assertEquals("kota ma Ala", result);
    }
    @Test (expected = IllegalArgumentException.class)
    public void shouldThorwllegalArgException(){
        //given
        String sentence = null;

        //when
        WordOrderReverser.reverse(sentence);
    }

}
