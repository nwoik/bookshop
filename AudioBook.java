public class AudioBook implements Book{
    /**
     * Every instance of Audiobook is created through ConcreteBook
     * All the methods are called from ConcreteBook
     */
    private final Author author;
    private final Title title;
    private final double duration;
    private final Book AudioBook;

    public AudioBook(final Author author, final Title title, final double duration) {
        this.author = author;
        this.title = title;
        this.duration = duration;
        this.AudioBook = new ConcreteBook(title, author, duration, "AudioBook");
    };

    @Override
    public double duration() {
        return this.AudioBook.duration();
    }

    @Override
    public Title title() {
        // returns the title of the book
        return this.AudioBook.title();
    };

    @Override
    public Author author() {
        // returns the author object
        return this.AudioBook.author();
    };

    @Override
    public float price() {
        // returns the price of the book
        return this.AudioBook.price();
    };

    @Override
    public String bookType() {
        // Returns the type of the book
        return this.AudioBook.bookType();
    }  
};
