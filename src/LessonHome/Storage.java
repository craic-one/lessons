package LessonHome;

public class Storage {
    private Book[] books = new Book[20]; // массив
    private int num; //номер хранилища

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
    }

    public Book[] getBooks() {
        return books;
    }
}
