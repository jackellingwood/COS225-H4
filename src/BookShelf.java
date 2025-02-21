import java.util.ArrayList;

public class BookShelf {
    private char _letter;
    private final ArrayList<Book> _books; // final because vscode said so

    public BookShelf(char letter) {
        _letter = letter;
        _books = new ArrayList<>(8);
    }

    // I don't think having a direct getter/setter for _books is a good idea, but we can get individual books

    public Book getBook(int index) {
        return _books.get(index);
    }

    public char getLetter() {
        return _letter;
    }

    public void setLetter(char letter) {
        _letter = letter;
    }

    public void addBook(Book book) {
        if (book.toString().charAt(0) == _letter) {
            _books.add(book);
        }
    }

    public void removeBook(int index) {
        _books.remove(index);
    }

    @Override
    public String toString() {
        if (_books.isEmpty()) {
            return "Empty";
        }
        String outStr = "";
        for (int i = 0; i < _books.size(); i++) {
            outStr += _books.get(i) + "   ";
        }
        return outStr;
    }
}
