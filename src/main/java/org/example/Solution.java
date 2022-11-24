package org.example;

public class Solution {
    public Solution(){

    }

    public String reverseWords(String s) {

        String result;
        StringBuilder aux = new StringBuilder();
        String[] listWords =  s.trim().replaceAll("\\s+", " ").split(" ");


       for (int i = listWords.length - 1; i >= 0; i--){

           aux.append(listWords[i]).append(" ");
       }

       result = aux.toString().trim();

        return result;
    }
}