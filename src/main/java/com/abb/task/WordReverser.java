package com.abb.task;

class WordReverser {

    static String reverse(String sentence) {

        if(sentence == null){
            throw new IllegalArgumentException();
        }

        String[] words = sentence.split(" ");

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < words.length; i++) {
            char firstLetter = words[i].charAt(0);
            if (i == 0) {
                String lowerFirstLetter = Character.toString(firstLetter).toLowerCase();
                sb.append(words[i].replaceFirst(Character.toString(firstLetter), lowerFirstLetter));
            } else {
                String upperFirstLetter = Character.toString(firstLetter).toUpperCase();
                sb.append(words[i].replaceFirst(Character.toString(firstLetter), upperFirstLetter));
            }

        }
        return sb.toString();
    }
}
