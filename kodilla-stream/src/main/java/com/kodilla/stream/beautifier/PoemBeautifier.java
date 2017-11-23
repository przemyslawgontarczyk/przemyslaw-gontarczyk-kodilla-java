package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String textToDecorate, PoemDecorator poemDecorator){

        String finalText = poemDecorator.decorate(textToDecorate);
        System.out.println(finalText);
    }

    public static String aBC(String textToDecorate){
        return "ABC"+textToDecorate+"ABC";
    }

    public static String uPerCase(String textToDecorate){
        return textToDecorate.toUpperCase();
    }

    public  static String cutFromTen(String textToDecorate){
        return textToDecorate.substring(10);
    }

    public static String replecAllATOE(String textToDecorate){
        return  textToDecorate.replaceAll("a","e");
    }
}
