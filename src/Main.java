public class Main {
    public static void main(String[] args) {
        Author levTolstoi = new Author("Лев", "Толстой");
        Author AleksandrGrin = new Author("Александр", "Грин");

        Books warAndPeace = new Books(levTolstoi, "Война и мир", 1867);
        Books scarletSails = new Books(AleksandrGrin, "Алые паруса", 1923);

        warAndPeace.setPublishingYear(2022);
        scarletSails.setPublishingYear(2022);

        Books[] books = {warAndPeace, scarletSails};
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        System.out.println("Что-то не так!");

        warAndPeace.setPublishingYear(1867);
        scarletSails.setPublishingYear(1923);
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        if (warAndPeace.equals(scarletSails)) {
            System.out.println("Книги разные");
        } else {
            System.out.println("книги отличаются");
        }

    }
}