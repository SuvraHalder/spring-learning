package org.Constructor_Injection_and_SetterInjection;

public class Book {

    String tittle;
    String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
