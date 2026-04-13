import java.util.ArrayList;
import java.util.Collections;

public class MainBook {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Book AB","Author Z",20.99));
        books.add(new Book("Book ACB","Author Y",17.99));
        books.add(new Book("Book AC","Author X",22.99));
        System.out.println(books);
        Collections.sort(books, new AuthorComparator());
        System.out.println(books);



    }
}
