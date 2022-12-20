public class Main {

    public static void main(String[] args) {

        Book OneBook = new Book();
        OneBook.authorFullName = "Л. Н.Толстой";
        OneBook.bookName = "Война и Мир";
        OneBook.publishingYear = 1867;

        Author OneBook1 = new Author();
        OneBook1.authorName = "Лев ";
        OneBook1.authorSecondName = "Толстой";

        Book secondBook = new Book();
        secondBook.authorFullName = "А. С. Грин";
        secondBook.bookName = "Алые паруса";
        secondBook.publishingYear = 1923;

        Author secondBook1 = new Author();
        secondBook1.authorName = "Александр ";
        secondBook1.authorSecondName = "Грин";


        System.out.println("Автор - " + secondBook.authorFullName);
        System.out.println("Название - " + secondBook.bookName);
        System.out.println("Год - " + secondBook.publishingYear);
    }

}