package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test

    public void testGetBooks() {

        Book book1 = new Book("New One", "John Dupski", LocalDate.of(1980, 11, 12));
        Book book2 = new Book("Sands", "Jack Black", LocalDate.of(1990, 9, 23));
        Book book3 = new Book("Stunts", "Jeremy Clarckson", LocalDate.of(2011, 3, 14));

        Library library = new Library("New Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLib = null;
        try {
            clonedLib = library.shallowCopy();
            clonedLib.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        Library deepClonedLib = null;
        try {
            deepClonedLib = library.deepCopy();
            deepClonedLib.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLib);
        System.out.println(deepClonedLib);
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLib.getBooks().size());
        Assert.assertEquals(3, deepClonedLib.getBooks().size());
    }
}
