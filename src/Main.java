public class Main {

    public static void main(String[] args) {

        Book oneBook = new Book();
        oneBook.bookName = "Война и Мир";
        oneBook.setPublishingYear(1867);

        Author oneBook1 = new Author();
        oneBook1.authorName = "Лев";
        oneBook1.authorSecondName = "Толстой";

        Book secondBook = new Book();
        secondBook.bookName = "Алые паруса";
        secondBook.setPublishingYear(1923);

        Author secondBook1 = new Author();
        secondBook1.authorName = "Александр";
        secondBook1.authorSecondName = "Грин";


        System.out.println("Автор - " + secondBook1.getAuthorName() + " " + secondBook1.getAuthorSecondName());
        System.out.println("Название - " + secondBook.bookName);
        System.out.println("Год - " + secondBook.getPublishingYear());
    }

}