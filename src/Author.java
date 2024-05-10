import java.util.Objects;

public class Author {
    private String name;
    private String surname;


    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public boolean equals(Object a) {
        if (this == a) {
            return true;
        }
        if (a == null || this.getClass() != a.getClass()) {
            return false;
        }
        Author author = (Author) a;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

    public String toString() {
        return getName() + " " + getSurname();
    }
}
