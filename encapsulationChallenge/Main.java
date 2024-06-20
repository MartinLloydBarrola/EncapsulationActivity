package encapsulationChallenge;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Java Programming","John Smith",2021,39.99);
        System.out.printf("Title: %s%nAuthor: %s%nYear Published: %d%nPrice: %.2f %n%n",
                            book1.getTitle(),book1.getAuthor(),book1.getYearPublished(),book1.getPrice()) ;
        Book book2 = new Book("Python Basics","Jane Doe",2020,29.99);
        System.out.printf("Title: %s%nAuthor: %s%nYear Published: %d%nPrice: %.2f %n%n",
                           book2.getTitle(),book2.getAuthor(),book2.getYearPublished(),book2.getPrice()) ;
        Book book3 = new Book("C++ Essentials","Michael Johnson",2019,49.99);
        System.out.printf("Title: %s%nAuthor: %s%nYear Published: %d%nPrice: %.2af %n%n",
                           book3.getTitle(),book3.getAuthor(),book3.getYearPublished(),book3.getPrice()) ;
    }
}