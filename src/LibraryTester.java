public class LibraryTester {
    public static void main(String[] args) {
        BookShelf oShelf = new BookShelf('O');
        BookShelf tShelf = new BookShelf('T');

        System.out.println(oShelf);
        System.out.println(tShelf);

        Book[] booksToShelve = {
            new Book("The Heart of the Betrayed", "Crime"),
            new Book("Our Hill of Stars", "Fantasy"),
            new Book("One of a Kind", "Science Fiction"),
            new Book("The Vision of Roses", "Romance")
        };

        for (int i = 0; i < booksToShelve.length; i++) {
            System.out.println(booksToShelve[i]);
            oShelf.addBook(booksToShelve[i]);
            tShelf.addBook(booksToShelve[i]);
        }

        System.out.println(oShelf);
        System.out.println(tShelf);
    }
}
