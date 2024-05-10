public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Person sarah = new Person("Sarah", 30);
        if (personService.isAdult(sarah)) {
            System.out.println("Иди в бар");
        } else {
            System.out.println("Иди в школу");
        }
        System.out.println(sarah);

        System.out.println("Homework");
        System.out.println("Task №1");

        Author sagan = new Author("Carl", "Sagan");
        Author deutsch = new Author("David", "Deutsch");

        Book book1 = new Book("A world full of demons",
                2022, sagan);
        Book book2 = new Book("The beginning of infinity",
                2021, deutsch);
        book2.setYearOfPublicationOfTheBook(2011);

        System.out.println("Название книги - " + book1.getName() + "," +
                " Год выпуска - " + book1.getYearOfPublicationOfTheBook() + "," +
                " Автор книги - " + sagan.getName() + " " + sagan.getSurname());

        System.out.println("Название - " + book2.getName() + "," +
                " Год выпуска - " + book2.getYearOfPublicationOfTheBook() + "," +
                " Автор книги - " + deutsch.getName() + " " + deutsch.getSurname());

        System.out.println(book1);
        System.out.println(book2);
    }

}