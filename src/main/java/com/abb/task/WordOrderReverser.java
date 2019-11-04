package com.abb.task;

class WordOrderReverser {
    static String reverse(String sentence) {

        if(sentence == null){
            throw new IllegalArgumentException();
        }

        String[] splitedSentence = sentence.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = splitedSentence.length-1; i>=0; i--){
            sb.append(splitedSentence[i]).append(" ");
        }

        return sb.toString().trim();
    }
}
