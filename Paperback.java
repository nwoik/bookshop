public class Paperback implements Book{
    /**
     * Every instance of Paperback is created through ConcreteBook
     * All the methods are called from ConcreteBook
     */
    private final Author author;
    private final Title title;
    private final double duration;
    private final Book Paperback;

    public Paperback(final Author author, final Title title, final double duration) {
        this.author = author;
        this.title = title;
        this.duration = duration;
        this.Paperback = new ConcreteBook(title, author, duration, "Paperback");
    };

    @Override
    public double duration() {
        return this.Paperback.duration();
    }

    @Override
    public Title title() {
        // returns the title of the book
        return this.Paperback.title();
    };

    @Override
    public Author author() {
        // returns the author object
        return this.Paperback.author();
    };

    @Override
    public float price() {
        // returns the price of the book
        return this.Paperback.price();
    };

    @Override
    public String bookType() {
        // Returns the type of the book
        return this.Paperback.bookType();
    }  
};
