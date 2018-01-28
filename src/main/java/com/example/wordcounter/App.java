package com.example.wordcounter;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Word Count Testing App!");
    }
    
    public static int wordcount(String s) {
        List<String> words =  new LinkedList<String>(Arrays.asList(s
                .replace(".", " ")
                .replace(",", " ")
                .replaceAll("[^a-zA-Z0-9\\s]", "")
                .split(" ")));

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals("")) {
                words.remove(i);
                i--;
            }
        }

        return words.size();
    }
}
