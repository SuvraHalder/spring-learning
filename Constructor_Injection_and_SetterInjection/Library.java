package org.Constructor_Injection_and_SetterInjection;

public class Library {

    private  Book myBook;

    public void setLibraryName(String libraryName) {
        LibraryName = libraryName;
    }

    private  String LibraryName;

    public Library(Book myBook) {
        this.myBook = myBook;
    }

    @Override
    public String toString() {
        return "Library{" +
                "myBook=" + myBook.toString() +
                ", LibraryName='" + LibraryName + '\'' +
                '}';
    }
}
