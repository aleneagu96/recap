package advanced.collections;

import java.util.*;

public class Library {

    public Map<Genre, Set<Book>> bookShelf;

    public void initWithDefaultBooks() {
        bookShelf = new HashMap<Genre, Set<Book>>(); //init hashmap

        Book drama1 = new Book("GG", "Great Gatsby", Genre.DRAMA, 2001);
        final Book horror1 = new Book("MS", "Frankenstein", Genre.HORROR, 1987);
        Book science1 = new Book("FH", "Dune", Genre.SCIENCE, 1996);

        //1
        Set<Book> dramaSection = new HashSet<Book>();
        dramaSection.add(drama1);
        bookShelf.put(Genre.DRAMA, dramaSection);

        //2
        bookShelf.put(horror1.getGenre(), new HashSet<Book>() {{
            add(horror1);
        }});

        //3
        bookShelf.put(science1.getGenre(), new HashSet<Book>(Arrays.asList(science1)));

    }

    public Map<Genre, Set<Book>> getBookShelf() {
        return bookShelf;
    }

    public void setBookShelf(Map<Genre, Set<Book>> bookShelf) {
        this.bookShelf = bookShelf;
    }

    public Library() {
       initWithDefaultBooks();
    }

}
