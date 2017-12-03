package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreExecutor {

    public static void main(String args[]) {

        String videoResult = MovieStore.getMovies().entrySet()
                .stream()
                .flatMap(books -> books.getValue().stream())
                .map(String::toString)
                .collect(Collectors.joining("!", "", ""));
        System.out.print(videoResult);

    }
}
