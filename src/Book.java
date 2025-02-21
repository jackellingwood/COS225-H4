public class Book {
    private final String _title; // final because vscode said so
    private final String _genre; // final because vscode said so
    
    public Book(String title, String genre) {
        _title = title;
        _genre = genre;
    }

    public String getTitle() {
        return _title;
    }

    public String getGenre() {
        return _genre;
    }

    @Override
    public String toString() {
        return getTitle();
    }
}
