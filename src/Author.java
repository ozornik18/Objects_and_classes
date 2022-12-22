import java.util.Objects;

public class Author {
    private String authorName;
    private String authorSecondName;

    public Author(String authorName, String authorSecondName) {
        this.authorName = authorName;
        this.authorSecondName = authorSecondName;
    }

    public String toString() {
        return "автор книги - " + authorSecondName + ' ' + authorName;
    }

    public String getName() {
        return authorName;
    }
    public String getSurname() {
        return authorSecondName;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorName.equals(author.authorName) && authorSecondName.equals(author.authorSecondName);
    }

    public int hashCode() {
        return Objects.hash(authorName, authorSecondName);
    }
}
