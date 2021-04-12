package LessonHome;

public class Book {
    //Книга: название, авторы, количество страниц, год издания (int);
    private String title;
    private int pageCount;
    private int year;
    private Author[] authors; //так как авторов несколько,то делаем массив

    public Book (String title, int authorCount){ //конструктор - книга обязательно должна создаваться с авторами и названием
        this.title = title;
        authors = new Author[authorCount]; //массив авторов, кто написал книгу
    }

    public void setPageCount(int pageCount) { //сеттеры не обязательные параметры, программа не сломается
        this.pageCount = pageCount;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void addAuthor(Author author) {
        for (int i = 0; i < authors.length; i++) {
            if (authors[i] == null) {
                authors[i] = author;
                return;
            }
        }
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getYear() {
        return year;
    }

    public Author[] getAuthors() {
        return authors;

    }

}