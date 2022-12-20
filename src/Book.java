public class Book {

    private Author authorName;
    private Author authorSecondName;
    String bookName;
    int publishingYear;

    public Author getAuthorName() {
        return authorName;
    }

    public Author getAuthorSecondName() {
        return authorSecondName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }


}