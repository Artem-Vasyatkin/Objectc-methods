import java.util.Objects;

public class Book {
    private String name;
    private int yearOfPublicationOfTheBook;
    private Author author;

    public Book(String name, int yearOfPublicationOfTheBook, Author author) {
        this.name = name;
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
        this.author = author;
    }

    public void setYearOfPublicationOfTheBook(int year) {
        yearOfPublicationOfTheBook = year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublicationOfTheBook() {
        return yearOfPublicationOfTheBook;
    }

    public boolean equals(Object b) {
        if (this == b) {
            return true;
        }
        if (b == null || getClass() != b.getClass()) {
            return false;
        }
        Book book = (Book) b;
        return Objects.equals(yearOfPublicationOfTheBook, book.yearOfPublicationOfTheBook)
                && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    public int hashCode() {
        return Objects.hash(name, yearOfPublicationOfTheBook, author);
    }

    public String toString() {
        return "Название книги - " + getName() + "," +
                " Год выпуска - " + getYearOfPublicationOfTheBook() + "," +
                " Автор книги - " + getAuthor();
    }

}
