package com.kodilla.stream;

//import com.kodilla.stream.lambda.ExpressionExecutor;
//import com.kodilla.stream.reference.FunctionalCalculator;
//import com.kodilla.stream.beautifier.PoemBeautifier;
//import com.kodilla.stream.iterate.NumbersGenerator;
//import com.kodilla.stream.book.Book;
//import com.kodilla.stream.book.BookDirectory;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.of(2017, 11, 24);
        Forum theUsersList = new Forum();
        Map<Integer, ForumUser> theResultMapofUsers = theUsersList.getUserList().stream()
                .filter(f -> f.getSex() == 'M')
                .filter(f -> Period.between(f.getBornDate(), currentDate).getYears() >= 20)
                .filter(f -> f.getPostsPublicated() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, f -> f));
        System.out.println(theResultMapofUsers);

        /*BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);*/


        /*BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/



        /*BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);*/



        /*People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);*/





        /* ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Ciekawostka",PoemBeautifier::aBC);
        poemBeautifier.beautify("male litery staja sie duze",PoemBeautifier::uPerCase);
        poemBeautifier.beautify("To bedzie ciekawostka, bo utnie nam zdanie od 10 litery",PoemBeautifier::cutFromTen);
        poemBeautifier.beautify("amazing all a are e now!",PoemBeautifier::replecAllATOE);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/


    }
}